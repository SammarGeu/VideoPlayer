package graphs;
import java.util.*;
public class Main {
    static class graph1 {
        public void addEdge(int [][]arr,int edge,int dest){
            setGraph(arr,edge,dest);
        }

        public void setGraph(int [][]arr, int edge, int dest) {
            arr[edge][dest] = 1;
            arr[dest][edge] = 1;
        }
        public void graphDisplay(int [][]arr,int vertices){

            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    System.out.print(arr[i][j] + " ");
                     }
                System.out.println();
                 }
              }

        public void dfs(int [][]arr,int vertices,int start){

            boolean []visited = new boolean[vertices+1];
            Arrays.fill(visited,false);
            Stack<Integer> stack = new Stack<>();

            visited[start]=true;

            stack.push(start);
            while(!stack.isEmpty()){
                int vertex=stack.peek();
                System.out.print(vertex + " ");
                stack.pop();


                for (int i = 1; i <vertices+1 ; i++) {
                    if(arr[vertex][i] ==1 && !visited[i]){
                      visited[i]=true;
                      stack.push(i);
                    }
                }
            }
        }
        public void bfs(int [][]arr,int vertices,int start){

            boolean []visited = new boolean[vertices+1];
            Arrays.fill(visited,false);
            Queue<Integer> queue = new LinkedList<>();

            visited[start]=true;

            queue.add(start);
            while(!queue.isEmpty()){
                int vertex=queue.peek();
                System.out.print(vertex + " ");
                queue.remove();


                for (int i = 1; i <vertices+1 ; i++) {
                    if(arr[vertex][i] == 1 && !visited[i]){
                        visited[i]=true;
                        queue.add(i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        graph1 obj=new graph1();
        System.out.println("enter the number of vertices");
        int vertices=scn.nextInt();

       int [][]arr=new int[vertices+1][vertices+1];

        System.out.println("enter the number of Edges ");
        int edges=scn.nextInt();

        System.out.println("enter edge and then destination pair : ");

        for (int i = 1; i <= edges; i++) {
            System.out.println("enter edge :");
            int edge=scn.nextInt();
            System.out.println("enter destination ");
            int dest=scn.nextInt();
               obj.addEdge(arr,edge,dest);
        }

        System.out.println("Graph is :");
        obj.graphDisplay(arr,vertices);

        System.out.println("enter the starting point for traversal");
        int start=scn.nextInt();

        System.out.println("BFS Traversal :");
        obj.bfs(arr,vertices,start);

        System.out.println();

        System.out.println("DFS Traversal :");
        obj.dfs(arr,vertices,start);

    }
}