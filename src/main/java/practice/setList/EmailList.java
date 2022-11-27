package practice.setList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    public static void main(String[] args) {
        HashSet<String> emailSetList = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String regex = "[a-zA-Z0-9]+[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,}";

        for (int i = 0; i < 5; i++) {
            System.out.println("Viberite deisstvie: \n\tADD adres pocti (dobavlyaet novii adres)\n\tLIST - pokazivaet vse adresa");
            String newEmail = scanner.nextLine();
            if(newEmail.startsWith("ADD")){
                newEmail = newEmail.substring(4);
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(newEmail);
                if (matcher.matches()){
                    newEmail = newEmail.substring(matcher.start(), matcher.end());
                    emailSetList.add(newEmail);
                    System.out.println("Email *" + newEmail + "* uspeshno dobabvlen v bazu");
                } else {
                    System.out.println("Oshibka v adrese" + newEmail + "* ispravte ne dobavlen v bazu");
                }
            }
            if(newEmail.startsWith("LIST")){
                for(String result : emailSetList){
                    System.out.println(result);
                }
                System.out.println("Vsego: " + emailSetList.size() + " adresov");
            }
        }

    }



}
