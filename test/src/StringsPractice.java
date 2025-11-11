public class StringsPractice {

    int sum = 0;
    int minus = 0;

    public String beginToEnd(String str) {
        String getFirst = str.substring(0, 1);
        String getSecond = str.substring(2);

        return getSecond + getFirst;
    }

    public String endToBring(String str) {
        int index = str.length() - 1;
        String lastChar = str.substring(index);
        String firstString = str.substring(0, index);

        return lastChar + firstString;
    }

    public int addSubtractArray(int[] addArray, int[] subtractArray) {
//        loop for first array and add up the elements
        for (int x: addArray) {
            sum += x;
        }
            System.out.println("sum equals: "+ sum);

//        loop for second array and subtract all elements
        for (int y : subtractArray) {
            minus -= y;
        }
            System.out.println("minus equals: "+ minus);

        return sum + minus;
    }
}
