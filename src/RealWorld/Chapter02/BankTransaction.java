package RealWorld.Chapter02;

import java.time.LocalDate;
import java.util.Objects;

public class BankTransaction {
    private final LocalDate date;
    private final double amount;

    private final String dec;

    public BankTransaction(LocalDate date, double amount, String dec) {
        this.date = date;
        this.amount = amount;
        this.dec = dec;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDec() {
        return dec;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "date=" + date +
                ", amount=" + amount +
                ", dec='" + dec + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankTransaction that = (BankTransaction) o;
        return Double.compare(that.amount, amount) == 0 && Objects.equals(date, that.date) && Objects.equals(dec, that.dec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amount, dec);
    }
}
