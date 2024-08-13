package collectionFramework;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4,5);

        for(Iterator<Integer> itr = list.iterator();itr.hasNext();){
            System.out.println(itr.next());
        }

        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(13);
        list1.add(33);
        list.addAll(2,list1);
        System.out.println("list after modification");
        list.add(2,8);
        list.set(1,12);
        for(Iterator<Integer> itr = list.iterator();itr.hasNext();){
            System.out.println(itr.next());
        }
        Collections.sort(list);
        System.out.println("list after deleting an element");
        list.remove(3);
        for(Iterator<Integer> itr = list.iterator();itr.hasNext();){
            System.out.println(itr.next());
        }
        list.contains(5);
        list.clear();
    }
}
