public class LinearSearch {
    private static void check(int[] arr, int toCheckValue){
         // check if the specified element
        // is present in the array or not
        // using Linear Search method
        boolean test = false;
        for(int element: arr){
            if(element==toCheckValue){
                 test = true;
                 break;
            }
        }
        System.out.println(" Is " + toCheckValue + " Present in array: " + test);
    }
    public static void main(String[] args) {
         int [] a={  5, 1, 1, 9, 7, 2, 6, 10 };
         int ele = 7;
         check(a, ele);
    }
}
