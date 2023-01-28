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

    public void insertAfter(int key, int data){
        Node current = head;
        while (current != null && current.data !=key){
            current = current.next;
        }
        if (current != null){
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public void addNode(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public String printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        return null;
    }
}
