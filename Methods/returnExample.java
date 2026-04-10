
import java.util.Scanner;

public class returnExample {

    public static void main(String[] args) {
int ans = sum2();
System.out.println(ans);
        
    }
    static int sum2(){

    Scanner in = new Scanner(System.in);
    System.out.println("Enetr the first number");
    int num1 = in.nextInt();
System.out.println("Enetr the second number");
int num2 = in.nextInt();
int sum= num1+num2;
return sum;

    }
}
