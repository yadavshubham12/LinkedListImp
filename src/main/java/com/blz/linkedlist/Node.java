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

    public void pop() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        if (current.next == null) {
            head = null;
            return;
        }
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

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
