public class StringsPractice {

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
}
