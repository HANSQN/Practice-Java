package com.tasks3.linkedlist;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(Integer data) {
        Node newNode = new Node();
        newNode.setData(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }

        size++;
    }

    public Integer get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getData();
    }

    public boolean delete(int index) {
        if (index < 0 || index >= size) {
            return false;
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            Node previous = null;
            Node current = head;

            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.getNext();
            }

            previous.setNext(current.getNext());
        }

        size--;
        return true;
    }

    public int size() {
        return size;
    }
}
