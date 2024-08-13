package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DeQueue {
    public static void main(String[] args) {
        Deque<Integer> list =  new LinkedList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.offer(9);
        System.out.println(list);
        list.addFirst(3);
        list.addLast(2);

         list.poll();
         list.peek();
        list.remove(3);
        System.out.println( list.contains(5));
        Deque<Integer> list1 =  new ArrayDeque<>();
        list1.add(101);
        list1.add(103);
        list.addAll(list1);
        System.out.println(list);

        for(Iterator<Integer> itr = list.iterator();itr.hasNext(); ){
            System.out.println(itr.next());
        }
        }
    }

