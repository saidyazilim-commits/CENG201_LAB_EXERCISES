package Exercise1;

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    // TODO 1: Add an element to the top of the stack
    public void push(char value) {
        // connect newNode to the current top
        // update top
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    //  TODO 2: Remove and return the top element
    public char pop() {
        if (top == null) {
            return '\0';
        }
        char value = top.data;
        top = top.next;
        return value;
        // After saving top.data, the new top should be the node that comes after the current top.
    }
}
