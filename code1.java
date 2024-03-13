import java.util.Arrays;

public class ArraySortingAndCounting {

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 5, 2, 9, 5, 8, 2};
        int numberToFind = 2;

        // Sorting the array
        Arrays.sort(array);

        // Finding the number of occurrences
        int occurrences = countOccurrences(array, numberToFind);

        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Number of occurrences of " + numberToFind + ": " + occurrences);
    }

    private static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
