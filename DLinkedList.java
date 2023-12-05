import java.util.*;

public class DLinkedList {
    // Node class to represent a node in the doubly linked list
    class Node {
        int data; // data stored in the node
        Node prev; // reference to the previous node
        Node next; // reference to the next node

        // Node constructor
        Node(int data) {
            this.data = data; // initialize the data
        }
    }

    // head and tail nodes of the doubly linked list
    Node head, tail = null;

    // Method to add a node to the end of the list
    public void addNode(int data) {
        Node newNode = new Node(data); // create a new node

        // if the list is empty, make the new node the head and tail
        if (head == null) {
            head = tail = newNode;
            head.prev = null; // head node's previous is null
            tail.next = null; // tail node's next is null
        } else {
            // if the list is not empty, add the new node to the end of the list
            tail.next = newNode; // link the new node after the tail
            newNode.prev = tail; // link the new node's previous to the tail
            tail = newNode; // update the tail to the new node
            tail.next = null; // tail node's next is null
        }
    }

    // Method to add a node to the front of the list
    public void addNodeToFront(int data) {
        Node newNode = new Node(data); // create a new node

        // if the list is empty, make the new node the head and tail
        if (head == null) {
            head = tail = newNode;
            head.prev = null; // head node's previous is null
            tail.next = null; // tail node's next is null
        } else {
            // if the list is not empty, add the new node to the front of the list
            head.prev = newNode; // link the new node before the head
            newNode.next = head; // link the new node's next to the head
            head = newNode; // update the head to the new node
            head.prev = null; // head node's previous is null
        }
    }

    // Method to delete a node from the list
    public void deleteNode(Node del) {
        // if the list is empty or the node to delete is null, do nothing
        if (head == null || del == null) {
            return;
        }
        // if the node to delete is the head, update the head
        if (head == del) {
            head = del.next;
        }
        // if the node to delete has a next node, update the next node's previous
        if (del.next != null) {
            del.next.prev = del.prev;
        }
        // if the node to delete has a previous node, update the previous node's next
        if (del.prev != null) {
            del.prev.next = del.next;
        }
        return;
    }

    // Method to delete a node from the front of the list
    public void deleteNodeFromFront() {
        // if the list is empty, do nothing
        if (head == null) {
            return;
        }
        // update the head to the next node
        head = head.next;
        // if the list is not empty, update the new head's previous
        if (head != null) {
            head.prev = null;
        }
    }

    // Method to display the nodes of the list
    public void display() {
        Node current = head; // start from the head
        // if the list is empty, print a message
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        // traverse the list and print the data of each node
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // move to the next node
        }
    }

    // Main method to test the doubly linked list
    public static void main(String[] args) {
        DLinkedList dlList = new DLinkedList(); // create a new list
        Scanner sc = new Scanner(System.in); // create a scanner for user input
        while (true) {
            // print the menu
            System.out.println("\n1. Add node to the end");
            System.out.println("2. Add node to the front");
            System.out.println("3. Delete node from the end");
            System.out.println("4. Delete node from the front");
            System.out.println("5. Display list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt(); // get the user's choice
            switch (choice) {
                case 1:
                    // add a node to the end of the list
                    System.out.print("Enter the data for the node: ");
                    int data = sc.nextInt();
                    dlList.addNode(data);
                    break;
                case 2:
                    // add a node to the front of the list
                    System.out.print("Enter the data for the node: ");
                    data = sc.nextInt();
                    dlList.addNodeToFront(data);
                    break;
                case 3:
                    // delete a node from the end of the list
                    if (dlList.tail != null) {
                        dlList.deleteNode(dlList.tail);
                    }
                    break;
                case 4:
                    // delete a node from the front of the list
                    dlList.deleteNodeFromFront();
                    break;
                case 5:
                    // display the list
                    dlList.display();
                    break;
                case 6:
                    // exit the program
                    sc.close();
                    return;
                default:
                    // invalid choice
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
