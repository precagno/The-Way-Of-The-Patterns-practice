import java.util.Date;

public class LoanFactory {

  public static Loan newAdvisor(final double notional, final Date start,
      final Date maturity, final int rating) {
    return new Loan(notional, start, null, maturity, rating, new TermLoanCapital());
  }

  public static Loan newLetterOfCredit(final double notional, final Date start,
      final Date maturity, final int rating) {
    return new Loan(notional, start, null, maturity, rating, new TermLoanCapital());
  }

  public static Loan newRCTL(final double notional, final Date start,
      final Date expiry, final Date maturity, final int rating) {
    return new Loan(notional, start, expiry, maturity, rating, new RCTLCapital());
  }

  public static Loan newRevolver(final double notional, final Date start,
      final Date expiry, final int rating) {
    return new Loan(notional, start, expiry, null, rating, new RevolverCapital());
  }

  public static Loan newSPLC(final double notional, final Date start,
      final Date maturity, final int rating) {
    return new Loan(notional, start, null, maturity, rating, new TermLoanCapital());
  }

  public static Loan newTermLoan(final double notional, final Date start,
      final Date maturity, final int rating) {
    return new Loan(notional, start, null, maturity, rating, new TermLoanCapital());
  }

  public static Loan newVariableLoan(final double notional, final Date start,
      final Date expiry, final Date maturity, final int rating) {
    return new Loan(notional, start, expiry, maturity, rating, new RCTLCapital());
  }
}
