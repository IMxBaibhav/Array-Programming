public class SumOfAllElementOfArray {
    public static void main(String[] args) {
        int[] arr ={12,18,10,15,20,17};
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println("The sum of all element "+ sum);
    }
}
