package sorting;

public class RemoveElementExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Element to be removed (4th element)
        int elementToRemove = 4;

        int newSize = array.length - 1;
        int[] newArray = new int[newSize];

        int newArrayIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                newArray[newArrayIndex++] = array[i];
            }
        }

        // Print the updated array
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }
}
