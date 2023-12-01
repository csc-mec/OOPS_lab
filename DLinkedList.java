import java.util.*;

public class DLinkedList {

    // Node class to represent elements in the doubly linked list
    class Node {
        int data;        // Data stored in the node
        Node prev;       // Reference to the previous node
        Node next;       // Reference to the next node

        // Constructor to initialize a node with data
        Node(int data) {
            this.data = data;
        }
    }

    Node head, tail = null;  // References to the head and tail of the doubly linked list

    // Method to add a new node with given data to the end of the list
    public void addNode(int data) {
        Node newNode = new Node(data);

        // If the list is empty, set the new node as both head and tail
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            // Add the new node to the end of the list
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    // Method to delete a given node from the list
    public void deleteNode(Node del) {
        // Check if the list or the given node is null
        if (head == null || del == null) {
            return;
        }

        // If the node to be deleted is the head, update the head
        if (head == del) {
            head = del.next;
        }

        // If the node to be deleted has a next node, update its previous reference
        if (del.next != null) {
            del.next.prev = del.prev;
        }

        // If the node to be deleted has a previous node, update its next reference
        if (del.prev != null) {
            del.prev.next = del.next;
        }

        return;
    }

    // Method to display the elements of the doubly linked list
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    // Main method to demonstrate the doubly linked list functionality
    public static void main(String[] args) {
        DLinkedList dlList = new DLinkedList();  // Create a new instance of the doubly linked list
        int n, data, ndata;
        System.out.println("Enter the number of nodes: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // Add nodes to the list based on user input
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the data for node " + i + ": ");
            data = sc.nextInt();
            dlList.addNode(data);
        }

        dlList.display();  // Display the initial state of the doubly linked list
        System.out.println();
        System.out.println("Enter the data to be deleted: ");
        ndata = sc.nextInt();

        Node del = dlList.head;

        // Find the node with the specified data to be deleted
        while (del != null) {
            if (del.data == ndata) {
                break;
            }
            del = del.next;
        }

        dlList.deleteNode(del);  // Delete the specified node
        dlList.display();  // Display the updated doubly linked list

    }
}
