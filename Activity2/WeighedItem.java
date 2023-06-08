public class WeighedItem extends PurchaseItem {
    private double weight;

    public WeighedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * weight;
    }
}
