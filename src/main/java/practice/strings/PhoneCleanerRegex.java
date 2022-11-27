package practice.strings;

public class PhoneCleanerRegex {

    public String phoneCleanRegex(String interString){
        String result = "";
        String regex = "[^0-9]";
        String resultRegex = interString.replaceAll(regex,"");
        char[] resultArrey = resultRegex.toCharArray();

        switch (resultArrey.length) {
            case 10:
                result = result + "7" + formatirovsnie(resultArrey);
                break;
            case 11:
                if (resultArrey[0] == '7' || resultArrey[0] == '8') {
                    resultArrey[0] = '7';
                    result = result + formatirovsnie(resultArrey);
                } else {
                    result = "Неверный формат номера";
                }
                break;
            default:
                result = "Неверный формат номера";
        }
        return result;
    }

    public static String formatirovsnie (char[] arreyInter) {
        String resultArrey = "";
        for (int i = 0; i <arreyInter.length; i++) {
            resultArrey = resultArrey + arreyInter[i];
        }
        return resultArrey;
    }
}


