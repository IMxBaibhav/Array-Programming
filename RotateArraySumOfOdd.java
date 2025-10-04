public class RotateArraySumOfOdd {
    public static void main(String[] args) {
        int arr[] = {5, 7, 9, 2, 7, 4, 4, 3};
        int rotations = 3;

        // Rotate right 'rotations' times
        int n = arr.length;
        for (int r = 0; r < rotations; r++) {
            int last = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }

        // Find sum of elements at odd indices
        int sum = 0;
        for (int i = 1; i < n; i += 2) {
            sum += arr[i];
        }   

        // Print result
        System.out.print("Rotated Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nSum of odd position numbers: " + sum);
    }
}
