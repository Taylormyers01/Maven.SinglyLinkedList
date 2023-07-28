package com.zipcodewilmington.singlylinkedlist;

import static com.zipcodewilmington.singlylinkedlist.SinglyLinkedList.*;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, 5);
        testingList = add(testingList, 10);
        testingList = add(testingList, 4);
        testingList = add(testingList, 6);
        System.out.println(printList(sort(testingList)));

    }

}
