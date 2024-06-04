import java.util.*;

public class a1q5 {
    static long Factorial(long x){
        if (x==0){
            return 1;
        }else{
            return (x * Factorial(x-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        long a = sc.nextLong();
        long fact = Factorial(a);
        System.out.println(fact);
    }
}
