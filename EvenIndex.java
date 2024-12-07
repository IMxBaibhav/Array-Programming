public class EvenIndex {
    public static void main(String[] args) {
        int[] arr = {12, 18, 10, 17, 15, 20};
        
        // Loop through indices of the array
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { // Check if the index is even
                System.out.println(arr[i]); // Print the value at even index
            }
        }
    }
}
