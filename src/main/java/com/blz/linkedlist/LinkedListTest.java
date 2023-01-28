package com.blz.linkedlist;

import org.testng.Assert;

public class LinkedListTest {

    @Test
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

    }
    public void testInsertAfter() {
        LinkedList list = new LinkedList();
        list.addNode(56);
        list.addNode(30);
        list.addNode(70);
        list.insertAfter(30, 40);
        String result = list.printList();
        String expected = "56 30 40 70 ";
        Assert.assertEquals(result, expected);
    }
}
