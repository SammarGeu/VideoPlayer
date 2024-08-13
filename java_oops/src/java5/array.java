package java5;

import java.util.Scanner;
import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int k = scn.nextInt();
//        String ans = "abc";
//        int[][] arr = new int[n][2];
//        int b = Integer.bitCount(77);
//        System.out.println(b);
int n=scn.nextInt();
        int b=scn.nextInt();
int [][] arr=new int[n][b];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(deleteGreatestValue(arr));
//}
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = scn.nextInt();
//            }
//        }
//        swap(arr);
//        System.out.println(add(arr));
//
//        List<Integer> mylist=new ArrayList<>();

//
//        int []seats=new int[n];
//        int []students=new int[k];
//
//        for (int i = 0; i < seats.length; i++) {
//            seats[i]=scn.nextInt();

        }/*
        for (int i = 0; i < students.length; i++) {
            students[i]=scn.nextInt();
        }
       // System.out.println(add(seats,students));

static int add(int []seats,int []students){
    Arrays.sort(students);
    System.out.println(Arrays.toString(students));
    Arrays.sort(seats);
    System.out.println(Arrays.toString(seats));

    int count;
    int sum=0;
    for(int i=0;i<students.length;i++){
        count=50000;
        int temp=students[i];
        for(int j=0;j<seats.length;j++){
            int subs=Math.abs(temp-seats[j]);
            if(subs<count){
                count=subs;
            }
        }
        sum=sum+count;

    }
    return sum;

}

/*
    static int add(int[][] points) {
        int sum = 0;
        for (int i = 0; i < points.length-1; i++) {
            int difference=Math.abs(points[i][0]-points[i+1][0]);
                    if(difference>sum){
                        sum=difference;
                    }
        }
        return sum;
    }
            S
   static void swap(int [][] soln){
       for (int i = 0; i < soln.length-1; i++) {
           for (int j = 0; j < soln.length-i-1; j++) {
               if(soln[j][0]>soln[j+1][0]){
                   int temp=soln[j][0];
                   soln[j][0]=soln[j+1][0];
                   soln[j+1][0]=temp;
               }
           }
       }
    }*/
    static public int deleteGreatestValue(int[][] grid) {

        for(int i=0;i<grid.length;i++){

            Arrays.sort(grid[i]);

        }
        int i=grid.length-1;
        int sum=0;
        for(int j=0;j<grid[i].length;j++){
            sum+=grid[i][j];
        }
        return sum;
    }
}


