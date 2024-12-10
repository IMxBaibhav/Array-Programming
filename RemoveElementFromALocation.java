public class RemoveElementFromALocation {
    public static int[] removeElement(int[] a, int index) {
        if (index < 0 || index >= a.length) {
            throw new IllegalArgumentException("Invalid index");
        }

        int[] b = new int[a.length - 1];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i != index) {
                b[j++] = a[i];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {12, 13, 30, 16, 30};
        int index = 2; // Example index to remove

        int[] b = removeElement(a, index);

        // Print the result
        for (int value : b) {
            System.out.print(value + " ");
        }
    }
}
