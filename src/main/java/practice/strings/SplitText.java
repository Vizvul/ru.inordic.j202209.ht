package practice.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitText {

    public String postorkam(String interString){
        String result = "";
        String regex = "[a-zA-Z]+[^,!?\\s]+";

        int start;
        int end;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(interString);

        while (matcher.find()){
            start = matcher.start();
            end = matcher.end();
            result = result + interString.substring(start,end) + System.lineSeparator();
        }
        return result;
    }
}
