package linked_list;
class linked{
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    private Node head;
    private Node tail;
    public linked(){
    }

    public void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void removing_Duplicate(){
        Node temp=head;
        Node current=head.next;
        while(temp.next!=null){
            if(temp.data==current.data){
                temp.next=current.next;
            }
            temp=current;
            current=current.next;
        }

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class dublicate
{
    public static void main(String[] args) {
        linked ll=new linked();
        ll.insert(1);
        ll.insert(1);
        ll.insert(2);
        ll.insert(2);
        ll.insert(3);
        ll.insert(3);
        ll.insert(4);
        ll.insert(4);
        ll.insert(5);
        ll.insert(5);
        ll.insert(6);
        ll.insert(6);
        ll.display();
        ll.removing_Duplicate();
        ll.display();
    }
}