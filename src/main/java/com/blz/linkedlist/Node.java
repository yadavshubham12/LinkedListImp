package com.blz.linkedlist;

public class Node {
    int data;
    Node next;

        Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    public void appendNode(int data) {
        Node newNode = new Node(data);
       if (head == null){
           head = newNode;
       }
       else {
           Node last = head;
           while (last.next != null){
               last = last.next;
           }
           last.next = newNode;
       }
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
