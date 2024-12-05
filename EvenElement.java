public class EvenElement {
    public static void getEvenElement() {
        int[] a ={24,26,7,1,3,6,2};
        for(int i = 0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }

    }
    public static void main(String[] args) {
        getEvenElement();
    }
}
