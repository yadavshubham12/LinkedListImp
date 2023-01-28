package com.blz.linkedlist;

class Node<T extends Comparable<T>> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class SortedLinkedList<T extends Comparable<T>> {
    Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> current = head;
        if (current.data.compareTo(data) > 0) {
            newNode.next = current;
            head = newNode;
            return;
        }
        while (current.next != null && current.next.data.compareTo(data) < 0) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
}

