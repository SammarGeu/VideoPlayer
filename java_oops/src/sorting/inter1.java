package sorting;
 class inter implements Animal,Human{
   public  void animalSound(){
       System.out.println("I make sound like an animal");
    }
   public  void run1(){
       System.out.println("I run like an animal");
    }
   public  void humanSound(){
       System.out.println("I make sound like a Human");
    }
    public void run2(){
        System.out.println("I run like a Human");
    }
}
 interface Human {
    void humanSound();
    void run2();
}
 interface Animal {
    public  abstract void animalSound();

    public abstract void run1();

}
public class inter1 {
    public static void main(String[] args) {
        inter obj=new inter();

        obj.animalSound();
        obj.run1();
        obj.humanSound();
        obj.run2();
    }
}
