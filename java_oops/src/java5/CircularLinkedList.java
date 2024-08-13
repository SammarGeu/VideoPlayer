package java5;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    static Node reverseLinkedList(Node head) {
        if (head == null) {
            return null;
        }

        Node prev = null;
        Node current = head;
        Node next;

        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);

        head.next = prev;
        head = prev;

        return head;
    }

    static void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, data;

        Node head = null;
        Node current = null;

        System.out.print("Enter the number of elements in the linked list: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            data = scanner.nextInt();

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                current = newNode;
                newNode.next = head;
            } else {
                current.next = newNode;
                current = newNode;
                newNode.next = head;
            }
        }

        System.out.print("Original linked list: ");
        printList(head);

        head = reverseLinkedList(head);

        System.out.print("Reversed linked list: ");
        printList(head);

        // No need to free memory in Java, as garbage collection takes care of it.
    }
}

