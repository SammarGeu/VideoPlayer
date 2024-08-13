package java5;

import java.util.LinkedList;

public class theads2  {
    public static void main(String[] args) throws InterruptedException {
       sharedResource obj = new sharedResource();
       Thread t1 = new Thread(new Runnable() {
          // @Override
           public void run() {
               for (int i = 0; i < 1000; i++) {
                   obj.sharedData();
               }
           }
       });



       Thread t2 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 1000; i++) {
                   obj.sharedData();
               }
           }
       });

       t1.start();
       t2.start();
//       t1.join();
//      t2.join();

        System.out.println("counter  Value :" +  obj.counter);
    }
}

class sharedResource{
    int counter =0;
     synchronized void sharedData(){

       counter++;
//    }
//    synchronized (this){
//        counter++;
//    }
}}

