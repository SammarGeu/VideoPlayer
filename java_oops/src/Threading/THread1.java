package Threading;

public class THread1 {
    public static void main(String[] args) {
       // Tc1 obj = new Tc1();
        Thread T1 = new Thread(new Tc1());
        T1.start();
        Tc2  obj2 = new Tc2();
        Thread T2 = new Thread(obj2);
        T2.start();
    }
}

class Tc1 extends Thread{


    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            System.out.println("i am in thread 1");
        }
    }
}
class Tc2 implements Runnable{

    public void run(){
        for (int i =1001; i < 2000; i++) {
            System.out.println(i);
            System.out.println("i am in thread 2");
        }
    }
}

