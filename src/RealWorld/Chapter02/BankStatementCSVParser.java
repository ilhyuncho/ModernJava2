package RealWorld.Chapter02;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCSVParser implements  BankStatementParser{

    final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    final int EXPECTED_ATTRIBUTES_LENGH = 3;
    public BankTransaction parseFrom(final String line) throws CSVSyntacException {
        final String[] columes = line.split(",");

        if (columes.length < EXPECTED_ATTRIBUTES_LENGH) {
            throw new CSVSyntacException();
        }

        final String monthValue = columes[0];
        // 날짜 포맷 - LocalDate.parse
        LocalDate date = LocalDate.parse(monthValue, dateTimeFormatter);

        final double amount = Integer.parseInt(columes[1]);
        final String desc = columes[2];

        return new BankTransaction(date, amount, desc);
    }

    public List<BankTransaction> parseLinesFrom(final List<String> lines) throws CSVSyntacException {

        final List<BankTransaction> list = new ArrayList<>();

        for( final String line :lines){

            BankTransaction bankTransaction = parseFrom(line);
            list.add(bankTransaction);
        }
        return list;
    }
}
