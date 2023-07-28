package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import static com.zipcodewilmington.singlylinkedlist.SinglyLinkedList.*;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testAdd(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, 5);
        testingList = add(testingList, 10);
        testingList = add(testingList, 11);
        testingList = add(testingList, 12);
        String actual = printList(testingList);
        String expected = "SinglyLinkedList: \n" +
                "5 10 11 12 \n";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAdd2(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, 5);
        testingList = add(testingList, 10);
        testingList = add(testingList, 11);
        testingList = add(testingList, 12);
        testingList = add(testingList, 11);
        testingList = add(testingList, 10);
        testingList = add(testingList, 5);

        String actual = printList(testingList);
        String expected = "SinglyLinkedList: \n" +
                "5 10 11 12 11 10 5 \n";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemove(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, 5);
        testingList = add(testingList, 10);
        testingList = add(testingList, 11);
        testingList = add(testingList, 12);
        testingList = add(testingList, 11);
        testingList = add(testingList, 10);
        testingList = add(testingList, 5);

        testingList = remove(testingList, 10);
        String actual = printList(testingList);
        String expected = "SinglyLinkedList: \n" +
                "5 11 12 11 5 \n";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemove2(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, 5);
        testingList = add(testingList, 10);
        testingList = add(testingList, 11);
        testingList = add(testingList, 12);
        testingList = add(testingList, 11);
        testingList = add(testingList, 10);
        testingList = add(testingList, 5);

        testingList = remove(testingList, 12);
        String actual = printList(testingList);
        String expected = "SinglyLinkedList: \n" +
                "5 10 11 11 10 5 \n";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testContains(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, "hi");
        testingList = add(testingList, "Hello");
        testingList = add(testingList, "Howdy");
        testingList = add(testingList, "assuh");
        testingList = add(testingList, "sup");
        testingList = add(testingList, "my man");
        testingList = add(testingList, "dood");


        Assert.assertFalse(contains(testingList, "my dood"));
    }

    @Test
    public void testContains2(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, "hi");
        testingList = add(testingList, "Hello");
        testingList = add(testingList, "Howdy");
        testingList = add(testingList, "assuh");
        testingList = add(testingList, "sup");
        testingList = add(testingList, "my man");
        testingList = add(testingList, "dood");


        Assert.assertTrue(contains(testingList, "dood"));
    }

    @Test
    public void testFind(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, "hi");
        testingList = add(testingList, "Hello");
        testingList = add(testingList, "Howdy");
        testingList = add(testingList, "assuh");
        testingList = add(testingList, "sup");
        testingList = add(testingList, "my man");
        testingList = add(testingList, "dood");
        int expected = 1;
        int actual = find(testingList, "hi");

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFind2(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, "hi");
        testingList = add(testingList, "Hello");
        testingList = add(testingList, "Howdy");
        testingList = add(testingList, "assuh");
        testingList = add(testingList, "sup");
        testingList = add(testingList, "my man");
        testingList = add(testingList, "dood");
        int expected = 6;
        int actual = find(testingList, "dood");

        Assert.assertEquals(expected, actual);
    }
}
