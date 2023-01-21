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

    public boolean findNode(int key) {
        Node current = head;
        while (current != null){
            if (current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
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
