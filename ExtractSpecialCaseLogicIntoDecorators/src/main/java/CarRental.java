public abstract class CarRental {

  protected Model model;
  protected int rentedDays;

  protected CarRental(Model model, int rentedDays) {
    this.model = model;
    this.rentedDays = rentedDays;
  }

  protected float getBasePrice() {
    return (this.getModel().getPrice() * this.getDaysRented());
  }

  protected abstract float calcPrice();

  protected int getDaysRented() {
    return rentedDays;
  }

  protected Model getModel() {
    return model;
  }
}
