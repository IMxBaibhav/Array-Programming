public class SumOfAllElementDivisbleBy4 {
    public static void main(String[] args) {
        int[] a={12,23,30,12,45,55,60,43};
        boolean result = CheckSum(a);
        if(result){
            System.out.println("Sum is divisble by 4");
        }
        else{
            System.out.println("Sum is not divisble by 4");
        }
    }
        public static boolean CheckSum(int[] a){
            int sum = 0;
            for(int i = 0;i<a.length;i++){
                sum = sum + a[i];
            }
            System.out.println("sum is " + sum);
            return sum%4==0;
        }
    }

