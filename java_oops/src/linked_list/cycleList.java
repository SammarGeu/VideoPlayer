package linked_list;
class cycle{
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        private Node head;
        private Node tail;


    public void insert(int data) {
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void insert1(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            tail.next=head;
        }
        tail.next=newnode;
        tail=newnode;
        tail.next=head;
    }
    public boolean Cycle(){
        if(tail.next!=null){
            return true;
        }
        return false;
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

public class cycleList {
    public static void main(String[] args) {
        cycle list=new cycle();
        cycle list2=new cycle();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        list2.insert1(1);
        list2.insert1(2);
        list2.insert1(3);
        list2.insert1(4);
        list2.insert1(5);
        list2.insert1(6);
        boolean ans=list2.Cycle();
        boolean Ans=list.Cycle();
        System.out.println(Ans);
        System.out.println(ans);
    }
}
