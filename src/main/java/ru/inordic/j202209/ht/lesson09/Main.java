package ru.inordic.j202209.ht.lesson09;

public class Main {
    public static void main(String[] args) {
        LinkedList2SideGeneric<Integer> test = new LinkedList2SideGeneric();
        test.add(11);
        test.add(22);
        test.add(33);
        test.add(44);
        test.add(55);
        test.add(66);
        test.add(77);
        test.add(88);
        test.add(99);

       test.size();
        test.add(555);
        test.add(50, 5);
        test.replace(66, 7);
        test.removeByIndex(8);
        test.removeFirstByValue(9);
        test.contains(55);
        test.get(7);
        test.print();
        test.getPosition(555);
    }
}
