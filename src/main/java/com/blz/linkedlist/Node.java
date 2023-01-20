package com.blz.linkedlist;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = next;
    }
}
class LinkedList {
    Node head;
    Node tail;

    public void addNode(int data) {
        Node newNode = new Node(data);
       if (head == null){
           head = newNode;
           tail = newNode;
       }
       else {
           tail.next = newNode;
           tail = newNode;
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
