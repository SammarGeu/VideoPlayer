package linked_list;
class abc{
    protected int x;
    public abc(int x) {
        this.x = x;
    }
}
public class programming {
    public static void main(String[] args) {
        abc x =new abc(5);
        System.out.println(x.x);
        ab a=new ab();
        a.x=5;
        System.out.println(a.x);
    }
}
class ab {
    protected int x;
}

