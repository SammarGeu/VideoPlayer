//Ques 3- Breadth First search
package algorithmAssignment;
import java.util.*;
public class BFS {
    public ArrayList<Integer> bfsOfGraph(int V,
                                         ArrayList<ArrayList<Integer>> adj) {

        ArrayList < Integer > bfs = new ArrayList < > ();
        boolean []visited = new boolean[V];
        Queue < Integer > q = new LinkedList < > ();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            for (Integer it: adj.get(node)) {
                if (visited[it]==false) {
                    visited[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }

    public static void main(String []args) {

        ArrayList < ArrayList < Integer >> adjacent = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adjacent.add(new ArrayList < > ());
        }
        adjacent.get(0).add(1);
        adjacent.get(1).add(0);
        adjacent.get(0).add(4);
        adjacent.get(4).add(0);
        adjacent.get(1).add(2);
        adjacent.get(2).add(1);
        adjacent.get(1).add(3);
        adjacent.get(3).add(1);

        BFS sl = new BFS();
        ArrayList < Integer > ans = sl.bfsOfGraph(5, adjacent);
        int n = ans.size();
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}