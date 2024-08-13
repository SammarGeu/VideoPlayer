package java5;
import java.util.*;
public class threads {
    public static void main(String[] args){
        Thread t1 = new Thread( new TC1());
        Thread t2 = new Thread( new TC2());

        t1.start();
        t2.start();
    }
}

class TC1 implements Runnable{
    @Override
    public void run() {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        System.out.println();
    }
}

class TC2 extends Thread{
    @Override
   public  void run(){
        for (int i = 0; i < 1000;i++) {
            System.out.println(i);
        }
    }
}