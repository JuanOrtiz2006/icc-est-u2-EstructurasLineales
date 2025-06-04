package models;

public class Node {
    private int value;
    private Node next;

    public Node(int value){
        this.value=value;
        this.next=null;
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Value: " + value + "Next: " + next.value;
    }
}
