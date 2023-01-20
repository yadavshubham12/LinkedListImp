package com.blz.linkedlist;

public class Node {
    int data;
    int previousData;
    Node next;

        Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    public void insertNode(int data, int previousData) {
        Node newNode = new Node(data);
        Node current = head;
       while (current.data != previousData){
          current = current.next;
       }
       newNode.next = current.next;
       current.next = newNode;

    }


    public void addNode(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
