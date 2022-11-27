package practice.java_NumbersAndDates;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

import static java.time.temporal.ChronoUnit.YEARS;

public class Birthdays {


    public static String collectBirthdays(int year, int month, int day){
        LocalDate todayYear = LocalDate.now();
        LocalDate birthday = LocalDate.of(year,month,day);
        String result = "";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE", Locale.ENGLISH);
        int whayLong = (int)birthday.until(todayYear, YEARS);
        for (int i = 0; i <= whayLong; i++) {
            result = result + i + " - " + formatter.format(birthday.plusYears(i)) + System.lineSeparator();
        }
    return result;
    }

}
