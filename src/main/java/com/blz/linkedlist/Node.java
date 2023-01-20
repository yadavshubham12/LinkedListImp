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

    public void popLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
            head = current.next;
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
