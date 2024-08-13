//Ques 32- Eratosthenes algorithm
package algorithmAssignment;
import java.util.*;
public class SieveOfEratosthenes {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        System.out.println("enter the limit upto which you find prime numbers");
        int limit = scn.nextInt();

        List<Integer> list = Eratosthenes(limit);
        System.out.println("Prime numbers up to " + limit + ": " + list);
    }

    public static List<Integer> Eratosthenes(int n) {

        List<Integer> prime = new ArrayList<>();
        boolean[] arr = new boolean[n + 1];

        Arrays.fill(arr, true);
        for (int num = 2; num <= Math.sqrt(n); num++) {
            if (arr[num]) {
                for (int multiple = num * num; multiple <= n; multiple += num) {
                    arr[multiple] = false;
                }
            }
        }

        for (int num = 2; num <= n; num++) {
            if (arr[num]) {
                prime.add(num);
            }
        }
        return prime;
    }
}
