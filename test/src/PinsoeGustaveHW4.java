
public class PinsoeGustaveHW4 {
    public static void main(String[] args) {

//        Create an array of 10 items
        Item[] product =  new Item[10];
        product[0] = new Item("Laptop", 980.99);
        product[1] = new Item("Computer", 2330.12);
        product[2] = new Item("Mouse", 23.55);
        product[3] = new Item("Keyboard", 45.55);
        product[4] = new Item("Monitor", 143.69);
        product[5] = new Item("Headphones", 60.19);
        product[6] = new Item("Tablet", 450.00);
        product[7] = new Item("Smartphone", 670.04);
        product[8] = new Item("Webcam", 89.98);
        product[9] = new Item("Charger", 23.03);

//        Outer loop which counts from 1 to 10
        for (int x = 1; x <= 10; x++ ) {
//            Inner loop which goes through the items
            for (int y = 0; y < product.length; y++) {
                product[y].buy();
            }
        }

//        Printing each item after being bought
        for (int y = 0; y < product.length; y++) {
            System.out.println(product[y]);
        }
    }
}
