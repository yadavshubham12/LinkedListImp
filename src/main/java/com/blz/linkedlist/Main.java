package com.blz.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(56);
        list.addNode(70);
        list.insertNode(30, 56);
        list.printList();
    }
}
