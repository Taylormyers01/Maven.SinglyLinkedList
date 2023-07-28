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
        if(find(list, data) == -1)
            return false;
        return true;
    }
    public static <T> int find(SinglyLinkedList list, T data){
        Node currentNode = list.head;
        int index = 1;
        if(currentNode.data == data){
            return 0;
        }
        while(currentNode.next != null){
            if(currentNode.next.data == data){
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    public static int size(SinglyLinkedList list){
        Node currentNode = list.head;
        int count = 1;
        while(currentNode.next != null){
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public static <T> T get(SinglyLinkedList list, int index){
        int position = 0;
        Node currentNode = list.head;
        while(position <index){
            currentNode = currentNode.next;
            position++;
        }
        return (T)currentNode.data;
    }

    public static SinglyLinkedList copy(SinglyLinkedList list){
        SinglyLinkedList newList = new SinglyLinkedList();
        Node currentNode = list.head;
        while(currentNode.next != null){
            newList = add(newList, currentNode.data);
            currentNode =currentNode.next;
        }
        return add(newList, currentNode.data);
    }
    public static SinglyLinkedList sort(SinglyLinkedList list){
        SinglyLinkedList newList = new SinglyLinkedList();
        Node currentNode;
        Node compare;
        while(size(list)> 1){
            currentNode = list.head;
            compare = list.head;
            while(currentNode != null){
                if((Integer)currentNode.data - (Integer) compare.data < (Integer) compare.data - (Integer) currentNode.data){
                    compare = currentNode;
                }
                currentNode = currentNode.next;
            }
            newList = add(newList, compare.data);
            list = remove(list, compare.data);

        }
        return add(newList, list.head.data);
    }
}


