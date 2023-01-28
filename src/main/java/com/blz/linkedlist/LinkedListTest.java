package com.blz.linkedlist;
import org.testng.annotations.Test;

public class LinkedListTest {

    @Test
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(56);
        list.addNode(30);
        list.addNode(40);
        list.addNode(70);
        System.out.println("Linked List;");
        list.printList();
        System.out.println();
        list.deleteNode(40);
        System.out.println("After deleting 40: ");
        list.printList();
        System.out.println();
        System.out.println("Size of linkedlist: " + list.size());
    }
}
