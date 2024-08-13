package sorting;

public class StringCompareExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Case-sensitive comparison
        boolean areEqual = str1.equals(str2);
        System.out.println("Are the strings equal (case-sensitive)? " + areEqual);

        // Case-insensitive comparison
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Are the strings equal (case-insensitive)? " + areEqualIgnoreCase);
    }
}
