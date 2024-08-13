package java5;
//import static java5.abc.clone;
public class Static implements av {
    void x(){
        System.out.println("hi");
    }

     public void a(){
         System.out.println("hiii");
    }
    public static void main(String[] args) {
      //  int x=(int)sqrt(a);
//        oops obj=new oops();
//        obj.a=9;
//        oops obj2=new oops();
//        obj2.a=11;
//
//        System.out.println(oops.a);
//        System.out.println(obj2.a);
//
//        oops.a=90;
//        System.out.println(obj.a);
//        System.out.println(obj2.a);
//        System.out.println(oops.a);
//        System.gc();
//        System.out.println("n");
//        Static obj=new Static();
//        av.x();
//        obj.a();

       // clone  obj2=clone();
    }
}
class oops{
    static int a=5;
}

abstract class n{
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    void abc(){
    }
}
interface av{
    int a=5;
   // void ab();
    static void x(){
        System.out.println("hi i am static");

    }
    default void a(){
        System.out.println("i am am default");
    }
}