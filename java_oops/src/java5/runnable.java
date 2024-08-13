package java5;

public class runnable {
    public static void main(String[] args) throws InterruptedException {
        data obj5 = new data();
        Thread T1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    obj5.shareData();
                }
            }
        });

        Thread T2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    obj5.shareData();
                }
            }
        });

        Thread T3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    obj5.shareData();
                }
            }
        });

          T1.start();
          T2.start();
          T3.start();
          T3.join();
          T2.join();
          T1.join();
        System.out.println(obj5.counter);
    }
}
class data{
    int counter=0;
      synchronized void shareData(){
        counter++;
    }
}