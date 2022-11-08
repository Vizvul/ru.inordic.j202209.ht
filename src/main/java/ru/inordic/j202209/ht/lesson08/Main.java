package ru.inordic.j202209.ht.lesson08;

public class Main {
    public static void main(String[] args) {

        SimplyLinkedList simplyLinkedList = new SimplyLinkedList();
        simplyLinkedList.add(11);
        simplyLinkedList.add(22);
        simplyLinkedList.add(33);
        simplyLinkedList.add(44);

        System.out.println(simplyLinkedList.size());
        simplyLinkedList.add(60,6);
        System.out.println(simplyLinkedList.removeFirstByValue(10));
        simplyLinkedList.replace(88,4);

        simplyLinkedList.print();
        System.out.println(simplyLinkedList.size());

        simplyLinkedList.removeByIndex(3);
        simplyLinkedList.print();
        System.out.println(simplyLinkedList.size());
        System.out.println(simplyLinkedList.size());
        System.out.println(simplyLinkedList.getPosition(88));
        System.out.println(simplyLinkedList.contains(45));

        simplyLinkedList.replace(55,8);
        simplyLinkedList.print();
        System.out.println(simplyLinkedList.size());

    }
}
