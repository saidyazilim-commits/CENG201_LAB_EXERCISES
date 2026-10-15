package Lab2_SinglyLinkedLists.Exercise_2;

/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        Muhammed Said Genç
 * Your Student ID:  240446015
 * Your Date:        12.10.2026
 */

public class SinglyLinkedList {

    // Instance variable

    private Node head;

    // Constructor
    public SinglyLinkedList() {

    }
    // use it from Exercise 1
    // Add a node to the end of the list
    public void add(int data) {

        // TODO:
        // 1. Create a new Node.
        // 2. If the list is empty, make the new node the head.
        // 3. Otherwise, traverse to the last node.
        // 4. Link the last node to the new node.
        Node newNode = new Node(data);
        if (head == null) {head = newNode;}
        else
        {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    // use it from Exercise 1
    // Display the linked list
    public void display() {

        // TODO:
        // Start from head.
        // Visit each node using next.
        // Print:
        //
        // 1 --> 2 --> 3 --> NULL
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
            if (current == null) {
                System.out.print("NULL");
            }
        }
        System.out.println();
    }

    // -------------------------------------------------------
    // Delete the middle node
    public void deleteMiddle() {

        // TODO:
        // Step 1: Count the total number of nodes.
        // Step 2: Find the node before the middle node.
        //         Then change its next reference so that
        //         the middle node is removed from the list.
        //
        // Remember:
        // - For an odd number of nodes, delete the middle.
        // - For an even number of nodes, delete the SECOND middle.
        // - If there is only one node, the list becomes empty.

        // Empty List
        if (head == null) {return;}

        // One Node : List becomes empty
        if (head.next == null) {
            head = null;
            return;
        }

        // Step 1: Count the number of nodes
        int counter = 0;
        Node current = head;
        while (current.next != null) {
            counter++;
            current = current.next;
        }

        // Step 2
        Node prev = head;
        for (int i = 0; i < counter / 2 - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    // Get the head
    public Node getHead() {
        return head;
    }
}
