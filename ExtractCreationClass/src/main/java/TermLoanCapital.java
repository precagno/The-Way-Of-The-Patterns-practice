public class TermLoanCapital implements CapitalStrategy {

  @Override
  public double calc(Loan loan) {
    return loan.getNotional() * loan.getNotional();
  }
}
