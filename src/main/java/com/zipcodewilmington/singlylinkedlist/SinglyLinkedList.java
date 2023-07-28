package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList{

    Node head;
    static class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data = data;
            next = null;
        }
    }
    public static <T> SinglyLinkedList add(SinglyLinkedList list, T data){
        Node new_node = new Node(data);
        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while(last.next !=null){
                last=last.next;
            }
            last.next = new_node;
        }

        return list;
    }

    public static String printList(SinglyLinkedList list){
        StringBuilder sb = new StringBuilder();
        Node currentNode = list.head;
        sb.append("SinglyLinkedList: \n");
        while(currentNode != null){
            sb.append(currentNode.data).append(" ");
            currentNode = currentNode.next;
        }
        sb.append("\n");
        return sb.toString();
    }

    public static <T> SinglyLinkedList remove(SinglyLinkedList list, T data){
        Node currentNode = list.head;
        Node holdNode = null;

        if(currentNode.data == data){
            currentNode = currentNode.next;
            list.head = currentNode;
            return list;
        }
        while(currentNode.next != null){
            if(currentNode.next.data == data){
                holdNode = currentNode.next;
                if(holdNode.next == null){
                    currentNode.next = null;
                    return list;
                }
                currentNode.next = holdNode.next;
            }
            currentNode = currentNode.next;
        }
        return list;
    }

    public static <T> boolean contains(SinglyLinkedList list, T data){
        Node currentNode = list.head;
        if(currentNode.data == data){
            currentNode = currentNode.next;
            list.head = currentNode;
            return true;
        }
        while(currentNode.next != null){
            if(currentNode.next.data == data){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
    public static <T> int find(SinglyLinkedList list, T data){
        Node currentNode = list.head;
        int index = 1;

        if(currentNode.data == data){
            return index;
        }
        if(contains(list, data)){
            while(currentNode.next != null){
                if(currentNode.next.data == data){
                    return index;
                }
                currentNode = currentNode.next;
                index++;
            }
        }
        return -1;
    }

    public static int size(SinglyLinkedList list){
        return 0;
    }
}


