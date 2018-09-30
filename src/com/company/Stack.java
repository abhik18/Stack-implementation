package com.company;

public class Stack {
    private Node top;
    private int stackSize;

    public Stack() {
        top = null;
        stackSize = 0;
    }

    public int getSize() {
        return stackSize;
    }
    public void setSize(int size) {
        stackSize = size;
    }

    public void push(int data) {
        if(top == null) {
            top = new Node(data);
        }
        else {
            Node temp = new Node(data);
            temp.setNext(top);
            top = temp;
        }
        stackSize++;
    }

    public void pop() {
        if(isEmpty()) {
            return;
        }
        else {
            top = top.getNext();
            stackSize--;
        }
    }

    public void peek() {
        if(isEmpty()) {
            return;
        }
        System.out.println("Top element: " + top.getData());
    }

    public void printStack() {
        System.out.println();
        if(isEmpty()) {
            return;
        }
        for(Node i = top; i != null; i = i.getNext()) {
            System.out.println(i.getData() + "\n↓");
        }
    }

    public void deleteStack() {
        if(isEmpty()) {
            return;
        }
        top = null;
        setSize(0);
    }

    public boolean isEmpty() {
        if(top == null) {
            System.out.println("The stack is empty!");
            return true;
        }
        return false;
    }
}
