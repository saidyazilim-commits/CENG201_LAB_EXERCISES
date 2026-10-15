package Lab2_SinglyLinkedLists.Exercise_1;

/**
 * MiddleNodeDemo.java
 *
 * Tests the singly linked list and findMiddle() method.
 *
 * Name:        Muhammed Said Genç
 * Student ID:  240446015
 * Date:        12.10.2026
 */

public class MiddleNodeDemo {

    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        // -------------------------------------------------------
        // Test 1: Odd number of nodes
        // TODO:
        // 1. Created a singlyLİnkedList
        // 2. Add 1,2,3,4,5 Nodes to the list
        // 3. Display the list
        // 4. Found and print the middle Node
        SinglyLinkedList oddNumberList = new SinglyLinkedList();
        oddNumberList.add(1);
        oddNumberList.add(2);
        oddNumberList.add(3);
        oddNumberList.add(4);
        oddNumberList.add(5);


        System.out.println("List 1:");
        oddNumberList.display();


        System.out.println("Middle Node: " + oddNumberList.findMiddle().data);
        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // TODO:
        // 1. Created another singlyLİnkedList
        // 2. Add 10,20,30,40,50,60 Nodes to the list
        // 3. Display the list
        // 4. Found and print the middle Node
        SinglyLinkedList evenNumberList = new SinglyLinkedList();
        evenNumberList.add(10);
        evenNumberList.add(20);
        evenNumberList.add(30);
        evenNumberList.add(40);
        evenNumberList.add(50);
        evenNumberList.add(60);


        System.out.println("List 2:");
        evenNumberList.display();

        System.out.println("Middle Node: " + evenNumberList.findMiddle().data);
        System.out.println();
    }
}
