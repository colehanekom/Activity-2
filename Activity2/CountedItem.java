public class CountedItem extends PurchaseItem {
    private int quantity;

    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * quantity;
    }
}
