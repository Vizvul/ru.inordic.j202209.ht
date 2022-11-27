package ru.inordic.j202209.ht.lesson03;

import java.util.Scanner;

public class LassonPobit {

    private static boolean errorOperation = false;
// add newLine

    public static String lassonPobit() {
        String result = "";
        Scanner sc = new Scanner(System.in);
        int inA;
        int inB;

        System.out.println("Выберите операцию: 0 - побитовый оператор “НЕ”, 1 - побитовый оператор “И”, 2 - побитовое “ИЛИ”, 3 - побитовое исключающее “ИЛИ”, любое другое число войти заново");
        int operations = sc.nextInt();
        if (operations == 0) {
            System.out.println("Введите число: ");
            inA = sc.nextInt();
            result = Integer.toBinaryString(~inA);
        } else if (operations > 0 && operations < 4){
            System.out.println("Введите число: ");
            inA = sc.nextInt();
            System.out.println("Введите число: ");
            inB = sc.nextInt();
            switch (operations) {
                case 1:
                    result = Integer.toBinaryString(inA & inB);
                    break;
                case 2:
                    result = Integer.toBinaryString(inA | inB);
                    break;
                case 3:
                    result = Integer.toBinaryString(inA ^ inB);
                    break;
            }
        } else {
            errorOperation = true;
        }
        return result;
    }

    public boolean getStatusResult() {
        return this.errorOperation = errorOperation;
    }
}
