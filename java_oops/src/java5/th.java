package java5;

public class th {
    public static void main(String[] args) {
        TC4 obj = new TC4();
      //  obj.start();

        Thread obj2 = new Thread(obj);

        obj2.start();

    }
}
 class TC4 extends Thread{
    public  void run(){

        for (int i = 0; i < 1000; i++) {
            System.out.println("i am thread 1");
        }
    }
 }