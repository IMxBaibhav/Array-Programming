import java.util.Arrays;

public class BinarySearch {
    // Function returns true if the given element is found in the array
    private static void check(int[] arr, int toCheckValue) {
        // Sort the array
        Arrays.sort(arr);
        
        // Check if the specified element is present in the array using Binary Search
        int result = Arrays.binarySearch(arr, toCheckValue);
        boolean test = result >= 0; // If result >= 0, element is found
        
        System.out.println("Is " + toCheckValue + " present in the array: " + test);
    }

    public static void main(String[] args) {
        int[] a = { 5, 1, 1, 9, 7, 2, 6, 10 };
        int ele = 7;
        check(a, ele);
    }
}
