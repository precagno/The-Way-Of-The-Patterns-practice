public class RevolverCapital implements CapitalStrategy {

  private static final int NOTIONAL_CALCULATION_FOR_REVOLVER_CAPITAL = 2;

  @Override
  public double calc(Loan loan) {
    return loan.getNotional() / NOTIONAL_CALCULATION_FOR_REVOLVER_CAPITAL;
  }
}
