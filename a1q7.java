import java.util.*;

public class a1q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double n = sc.nextLong();
        double sum=0,factorial=1;
        for(int i=1;i<=n;i++){
            factorial *=i;
            sum+=1.0/factorial;
        }
        System.out.println("Sum of the first " + n + " terms: " + sum);
    }
}
