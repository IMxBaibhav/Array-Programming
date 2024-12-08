class RemoveElement {
    public static void main(String[] args) {
        int[] a = {12, 18, 56, 14, 20};
        int[] b = removeElement(a, 3); // Removing element at index 3

        System.out.println("Original array:");
        for (int x : a) {
            System.out.print(x + " ");
        }

        System.out.println("\nUpdated array:");
        for (int i : b) {
            System.out.print(i + " ");
        }
    }

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
}
