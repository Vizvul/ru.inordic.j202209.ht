package ru.inordic.j202209.ht.lesson04;

public class NewMassiv {

    public int massivA;
    public int element;
    public int nomberElement;



    public static int[] newMassiv(int[] massivA, int element, int nomberElement) {

        int[] massivB;
        // добавляем новый элемент
        if (massivA.length < nomberElement) {
            massivB = new int[nomberElement];
            massivB[nomberElement - 1] = element;
        } else {
            massivB = new int[massivA.length + 1];
            massivB[nomberElement - 1] = element;
        }

        // переписываем старые значение в новый массив
        for (int i = 0; i < massivA.length; i++) {
            if (i < nomberElement - 1) {
                massivB[i] = massivA[i];
            } else {
                massivB[i + 1] = massivA[i];
            }
        }
        return massivB;
    }


    public int getMassivA() {
        return massivA;
    }

    public void setMassivA(int massivA) {
        this.massivA = massivA;
    }


    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public int getNomberElement() {
        return nomberElement;
    }

    public void setNomberElement(int nomberElement) {
        this.nomberElement = nomberElement;
    }
}
