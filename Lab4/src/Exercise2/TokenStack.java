package Exercise2;

/**
 * TokenStack.java
 *
 * Your Name:        Muhammed Said Genç
 * Your Student ID:  240446015
 * Your Date:        29.10.2026
 */

public class TokenStack {

    private class Node {
        // create the instant named data as a String type
        String token;
        // create the next pointer that will be used for the Stack implementation as a Node type
        Node next;
        // cpmplete the constructor accordinally
        Node(String data) {
            this.token = data;
            this.next = null;
        }
    }

    // create the top pointer that will be used for the Stack implementation as private
    private Node head;

    public TokenStack() {
        // create the constructor of the TokenStack class that will assign the top pointer to null
        this.head = null;
    }

    public void push(String value) {
        // TODO: Create a new node.
        //       Connect it to the current top.
        //       Update top.
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
    }

    public String pop() {
        // TODO: Check whether the stack is empty.
        //       Store the top value.
        //       Move top to the next node.
        //       Return the stored value.
        if (this.head == null) {
            return null;
        }
        String result = this.head.token;
        this.head = this.head.next;
        return result;
    }

    public boolean isEmpty() {
        // TODO: Return whether the stack is empty.
        return this.head == null;
    }
}
