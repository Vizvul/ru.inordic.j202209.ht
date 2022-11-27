package practice.strings;

public class Main {
    public static void main(String[] args) {

        String test1 = "+7 909 123-45-67";
        String test2 = "+7 (909) 1234567";
        String test3 = "8-905-1234567";
        String test4 = "9-453-1234567";
        String test5 = "8-905-123";
        String test6 = "905-1234567";
        String test7 = "8-905-12345672342";



        PhoneCleanerRegex word = new PhoneCleanerRegex();
        System.out.println(word.phoneCleanRegex(test1));
        System.out.println(word.phoneCleanRegex(test2));
        System.out.println(word.phoneCleanRegex(test3));
        System.out.println(word.phoneCleanRegex(test4));
        System.out.println(word.phoneCleanRegex(test5));
        System.out.println(word.phoneCleanRegex(test6));
        System.out.println(word.phoneCleanRegex(test7));

    }
}
