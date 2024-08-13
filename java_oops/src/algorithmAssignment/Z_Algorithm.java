//Ques 6- Z Algorithm
package algorithmAssignment;
import java.util.*;
public class Z_Algorithm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Z_Algorithm obj=new Z_Algorithm();
        System.out.println("enter a sentence");
        String sentence=scn.nextLine();

        System.out.println("enter the string that you wont to found in the sentence");
        String pattern=scn.nextLine();

       List<Integer> result=obj.matchPattern(sentence.toCharArray(),pattern.toCharArray());
        for (Integer element : result) {
            System.out.println(element);
        }
    }
      int[] calculateZ(char []input) {
        int []Z = new int[input.length];
        int left = 0;
        int right = 0;
        for(int k = 1; k < input.length; k++) {
            if(k > right) {
                left = right = k;
                while(right < input.length && input[right] == input[right - left]) {
                    right++;
                }
                Z[k] = right - left;
                right--;
            } else {
                int k1 = k - left;
                if(Z[k1] < right - k + 1) {
                    Z[k] = Z[k1];
                } else {
                    left = k;
                    while(right < input.length && input[right] == input[right - left]) {
                        right++;
                    }
                    Z[k] = right - left;
                    right--;
                }
            }
        }
        return Z;
    }
    public List<Integer> matchPattern(char []text, char []pattern) {
        char []newString = new char[text.length + pattern.length + 1];
        int i = 0;
        for(char ch : pattern) {
            newString[i] = ch;
            i++;
        }
        newString[i] = '$';
        i++;
        for(char ch : text) {
            newString[i] = ch;
            i++;
        }
        List<Integer> result = new ArrayList<>();
        int[] Z = calculateZ(newString);

        for(i = 0; i < Z.length ; i++) {
            if(Z[i] == pattern.length) {
                result.add(i - pattern.length - 1);
            }
        }
        return result;
    }
}
