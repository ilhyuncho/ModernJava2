package RealWorld.Chapter02;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankTransationAnalyzerSample {

    private static final String RESOURCES = "src/RealWorld/Chapter02/";

    public static void main(String[] args) throws IOException, CSVSyntacException {

        String fileName = args[0];

        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        analyze(fileName, bankStatementParser);
    }

    public static void analyze(final String fileName, final BankStatementParser bankStatementParser) throws IOException, CSVSyntacException {

        final Path path = Paths.get(RESOURCES + fileName);

        final List<String> lines = Files.readAllLines(path);

        // 입출금 내역 전체 가져옴
        List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);


        BankStatementProcessor processor = new BankStatementProcessor(bankTransactions);

        // 전체 내역 합계
        double totalAmount = processor.calculateTotalAmountNew();
        System.out.println(totalAmount);

        // 1울 입출금 내역 합계 계산하기
        double janAmount = processor.calculateTotalInMonthNew(Month.of(1));
        System.out.println(janAmount);

        // 1.함수형 인터페이스 활용
        //List<BankTransaction> transactions = processor.findTransactions(new BankTranscationIsInFebruaryAndExpensive());

        // 2.람다 형식으로 변경
        List<BankTransaction> transactions = processor.findTransactions
                (a-> a.getDate().getMonth().equals(Month.JANUARY));


        transactions.forEach(System.out::println);
    }

}
