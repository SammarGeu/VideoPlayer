package MultiThreading;

public class onewayICT {
    public static void main(String[] args)  throws InterruptedException {
      sharedResources obj = new sharedResources();
        Thread t1  = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.withdraw(15000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.deposit(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
    }
}
class sharedResources{
    int amount =10000;

    synchronized public void withdraw(int amount) throws InterruptedException{
        if(amount>this.amount){
            System.out.println("waiting");
            wait();
        }
        this.amount-=amount;
        System.out.println("withdraw  complete");
    }
    synchronized public void deposit(int amount) throws InterruptedException{
        this.amount += amount;
        System.out.println("final amount,post deposit :");
        System.out.println(this.amount);
        notify();
        System.out.println("deposit  complete");
    }
}