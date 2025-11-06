public class Item {
//    Instance variables
    private String name;
    private double basePrice;
    private int numSold;
    private double totalAmount;

//    Constructor
    public Item (String argName, double argBasePrice) {
        name = argName;
        basePrice = argBasePrice;
        numSold = 0;
        totalAmount = 0;
    }

//    Buy method that will increment product quantity sold.
    public void buy() {
        numSold++;

        if (Math.random() < 0.25) {
            totalAmount += basePrice / 2.0;
        }
        else {
            totalAmount += basePrice;
        }
    }

    public String toString() {
        return String.format("%s: Number Sold (%d) Total Amount ($%.2f)", name, numSold, totalAmount);
    }

//    Accessor methods
    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

}
