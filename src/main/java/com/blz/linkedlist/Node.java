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
    int size = 0;

    public void deleteNode(int key) {
        Node current = head;
        Node prev = null;
        if (current != null && current.data == key) {
            head = current.next;
            size--;
            return;
        }
        while (current != null && current.data == key) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            prev.next = current.next;
            size--;
        }
    }
    public void addNode (int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public int size() {
        return size;
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }