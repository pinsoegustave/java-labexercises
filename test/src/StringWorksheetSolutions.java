public class StringWorksheetSolutions {

    public String beginToEnd(String str) {

//        Handle the empty string case
        if (str.length() == 0) return "";
//        Break the string apart
        String first = str.substring(0,1);
        String rest = str.substring(1);

//        Put the string back together and reverse the parts
//        Return the new string

        return rest + first;
    }
}
