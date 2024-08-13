//Ques 3-KnapSack
package algorithmAssignment;

import java.util.*;
public class knapsack {

    public static double[] Ratio(int[] weights, int[] values) {
        int n = weights.length;
        double[] ratios = new double[n];

        for (int i = 0; i < n; i++) {
            ratios[i] = (double) values[i] / weights[i];
        }
        return ratios;
    }

    public static void Knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        double[] ratios = Ratio(weights, values);

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(ratios);
        int currentWeight = 0;
        double totalValue = 0.0;

        for (int j = 0; j < indices.length; j++) {
            int i = indices[j];
            if (currentWeight + weights[i] <= capacity) {
                currentWeight += weights[i];
                totalValue += values[i];
            } else {
                int remainingCapacity = capacity - currentWeight;
                totalValue += values[i] * ((double) remainingCapacity / weights[i]);
                break;
            }
        }

        System.out.println("Total value in the knapsack: " + totalValue);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight for item " + (i + 1) + ": ");
            weights[i] = scanner.nextInt();

            System.out.print("Enter value for item " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        System.out.print("Enter knapsack capacity: ");
        int capacity = scanner.nextInt();

        Knapsack(weights, values, capacity);

        scanner.close();
    }
}
