public class Main {
    public static void main(String[] args) {
        WeighedItem weighedItem = new WeighedItem("Banana", 3.00, 1.37);
        System.out.println(weighedItem.getName() + " @ " + weighedItem.getPrice() + " (for 1 Kg)");
        System.out.println("Weight: " + weighedItem.getWeight() + " Kg");
        System.out.println("Total Price: R" + weighedItem.getPrice());

        CountedItem countedItem = new CountedItem("Pens", 4.5, 10);
        System.out.println(countedItem.getName() + " @ " + countedItem.getPrice() + " (per unit)");
        System.out.println("Quantity: " + countedItem.getQuantity() + " units");
        System.out.println("Total Price: R" + countedItem.getPrice());
    }
}
