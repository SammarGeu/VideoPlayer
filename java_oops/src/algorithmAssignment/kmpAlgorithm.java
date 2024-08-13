//Ques 25- Knuth-Morris-Pratt algorithm(KMP).
package algorithmAssignment;
import java.util.*;
public class kmpAlgorithm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence=scn.nextLine();
        System.out.println("enter the string that you wont to found in the sentence");
        String pattern=scn.nextLine();
        kmp(sentence,pattern);
    }

    static  void kmp(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] lps = LPSArray(pattern);
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = lps[j - 1];
            }
            if (text.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) {
                System.out.println("Pattern found at index " + (i - j + 1));
                j = lps[j - 1];
            }
        }
    }

    static int[] LPSArray(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

}
