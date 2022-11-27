package practice.strings;

public class SequentialWordsNumbers {

    public String sequentialWordsNumbers(String inter){
        String result = "(1) ";
        Boolean endString = false;
        Boolean probel = false;
        int number = 2;
        for (int i = 0; i < inter.length(); i++) {
            if (inter.charAt(i) == ' ' ) {
                if (!probel) {
                    probel = true;
                }
            } else if (probel) {
                number++;
                result = result + " (" + number + ") ";
                result = result + inter.charAt(i);
                probel = false;
            } else {
                result = result + inter.charAt(i);
            }
        }
        return result;
    }
}
