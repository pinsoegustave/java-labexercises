public class PinsoeGustaveHW4 {
    public static void main(String[] args) {

//        Testing my Item Class
        Item ball = new Item("fifaa", 34.9);
        Item cleats = new Item("nike", 87.45);
        Item jersey = new Item("Adidas", 104.88);

        ball.buy();
        ball.buy();
        ball.buy();
        ball.buy();
        System.out.println("After buying 4 balls: "+ ball);

        for (int i = 0; i < 5; i++) {
            cleats.buy();
        }
        System.out.println(cleats);

        for (int i = 0; i < 10; i++) {
            jersey.buy();
        }
        System.out.println(jersey);
    }
}
