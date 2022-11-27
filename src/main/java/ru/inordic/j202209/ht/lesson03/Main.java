package ru.inordic.j202209.ht.lesson03;

import java.util.Scanner;

public class Main {
    // add newLine
    public static void main(String[] args) {

        String result = "N/A";
        boolean testOperetion = true;
        int operations;
        String[] resultMassiv = new String[5];


        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < 5; j ++) {
            System.out.println("Введите код операции (0 - математические, 1 - логические, 2 - побитовые, 3 - операции сдвига, 4 - работы с float(только математические), 5 - boolean, другое число прирывает работу программы");
            operations = sc.nextInt();
            // Математические операции

            switch (operations) {
                case 0:
                LassonMath lMath = new LassonMath();
                result = lMath.lassonMath();
                testOperetion = lMath.getStatusResult();
                break;
            // Логические операции

                case 1:
                    LessonLogical lesLogInt = new LessonLogical();
                    result = lesLogInt.lessonLogical();
                    testOperetion = lesLogInt.getStatusResult();
                    break;
            // Побитовые операции

                case 2:
                    LassonPobit lPobit = new LassonPobit();
                    result = lPobit.lassonPobit();
                    testOperetion = lPobit.getStatusResult();
                    break;
            // Операции сдвига

                case 3:
                    LessonDvig lDvig = new LessonDvig();
                    result = lDvig.lessonDvig();
                    testOperetion = lDvig.getStatusResult();
                    break;
            // Операция работы с float математические

                case 4:
                    LassonMath lasMathF = new LassonMath();
                    result = lasMathF.lassonMathF();
                    testOperetion = lasMathF.getStatusResult();
                    break;
            // Операции Boolean

                case 5:
                    LessonLogical lassonLogB = new LessonLogical();
                    result = lassonLogB.lessonLogicalB();
                    testOperetion = lassonLogB.getStatusResult();
                    break;
            // Ничего не выбрано

                default:
                    testOperetion = true;
            }
            resultMassiv[j] = result;
            if (!testOperetion) {
                System.out.println("Результат: ");
                System.out.println(result);
            }
        }

        int nextChois = 1;
        do {
            Scanner scResult = new Scanner(System.in);
            System.out.println("Посмотреть результаты работы программы? 0 - NO / 1 - YES");
            int chus = scResult.nextInt();

            switch (chus) {
                case 1:
                    System.out.println("Какой элемент показать? 1-5 - элемент, 0 - показать все, любой другой ввод выход из программы");
                    int chusYes = scResult.nextInt();
                    if (chusYes > 0 && chusYes < 6) {
                        System.out.println("Результат: ");
                        System.out.println(resultMassiv[chusYes - 1]);
                    } else if (chusYes == 0) {
                        for (int f = 0; f < resultMassiv.length; f++) {
                            System.out.println((f + 1) + " результат = " + resultMassiv[f]);
                        }
                    } else {
                        nextChois = 0;
                    }
                    break;
                default:
                    nextChois = 0;
                    break;
            }
        } while (nextChois == 1);
    }
}
