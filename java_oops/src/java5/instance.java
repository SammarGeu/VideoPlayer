package java5;


abstract class sam{

    abstract void print();

}

public class instance {
    public static void main(String[] args) {

        instance obj=new instance();
        if(obj instanceof Object){
            System.out.println("yes");
            System.out.println(obj.getClass());
        }
        else{
            System.out.println("no");
        }

    }
}
