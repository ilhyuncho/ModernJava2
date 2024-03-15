package RealWorld.Chapter02;

import java.time.Month;

public class BankTranscationIsInFebruaryAndExpensive implements BankTransactionFilter {
    @Override
    public boolean test(BankTransaction bankTransaction) {
        return bankTransaction.getDate().getMonth().equals(Month.JANUARY);
    }
}
