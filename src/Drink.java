public class Drink extends Product implements Discountable {
    private boolean isCold;

    public Drink(String name, double price, boolean isCold) {
        super(name, price);
        this.isCold = isCold;
    }

    public boolean isCold() {
        return isCold;
    }

    @Override
    public String getInfo() {
        return getName() + " [" + (isCold ? "cold" : "hot") + "] - " + getPrice() + " UAH";
    }

    @Override
    public double applyDiscount(double percent) {
        return getPrice() - (getPrice() * percent / 100.0);
    }
}
