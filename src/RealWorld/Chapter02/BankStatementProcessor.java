package RealWorld.Chapter02;

import java.time.Month;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class BankStatementProcessor {

    private final List<BankTransaction> bankTransactions;

    public BankStatementProcessor(final List<BankTransaction> list) {
        this.bankTransactions = list;
    }

    public double summarizeTransactions(final BankTransactionSummarizer summarizer) {
        double result = 0d;

        for (BankTransaction bankTransaction : bankTransactions) {
            result = summarizer.summarize(result, bankTransaction);
        }
        return result;
    }

    public double calculateTotalInMonthNew(final Month month) {
        return summarizeTransactions((acc, bankTransaction) ->
                bankTransaction.getDate().getMonth().equals(month) ? acc + bankTransaction.getAmount() : acc
        );
    }
    public double calculateTotalAmountNew() {
        double total = 0d;

        return summarizeTransactions((acc, bankTransaction) -> acc + bankTransaction.getAmount());

    }
//    public double calculateTotalInMonth(final Month month) {
//        double total = 0d;
//
//        for (BankTransaction bankTransaction : bankTransactions) {
//            if (bankTransaction.getDate().getMonth().equals(month)) {
//                total += bankTransaction.getAmount();
//            }
//        }
//        return total;
//    }
//    public double calculateTotalAmount() {
//        double total = 0d;
//
//        for (BankTransaction bankTransaction : bankTransactions) {
//            total += bankTransaction.getAmount();
//        }
//
//        return total;
//    }



    public List<BankTransaction> findTransactions(final BankTransactionFilter bankTransactionFilter) {
        List<BankTransaction> result = new ArrayList<>();

        for (BankTransaction bankTransaction : bankTransactions) {

            if (bankTransactionFilter.test(bankTransaction)) {
                result.add(bankTransaction);
            }
        }
        return result;
    }

//    public List<BankTransaction> findTransactionsGreaterThanEqual(final int amount) {
//        List<BankTransaction> result = new ArrayList<>();
//
//        for (BankTransaction bankTransaction : bankTransactions) {
//
//            if (bankTransaction.getAmount() >= amount) {
//                result.add(bankTransaction);
//            }
//        }
//        return result;
//    }
//
//    public List<BankTransaction> findTransactionsInMonth(final Month month) {
//        List<BankTransaction> result = new ArrayList<>();
//
//        for (BankTransaction bankTransaction : bankTransactions) {
//
//            if(bankTransaction.getDate().getMonth().equals(month)){
//                result.add(bankTransaction);
//            }
//        }
//        return result;
//    }


}