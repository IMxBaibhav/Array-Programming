public class AcceptArrayString {
    public static void main(String[] args) {
        String[] a={"abc","hello","hii","elvish bhoi"};
        String result=printbiggestString(a);
        System.out.println(result);
    }
    public static String printbiggestString(String[] a){
        String biggest ="";
        for(String p:a){
            if(p.length()>biggest.length()){
                biggest=p;
            }
        }return biggest;
    }
}
