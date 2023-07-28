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
        int expected = 0;
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
    @Test
    public void testSize(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, "hi");
        testingList = add(testingList, "Hello");
        testingList = add(testingList, "Howdy");
        testingList = add(testingList, "assuh");
        testingList = add(testingList, "sup");
        testingList = add(testingList, "my man");
        testingList = add(testingList, "dood");

        int expected = 7;
        int actual = size(testingList);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize2(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, "hi");
        testingList = add(testingList, "Hello");
        testingList = add(testingList, "Howdy");
        testingList = add(testingList, "assuh");
        testingList = add(testingList, "sup");
        testingList = add(testingList, "my man");
        testingList = add(testingList, "dood");
        testingList = add(testingList, "aloha");
        testingList = add(testingList, "Hola");

        int expected = 9;
        int actual = size(testingList);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, "hi");
        testingList = add(testingList, "Hello");
        testingList = add(testingList, "Howdy");
        testingList = add(testingList, "assuh");
        testingList = add(testingList, "sup");
        testingList = add(testingList, "my man");
        testingList = add(testingList, "dood");
        testingList = add(testingList, "aloha");
        testingList = add(testingList, "Hola");

        String expected = "hi";
        String actual = get(testingList, 0);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGet2(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, "hi");
        testingList = add(testingList, "Hello");
        testingList = add(testingList, "Howdy");
        testingList = add(testingList, "assuh");
        testingList = add(testingList, "sup");
        testingList = add(testingList, "my man");
        testingList = add(testingList, "dood");
        testingList = add(testingList, "aloha");
        testingList = add(testingList, "Hola");

        String expected = "Hola";
        String actual = get(testingList, 8);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCopy(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, "hi");
        testingList = add(testingList, "Hello");
        testingList = add(testingList, "Howdy");
        testingList = add(testingList, "assuh");
        testingList = add(testingList, "sup");
        testingList = add(testingList, "my man");
        testingList = add(testingList, "dood");
        testingList = add(testingList, "aloha");
        testingList = add(testingList, "Hola");

        String expected = printList(testingList);
        String actual = printList(copy(testingList));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSort(){
        SinglyLinkedList testingList = new SinglyLinkedList();
        testingList = add(testingList, 5);
        testingList = add(testingList, 10);
        testingList = add(testingList, 4);
        testingList = add(testingList, 6);
        String expected = "SinglyLinkedList: \n" +
                "4 5 6 10 \n";
        String actual = (printList(sort(testingList)));
        Assert.assertEquals(expected, actual);
    }
}
