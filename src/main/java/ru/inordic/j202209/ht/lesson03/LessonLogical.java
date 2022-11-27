package ru.inordic.j202209.ht.lesson03;

import java.util.Scanner;

public class LessonLogical {
    // add newLine
    private boolean errorOperation = false;

    public static String lessonLogical() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int inA = sc.nextInt();
        System.out.println("Введите второе число: ");
        int inB = sc.nextInt();
        if (inA > inB) {
            return "Первое (" + inA + ") больше второго (" + inB + ") числа";
        } else if (inA < inB) {
            return "Первое (" + inA + ") меньше второго (" + inB + ") числа";
        } else {
            return "Первое (" + inA + ") равно второму (" + inB + ") числу";
        }
    }

    public String lessonLogicalB() {

        Scanner sc = new Scanner(System.in);

        boolean inAB = false;
        boolean inBB = false;
        int operationB;
        int error = 1;
        boolean result = false;


        do {
            System.out.println("Введите первое значение true or false: ");
            String aS = sc.next();
            if (aS.equals("true")) {
                inAB = true;
                error = 0;
            } else if (aS.equals("false")) {
                inAB = false;
                error = 0;
            } else {
                System.out.println("ВВедены не корректные данные - следует ввести true или false");
                error = 1;
            }
        } while (error == 1);
        error = 1;

        do {
            System.out.println("Введите второе значение true or false: ");
            String bS = sc.next();

            if (bS.equals("true")) {
                inBB = true;
                error = 0;
            } else if (bS.equals("false")) {
                inBB = false;
                error = 0;
            } else {
                System.out.println("ВВедены не корректные данные - следует ввести true или false");
                error = 1;
            }
        } while (error == 1);

        System.out.println("Введите код операции (0 - И, 1 - ИЛИ, 2 - логическое исключающее ИЛИ, любое другое число выйти из программы)");
        operationB = sc.nextInt();
        if (operationB >= 0 && operationB <= 2) {
            errorOperation = false;
            switch (operationB) {
                case 0:
                    result = inAB && inBB;
                    break;
                case 1:
                    result = inAB || inBB;
                    break;
                case 2:
                    result = inAB ^ inBB;
                    break;
            }
        } else {
            errorOperation = true;
        }
        return String.valueOf(result);
    }

    public boolean getStatusResult() {
        this.errorOperation = errorOperation;
        return errorOperation;
    }

}
