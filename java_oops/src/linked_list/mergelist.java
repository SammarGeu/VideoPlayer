package linked_list;
 class list{
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
    public void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    static list merge(list l1,list l2){
        list l3=new list();
        l3.head=l1.head;

        l1.tail.next = l2.head;
         return  l3;
    }
    public void sort(){
        Node temp=head;
        for(int i=1;i<length();i++){
            Node current=temp;
            for(int j=1;j<length()&&current!=null;j++){
                if(current.data>current.next.data){
                    int Temp=current.data;
                    current.data=current.next.data;
                    current.next.data=Temp;
                }
                current=current.next;
            }
            //temp=temp.next;
        }
    }
    public int length(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

}
public class mergelist {
    public static  void main(String[] args) {
        list l1=new list();
        list l2=new list();
          l1.insert(10);
        l2.insert(-9);
        l1.insert(2);
        l2.insert(80);
        l1.insert(47);
        l2.insert(9);
        list l3=list.merge(l1,l2);
        l3.sort();
        l3.display();
    }
}
