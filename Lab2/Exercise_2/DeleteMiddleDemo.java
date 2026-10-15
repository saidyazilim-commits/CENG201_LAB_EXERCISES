package Lab2_SinglyLinkedLists.Exercise_2;

/**
 * DeleteMiddleDemo.java
 *
 * Tests deleting the middle node of a singly linked list.
 *
 * Name:        ______________________________
 * Student ID:  ______________________________
 * Date:        ______________________________
 */

public class DeleteMiddleDemo {

    public static void main(String[] args) {

        System.out.println("=== Delete Middle Node Demo ===");
        System.out.println();

        // Test 1: Odd number of nodes
        // TODO:
        // 1. Created a singlyLinkedList
        // 2. Add 1,2,3,4,5 Nodes to the list
        // 3. Display the list
        // 4. Delete the Middle Node
        // 5. Display the list after deleting
        SinglyLinkedList oddNumbers = new SinglyLinkedList();
        oddNumbers.add(1);
        oddNumbers.add(2);
        oddNumbers.add(3);
        oddNumbers.add(4);
        oddNumbers.add(5);


        System.out.println("Original List 1:");
        oddNumbers.display();


        System.out.println("After deleting middle:");
        oddNumbers.deleteMiddle();
        oddNumbers.display();


        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // TODO:
        // 1. Created another singlyLİnkedList
        // 2. Add 10,20,30,40,50,60 Nodes to the list
        // 3. Display the list
        // 4. Delete the Middle Node
        // 5. Display the list after deleting
        SinglyLinkedList evenNumbers = new SinglyLinkedList();
        evenNumbers.add(10);
        evenNumbers.add(20);
        evenNumbers.add(30);
        evenNumbers.add(40);
        evenNumbers.add(50);
        evenNumbers.add(60);


        System.out.println("Original List 2:");
        evenNumbers.display();


        System.out.println("After deleting middle:");
        evenNumbers.deleteMiddle();
        evenNumbers.display();


        System.out.println();

        // Test 3: One node
        // TODO:
        // 1. Created another singlyLİnkedList
        // 2. Add just 999 to the list
        // 3. Display the list
        // 4. Delete the Middle Node (because it has just one node, you just have to delete the head)
        // 5. Display the list after deleting
        SinglyLinkedList oneNodeList = new SinglyLinkedList();
        oneNodeList.add(999);


        System.out.println("Original List 3:");
        oneNodeList.display();


        System.out.println("After deleting middle:");
        oneNodeList.deleteMiddle();
        oneNodeList.display();


    }
}
