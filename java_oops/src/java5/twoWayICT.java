package java5;
import java.util.LinkedList;
import java.util.Queue;

public class twoWayICT {
    public static void main(String[] args) {
        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 10;

        Thread producer = new Thread(new Producer(buffer,maxSize,"PRODUCER"));
        Thread consumer = new Thread(new Consumer(buffer,maxSize,"CONSUMER"));

        producer.start();
        consumer.start();
    }
}

class Producer extends Thread{
private Queue<Integer> queue;
final int maxSize;
int count=0;
public Producer(Queue<Integer> queue,int maxSize,String name){
    super(name);
    this.queue = queue;
    this.maxSize = maxSize;
}
public synchronized void run(){

    while(true){
        synchronized (queue){
            while(queue.size()==maxSize){
                System.out.println("Queue is full" + "Producer queue is waiting"+
                        "for consumer thread to take something out of queue");
                try {
                    queue.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            count++;
            System.out.println("Producing value :" + count);
            queue.add(count);
            queue.notify();
        }
    }
  }
}

class Consumer extends Thread{
    private Queue<Integer> queue;
    private int maxSize;
    int count=0;
    public Consumer(Queue<Integer> queue,int maxSize,String name){
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }
    public synchronized void run(){
        while(true){
            synchronized (queue){
                while(queue.isEmpty()){
                    System.out.println("Queue is empty" + "Consuming thread is waiting" +
                            " for producer thread to put something into queue");
                    try {
                        queue.wait();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Consuming value :" + queue.remove());
                queue.notify();
            }
        }
      }
    }

