import java.util.Arrays;

public class SumOf2ndAnd3rdLargest {
    public static void main(String[] args) {
     
        int[] values = {10, 51, 53, 39, 47, 44, 21};

        
        int[] largestNumbers = find2ndAnd3rdLargest(values);

       
        int sum = largestNumbers[0] + largestNumbers[1];
        System.out.println("Sum of 2nd and 3rd largest numbers: " + sum);
    }

    
    private static int[] find2ndAnd3rdLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

       
        int secondLargest = arr[n - 2];
        int thirdLargest = arr[n - 3];

        return new int[]{secondLargest, thirdLargest};
    }
}
