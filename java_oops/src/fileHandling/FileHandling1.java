package fileHandling;

import java.io.*;

public class FileHandling1 {

    public static void task01() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string:");
            String s1 = br.readLine();

            File file = new File("/Users/sammarsaini/Desktop/java_oops/java_oops/src/fileHandling/file1.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(s1);
            writer.close();

            FileReader reader = new FileReader(file);
            int character;
            System.out.println("Content from file1.txt:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

            int wordCount = 0;
            int charCount = 0;
            boolean inWord = false;
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                if (Character.isWhitespace(ch)) {
                    if (inWord) {
                        wordCount++;
                        inWord = false;
                    }
                } else {
                    charCount++;
                    inWord = true;
                }
            }
            if (inWord) {
                wordCount++;
            }

            FileWriter appendWriter = new FileWriter(file, true);
            appendWriter.write("\nwords = " + wordCount);
            appendWriter.write("\nchars = " + charCount);
            appendWriter.close();

            reader = new FileReader(file);
            System.out.println();
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task02() {
        try {
            File file = new File("/Users/sammarsaini/Desktop/java_oops/java_oops/src/fileHandling/file1.txt");
            FileReader charReader = new FileReader(file);
            int charValue;
            System.out.println("\nContent of file1.txt character by character:");
            while ((charValue = charReader.read()) != -1) {
                System.out.print((char) charValue);
            }
            charReader.close();


            FileInputStream byteReader = new FileInputStream(file);
            System.out.println("\n\nContent of file1.txt byte by byte:");
            int byteValue;
            while ((byteValue = byteReader.read()) != -1) {
                System.out.print((byte) byteValue + " ");
            }
            byteReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 01:");
        task01();

        System.out.println("\nTask 02:");
        task02();
    }
}
