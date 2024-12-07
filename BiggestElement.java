public class BiggestElement {
    public static void main(String[] args) {
        int [] a={12,24,30,12,45,55,60,43};
    int biggest = getBiggest(a);
    System.out.println("Biggest is " + biggest);
}
    public static int getBiggest(int[] a){
        int biggest = a[0];
        for(int i = 0;i<a.length;i++){
            if(a[i]>biggest){
                biggest = a[i];
            }
        }return biggest;
    }
    } 

