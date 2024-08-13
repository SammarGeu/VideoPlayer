package linked_list;
import java.util.*;
 class LL {
     static  class Node {
         int data;
         Node next;

         public Node(int data) {
             this.data = data;
             this.next = null;
         }
     }

     private Node head;
     private Node tail;
    //   super();
     public LL() {
     }

     public void insert_beginning(int data) {
         Node newnode = new Node(data);
         if (head == null) {
             head = newnode;
             head.next = newnode;
             tail=newnode;
         } else {
             newnode.next=head;
             head=newnode;
             tail.next=newnode;
          }
     }

     public void insert_end(int data) {
         Node newnode = new Node(data);
         if (head == null) {
             head = newnode;
             head.next = newnode;
         } else {
             tail.next=newnode;
             tail=newnode;
             tail.next=head;
         }
     }

     public void insert_position(int data, int position) {

         if (position < 0 || position > length()) {
             System.out.println("invalid position");
             return;
         }

         if (length() == 1) {
             insert_beginning(data);
         } else if (position == length()) {
             insert_end(data);
         } else {
             Node newnode = new Node(data);
             Node temp = tail.next;
             int i = 1;
             while (temp != tail && i < position-1) {
                 temp = temp.next;
                 i++;
             }
             newnode.next = temp.next;
             temp.next = newnode;
         }
     }

     public int length() {
         Node temp = head.next;
         int size = 1;
         while (temp != head) {
             size++;
             temp = temp.next;
         }
         return size;
     }
   public int delete_beginning(){
         if(head==null){
             System.out.println("list is empty");
             return -1;
         }
         Node temp=head;
         head=temp.next;
         tail.next=head;
         return temp.data;
   }

   public int delete_end(){
         if(head==null){
             System.out.println("list is empty");
             return -1;
         }

         Node current=tail.next;
         if(current.next==current){
             tail=null;
             return current.data;
         }
         Node previous=head;
         while(current!=tail){
             previous=current;
             current=current.next;
         }
             previous.next=tail.next;
                 tail=previous;
            return current.data;
   }

   public int delete_position(int position){
         if(head==null){
             System.out.println("list is empty");
             return -1;
         }
          if(position<1 || position>length()){
              System.out.println("invalid position");
              return -1;
          }
           Node temp=tail.next;
           Node prev=head;
           int i=1;
           while(temp!=tail&&i<position){
               prev=temp;
               temp=temp.next;
               i++;
           }
           prev.next=temp.next;
           return temp.data;

   }
     public void display() {
         if (tail== null) {
             System.out.println("The list is empty.");
             return;
         }

         Node current = head;
         while(current!=tail){
             System.out.print(current.data + " -> ");
             current=current.next;
         }
         System.out.print(current.data+"->");
         System.out.println("null");
        }
        public  void recursion_insert(Node current,int position,int i) {
         if(position>length()||position<1){
             System.out.println("invalid position");
             return;
         }
            if(position==1){
                Node newnode=new Node(5);
                newnode.next=head;
                head=newnode;
                return;

            }
            if(position==length()){
                Node newnode=new Node(5);
                tail.next=newnode;
                tail=newnode;
                tail.next=head;
                return;
            }
            if(current!=null&&i==position-1){
                Node newnode=new Node(5);
                Node Current=current.next;
                current.next=newnode;
                newnode.next=Current;
                return;
            }
            //current=current.next;
            i++;
               recursion_insert(current,position,i);
        }
     Scanner scn = new Scanner(System.in);
        public void first(){
            Node current=head;
            System.out.println("enter position");
            int position=scn.nextInt();
            int i=1;
            recursion_insert(current,position,i);
        }
 }
    public class SLL {
    public static void main(String[] args) {
        LL list=new LL();
        list.insert_beginning(4);
        list.insert_beginning(3);
        list.insert_beginning(1);
        list.insert_beginning(1);
        list.insert_end(7);
        list.insert_end(7);
        list.insert_position(1,2);
      list.insert_position(7,13);
        list.display();
        list.display();
        System.out.println(list.delete_beginning());
        System.out.println(list.delete_end());
        System.out.println(list.delete_end());
        System.out.println(list.delete_position(3));
        System.out.println(list.delete_position(8));
        list.display();
        list.first();
         list.display();
    }
}
