package ru.inordic.j202209.ht.lesson03;

import java.util.Scanner;

public class LessonDvig {
// add newLine
    private boolean errorOperation = false;

    public String lessonDvig() {

        Scanner sc = new Scanner(System.in);
        int inA;
        int inB;
        int inOperation;
        String result = "N/A";
        Boolean testOperetion;

        System.out.println("Введите число: ");
        inA = sc.nextInt();
        System.out.println("на сколько осущетсвить операцию сдвига?");
        inB = sc.nextInt();
        System.out.println("Операция сдвига: 0 - влево, 1 - вправо:");
        inOperation = sc.nextInt();
        switch (inOperation) {
            case 0:
                result = String.valueOf(inA << inB);
                break;
            case 1:
                result = String.valueOf(inA >> inB);
                break;
            default:
                this.errorOperation = true;
    }
        return result;
    }

    public boolean getStatusResult() {
        return this.errorOperation = errorOperation;
    }

}
