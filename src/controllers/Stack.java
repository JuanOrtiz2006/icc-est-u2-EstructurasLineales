package controllers;
import java.util.EmptyStackException;

import models.Node;
public class Stack {

    private Node top;

    public Stack(){
        this.top = null;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();

        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public int Size() {
        Node current = top;
        int size=0;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        
        return size;
    }
}
