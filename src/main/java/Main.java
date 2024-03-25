package src.main.java;

import src.main.java.collections.MyLinkedList;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(-1));
        System.out.println(linkedList.get(3));
    }

}
