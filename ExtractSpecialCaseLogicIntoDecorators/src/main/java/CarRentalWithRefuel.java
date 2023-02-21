public class CarRentalWithRefuel extends CarRental {

  private float fuelConsumed;
  private float refuelPrice;

  protected CarRentalWithRefuel(Model model, int rentedDays, float fuelConsumed,
      float refuelPrice) {
    super(model, rentedDays);
    this.setFuelConsumed(fuelConsumed);
    this.setRefuelOnReturn(refuelPrice);
  }

  public void setFuelConsumed(float amount) {
    fuelConsumed = amount;
  }

  public void setRefuelOnReturn(float pricePerGallon) {
    refuelPrice = pricePerGallon;
  }

  public float getFuelConsumed() {
    return fuelConsumed;
  }

  private float refuelPrice() {
    return (getModel().getFuelCapacity() - getFuelConsumed()) * refuelPrice;
  }

  @Override
  public float calcPrice() {
    float price = this.getBasePrice();
    price += refuelPrice();

    return price;
  }
}
