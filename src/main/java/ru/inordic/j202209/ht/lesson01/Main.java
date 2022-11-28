package ru.inordic.j202209.ht.lesson01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("ВВедите второе число: ");
        int b = sc.nextInt();
        int result = a - b;
        if (result < 0) {
            System.out.println("Разница двух чисел меньше нуля и равна: " + result);
        } else if (result > 0) {
            System.out.println("Разница двух чисел больше нуля и равна: " + result);
        } else {
            System.out.println("Разница двух чисел равна нулю! ");
        }
        // Добавляю здесь комментарии для выгрузки
    }
}
