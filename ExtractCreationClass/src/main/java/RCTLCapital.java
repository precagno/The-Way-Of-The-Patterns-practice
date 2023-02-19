public class RCTLCapital implements CapitalStrategy {

  private static final int NOTIONAL_CALCULATION_FOR_RCTL_CAPITAL = 3;

  @Override
  public double calc(Loan loan) {
    return loan.getNotional() * NOTIONAL_CALCULATION_FOR_RCTL_CAPITAL;
  }
}
