public class CarRentalWithInsurance extends CarRental {

  private float insuranceRate;

  public CarRentalWithInsurance(Model model, int rentedDays, float insuranceRate) {
    super(model, rentedDays);
    setInsuranceRate(insuranceRate);
  }

  public void setInsuranceRate(float insuranceRate) {
    this.insuranceRate = insuranceRate;
  }

  @Override
  public float calcPrice() {
    float price = this.getBasePrice();
    price += getInsuranceAmount();

    return price;
  }

  private float getInsuranceAmount() {
    return insuranceRate * getDaysRented();
  }
}
