package practice.massiv;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {


        int[] arr1 = {1, 55, 76, 88, 98, 34, 36, 38, 39, 99, 0, 9, 11, 13, 198, 14, 15};
        int razmerGor = 5;
        Main test = new Main();
        test.toPrint(arr1,razmerGor);
        // Раставляем минимум и максимум по рядам
        vertSort(arr1, razmerGor);
    }

    public static void vertSort(int arr[], int razmerGor) {
        Main test = new Main();
        int placeForState; // Ходит по циклу
        int next; // Ходит по следующему ярусу цикла
        int sekond; // Ограничивает длинну прохождения по основному циклу
        boolean status;

        int roundFor = (arr.length % razmerGor == 0) ? arr.length / razmerGor-1 : arr.length / razmerGor;
        int[] bufferArr = new int[arr.length];

        int j;

        for (int i = 0; i < roundFor; i++) {
            j = 0;
            placeForState = 0;

            next = razmerGor + razmerGor * i;
            sekond = next;
            status = true;

            while (status) {
                if (arr[placeForState] > arr[next]) {
                    bufferArr[j] = arr[next];

                    if (next == arr.length-1) {
                        placeForState = j;
                        while ( placeForState + 1 != arr.length) {
                            bufferArr[placeForState+1] = arr[placeForState-1];
                            placeForState++;
                        }
                        status = false;
                    }
                        next++;
                } else {
                    bufferArr[j] = arr[placeForState];
                    if(placeForState != sekond) {
                        placeForState++;
                    } else {
                        status = false;
                    }

                }
                j++;

            }
            for (int k = 0; k < next; k++) {
                arr[k] = bufferArr[k];
            }

        }
        test.toPrint(arr,razmerGor);
    }

    public void toPrint(int arr[], int razmerGor){
        int set = 0;
        System.out.println("");
        for (int i : arr) {
            if (set % razmerGor == 0) {
                System.out.print("\n       ");
            }
            set++;
            System.out.print(new DecimalFormat("00").format(i) + " ");
        }
    }
}

