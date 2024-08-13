package linked_list;
class LL1 {

    static class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.previous = null;
            this.next = null;
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public LL1() {
        this.size = 0;
    }

    public void insert_beginning(int data) {
        Node newnode = new Node(data);
        Node temp;
        if (head == null) {
            head = newnode;

        } else {
            temp = newnode;
            head.previous = newnode;
            temp.next = head;
            head = newnode;

        }
        size++;
    }

    public void insert_end(int data) {
        Node newnode = new Node(data);
        Node temp;
        if (head == null) {
            head = newnode;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.previous = temp;
        }
        size++;
    }

    public void insert_position(int data, int position) {
        if (position < 1 || position > size) {
            System.out.println("invalid position");
            return;
        }
        Node temp = head;
        Node newnode = new Node(data);

        if (size == 1) {
            insert_beginning(data);
        } else if (temp.next == null) {
            insert_end(data);
        } else {
            int i = 1;
            while (temp != null && i < position) {
                temp = temp.next;
                i++;
            }
            newnode.next = temp.next;
            temp.next.previous = newnode;
            newnode.previous = temp;
            temp.next = newnode;
        }
        size++;
    }

    public void display() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int delete_beginning() {
        if (head == null) {
            System.out.println("list is empty");
            return -1;
        }
        Node temp = head;
        head = temp.next;
        head.previous = null;
        size--;
        return temp.data;
    }

    public int delete_end() {

        if (head == null) {
            System.out.println("list is empty");
            return -1;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.previous.next = null;
        // temp.previous=null;
        size--;
        return temp.data;
    }

    public int length() {
        Node temp = head;
        int l = 0;
        while (temp != null) {
            l++;
            temp = temp.next;
        }
        return l;
    }

    public int delete_position(int position) {
        if (position < 1 || position > length()) {
            System.out.println("invalid position");
            return -1;
        }
        if (head == null) {
            System.out.println("list is empty");
            return -1;
        }
        if (position == 1) {
            return delete_beginning();
        } else if (position == length()) {
            return delete_end();
        }
        int i = 1;
        Node temp = head;
        Node Previous = null;
        while (i < position && temp != null) {
            Previous = temp;
            temp = temp.next;
            i++;
        }
        if (temp != null) {

            temp.next.previous = temp.previous;
            Previous.next = temp.next;
            size--;
            return temp.data;
        } else {
            System.out.println("Node not found at position " + position);
            return -1;
        }
    }
}
public class oops {
    public static void main(String[] args) {
        LL1 ll = new LL1();

        ll.insert_beginning(1);
        ll.insert_end(2);
        ll.insert_end(3);
        ll.insert_beginning(6);
        ll.insert_position(7, 9);
        ll.insert_beginning(0);
        ll.insert_end(9);
        System.out.println("linked list is");
        ll.display();
        System.out.println( ll.delete_beginning());
        System.out.println(ll.delete_end());
        System.out.println(ll.delete_position(3));
       System.out.println(ll.delete_position(9));
        System.out.println("linked list is");
        ll.display();
       System.out.println("the size of linked list is :"+ ll.length());
    }
}

