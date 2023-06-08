public class PurchaseItem {
    private String name;
    private double unitPrice;

    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public PurchaseItem() {
        this.name = "no item";
        this.unitPrice = 0;
    }

    public double getPrice() {
        return unitPrice;
    }

    public String getName() {
        return name;
    }
}
