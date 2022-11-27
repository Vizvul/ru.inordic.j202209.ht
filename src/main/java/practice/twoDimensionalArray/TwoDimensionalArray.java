package practice.twoDimensionalArray;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        char[][] test = getTwoDimensionalArray(sizeArray);
        System.out.println(getTwoDimensionalArray(test));

    }
    public static char[][] getTwoDimensionalArray(int size) {
        char[][] result = new char[size][size];
        int buffer = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == buffer || j == size-1-buffer){
                    result[i][j] = 'X';
                } else {
                    result[i][j] = ' ';
                }
            }
                buffer++;
        }
       return result;
    }

    public static String getTwoDimensionalArray(char[][] interCharArray){
        String result = "";
        for (int i = 0; i < interCharArray.length; i++) {
            for (int j = 0; j < interCharArray.length; j++) {
                result = result + interCharArray[i][j];
            }
            result = result + "\n";
        }

        return result;
    }
}
