package ru.inordic.j202209.ht.lesson10;

public class MaxFinder {

    public int maxFind(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException();
        }
        int a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (a < arr[i]) {
                a = arr[i];
            }
        }
        return a;
    }

}
