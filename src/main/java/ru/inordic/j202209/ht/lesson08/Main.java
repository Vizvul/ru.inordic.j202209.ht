package ru.inordic.j202209.ht.lesson08;

public class Main {
    public static void main(String[] args) {

        SimplyLinkedList simplyLinkedList = new SimplyLinkedList();
        simplyLinkedList.add(11);
        simplyLinkedList.add(22);
        simplyLinkedList.add(33);
        simplyLinkedList.add(44);
        simplyLinkedList.add(55);
        simplyLinkedList.add(66);
        simplyLinkedList.add(77);
        simplyLinkedList.add(88);
        simplyLinkedList.add(99);
        simplyLinkedList.add(999);
        //System.out.println(simplyLinkedList.size());
      //simplyLinkedList.add(60,6);
        //System.out.println(simplyLinkedList.removeFirstByValue(10));
simplyLinkedList.replace(88,4);

       simplyLinkedList.print();
 //       System.out.println(simplyLinkedList.size());
        System.out.println(simplyLinkedList.getPosition(999));

    }
}
