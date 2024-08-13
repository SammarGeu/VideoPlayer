package collectionFramework;
import java.util.*;
import java.util.HashSet;

public class SET {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Set<Integer> set1 = new LinkedHashSet<>();
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(90);
         set.addAll(set1);
       // System.out.println(set);
        for(Iterator<Integer> itr = set.iterator();itr.hasNext();){
            System.out.println(itr.next());
        }
        System.out.println("Is 5 present in the set?");
        System.out.println( set.contains(5));
        set.remove(3);
        for(Iterator<Integer> itr = set.iterator();itr.hasNext();){
            System.out.println(itr.next());
        }
        System.out.println("size of set");
        System.out.println(set.size());
        set.clear();
    }
}
