package java5;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int ans=fact(n,1);
        System.out.println(ans);
    }
    static int fact(int n,int Fact){
        if(n==0){
            return 1;
        }
        Fact=n*fact(n-1,Fact);
        return  Fact;

    }
}
