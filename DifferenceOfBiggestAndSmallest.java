public class DifferenceOfBiggestAndSmallest {
    public static void main(String[] args) {
        int[] a = {12, 24, 30, 10, 45, 55, 60, 43};
        int diff = getDifference(a);
        System.out.println("Biggest Smallest Difference is " + diff);
    }

    public static int getDifference(int[] a) {
        int biggest = a[0];
        int smallest = a[0]; // Variable name corrected (case-sensitive)

        for (int i = 0; i < a.length; i++) {
            if (a[i] > biggest) {
                biggest = a[i];
            }
            // The `if` block for finding `smallest` must be outside the above `if`
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        return biggest - smallest;
    }
}
