package java5;
abstract class h{
    h(){};
   abstract  void add();
}
class l extends h{
    public void add(){
        System.out.println("hi");;
    }
}
public class c {
    public static void main(String[] args) {
        h obj=new l();

        obj.add();

    }
}
