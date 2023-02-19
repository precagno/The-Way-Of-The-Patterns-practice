import java.util.Date;

public class Loan {

  private final CapitalStrategy strategy;
  private float notional;
  private float outstanding;
  private int rating;
  private Date start;
  private Date expiry;
  private Date maturity;

  //This is the constructor for the Term Loan. It takes 2 parameters
  public Loan(final float notional, final float outstanding, final int rating, final Date expiry) {

    this.baseConstructor(notional, rating, expiry);
    this.strategy = new TermLoanCapital();
    this.outstanding = outstanding;
  }

  //This is the constructor for the Revolver Loan. It takes 3 parameters
  public Loan(final float notional, final float outstanding, final int rating, final Date start,
      final Date expiry) {

    this.baseConstructor(notional, rating, expiry);
    this.strategy = new RevolverCapital();
    this.outstanding = outstanding;
    this.start = start;
  }

  //This is the constructor for the RCTL Loan. It takes 3 parameters
  public Loan(final float notional, final float outstanding, final int rating, final Date start,
      final Date expiry, final Date maturity) {

    this.baseConstructor(notional, rating, expiry);
    this.strategy = new RCTLCapital();
    this.outstanding = outstanding;
    this.start = start;
    this.maturity = maturity;
  }

  //TODO: Add a description for this constructor
  public Loan(final CapitalStrategy strategy, final float notional, final float outstanding,
      final int rating, final Date start, final Date expiry, final Date maturity) {

    this.baseConstructor(notional, rating, expiry);
    this.strategy = strategy;
    this.outstanding = outstanding;
    this.start = start;
    this.maturity = maturity;
  }

  private void baseConstructor(final float notional, final int rating, final Date expiry) {

    this.notional = notional;
    this.rating = rating;
    this.expiry = expiry;
  }
}