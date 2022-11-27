package ru.inordic.j202209.ht.lesson03;

import java.util.Scanner;

public class LassonMath {
    // add newLine
    private boolean errorOperation;

    public String lassonMath() {
        int result = 0;
        String resultString = "N/A";
        int z = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int inA = sc.nextInt();

        System.out.println("Введите второе число: ");
        int inB = sc.nextInt();

        System.out.println("Введите код операции (0 - сумма, 1 - разность, 2 - произведение, 3 - деление, любое другое значение выйти");
        int inOperation = sc.nextInt();

        do {
            if (inB == 0 && inOperation == 3) {
                System.out.println("Значение делителя не может быть = 0, введите второе значение повторно");
                System.out.println("Введите делитель: ");
                inB = sc.nextInt();
            } else {
                z = 1;
            }
        } while (z != 1);
        // test operation
        if (inOperation >= 0 && inOperation < 4) {
            errorOperation = false;
            switch (inOperation) {
                case 0:
                    result = inA + inB;
                    break;
                case 1:
                    result = inA - inB;
                    break;
                case 2:
                    result = inA * inB;
                    break;
                case 3:
                    result = inA / inB;
                    break;
            }
            return resultString = String.valueOf(result);
        } else {
            errorOperation = true;
            return resultString;
        }
    }


    public boolean getStatusResult() {
        this.errorOperation = errorOperation;
        return errorOperation;
    }



    public String lassonMathF() {

        Scanner sc = new Scanner(System.in);

        int error = 1;
        float inAF;
        float inBF;
        int inOperationF;
        float resultF = 0;

        System.out.println("Введите первое число float: ");
        inAF = sc.nextFloat();
        System.out.println("Введите второе число float: ");
        inBF = sc.nextFloat();
        System.out.println("Введите код операции (0 - сумма, 1 - разность, 2 - произведение, 3 - деление, любое число запустить программу снова");
        inOperationF = sc.nextInt();
        do {
            if (inBF == 0 && inOperationF == 3) {
                System.out.println("Значение делителя не может быть = 0, введите второе значение повторно");
                System.out.println("Введите делитель: ");
                inBF = sc.nextInt();
            } else {
                error = 0;
            }
        } while (error == 1);

        if (inOperationF >= 0 && inOperationF < 4) {
            errorOperation = false;
            switch (inOperationF) {
                case 0:
                    resultF = inAF + inBF;
                    break;
                case 1:
                    resultF = inAF - inBF;
                    break;
                case 2:
                    resultF = inAF * inBF;
                    break;
                case 3:
                    resultF = inAF / inBF;
                    break;
        }
        } else {
            errorOperation = true;
            }
        return String.valueOf(resultF);
    }


}
