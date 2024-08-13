package collectionFramework;
import java.util.*;
public class QUEUE {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.offer("happy");

        // Display the elements in the queue
        System.out.println("Queue: " + queue);
          queue.contains("icj");
        // Remove an element from the queue
        String removedElement = queue.poll();
        System.out.println("Removed: " + removedElement);

        // Display the head of the queue
        String head = queue.peek();
        System.out.println("Head of the queue: " + head);

       // queue.remove("Bob");
        // Display the elements in the queue after removal
        System.out.println("Queue after removal: " + queue);

        for(Iterator<String> itr = queue.iterator();itr.hasNext();){
            System.out.println(itr.next());
        }
    }
}

