package ru.inordic.j202209.ht.lesson04;

public class Main {
    public static void main(String[] args) {
        int newElement = 4;
        int newNomberElement = 4;
        int[] massivToKeep = {1,2,3,4,5,6,7};

        int newMassiv[] = NewMassiv.newMassiv(massivToKeep,newElement, newNomberElement);


        for (int i = 0; i < newMassiv.length; i++) {
            System.out.println(i + " элемент массива = " + newMassiv[i]);
        }
    }
}
