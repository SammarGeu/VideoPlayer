package java5;
interface a{
     void add();


}
class b implements a{
    public void add(){
        System.out.println("hii");
    }
}
 public class k {
     public static void main(String[] args) {
         b obj= new b();
         obj.add();
     }
}
