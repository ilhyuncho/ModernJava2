package RealWorld.Chapter02;

import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFrom(final String line) throws CSVSyntacException;

    List<BankTransaction> parseLinesFrom(final List<String> lines) throws CSVSyntacException;
}
