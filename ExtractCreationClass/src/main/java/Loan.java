import java.util.Date;

public class Loan {

  private double notional;
  private Date start;
  private Date expiry;
  private Date maturity;
  private int rating;
  private CapitalStrategy capitalStrategy;
  private double outstanding;

  protected Loan(final double notional, final Date start, final Date expiry,
      final Date maturity, final int riskRating, final CapitalStrategy strategy) {
    this.notional = notional;
    this.start = start;
    this.expiry = expiry;
    this.maturity = maturity;
    this.rating = riskRating;
    this.capitalStrategy = strategy;
  }

  public double calcCapital() {
    return capitalStrategy.calc(this);
  }

  public void setOutstanding(double newOutstanding) {
    outstanding = newOutstanding;
  }

  public Double getNotional() {
    return this.notional;
  }
}
