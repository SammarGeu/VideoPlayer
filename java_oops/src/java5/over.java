package java5;
 class parent{
     int add(int X,int Y){
         return X+Y;
     }
    int add(int x,int y,int z){
         return x+y+z;
    }
    int add3=5;
}
class child extends parent{
     @Override
   int add(int x,int y,int z){
         return x+y+z+5;
     }
     int add2=6;
}
public class over {
    public static void main(String[] args) {
        parent obj=new parent();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
        child obj1=new child();
        System.out.println(obj1.add(1,2,3));
        parent obj2=new child();
        System.out.println(obj2.add(1,2,3));
        System.out.println(obj2);

    }
}
