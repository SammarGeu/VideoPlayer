package linked_list;
class LinkedList{
static class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    private Node head;
    private int size;
    public LinkedList(){
  this.size=0;
    }

    // Insert a node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    // Insert a node at a specific position in the linked list
    public void insertAtPosition(int data, int position) {


        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data); // Create a new node with the given data.
        Node current = head; // Initialize a reference to the head of the list.
        int currentPosition = 1;

        // Traverse the list while checking the position.
        while (currentPosition < position  && current != null) {
            current = current.next;
            currentPosition++;
        }

        // Insert the new node into the list:
        // 1. Set the new node's 'next' pointer to the current node's 'next'.
        // 2. Update the current node's 'next' pointer to point to the new node.
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public int delete_first(){
        if (head == null) {
            System.out.println("The linked list is empty.");
            return -1; // You can return a special value or throw an exception to indicate an error.
        }

        int val=head.data;
        head=head.next;
        size--;

        if (size == 0) {
            // If the list becomes empty after deletion, update head to null.
            head = null;
        }
        return val;
    }

public int delete_pos(int position){
        Node temp=head;
        Node prev=null;
        int i=1;
        while(temp!=null&&i<position){
            prev=temp;
            temp=temp.next;
            i++;
        }
          prev.next=temp.next;
        int value=temp.data;
        size--;
        return value;
}

public int delete_end(){
    if (head == null) {
        System.out.println("The linked list is empty.");
        return -1; // You can return a special value or throw an exception to indicate an error.
    }

    Node temp=head;

        Node prev=null;
        while((temp.next!=null)){
            prev=temp;
            temp=temp.next;
        }
          int value=temp.data;
        prev.next=null;
       // int value=temp.data;
    if (prev != null) {
        prev.next = null;
    } else {
        // If the list had only one element, update head to null.
        head = null;
    }
        size--;
        return value;
}
    // Display the content of the linked list
    public void display() {
        if (head == null) {
            System.out.println("empty list");

        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LL5 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtBeginning(0);
        list.insertAtEnd(6);
        list.insertAtPosition(4, 2);
        System.out.println("Linked List after initial insertions:");
        list.display();
      System.out.println(list.delete_first());
//       System.out.println(list.delete_first());
//       System.out.println(list.delete_first());
//       System.out.println(list.delete_first());
//        System.out.println(list.delete_first());
       list.insertAtPosition(5, 10); // Invalid position
        System.out.println(list.delete_pos(3));
        System.out.println(list.delete_end());
        System.out.println("Linked List after deletion at beginning:");
        list.display();
    }
}




