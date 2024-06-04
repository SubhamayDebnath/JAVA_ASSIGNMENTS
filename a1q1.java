import java.util.*;
class a1q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num = sc.nextInt();
        long i=1,sum=1;
        while (i <= num){
            sum *= i;
            i++;
        }
        System.out.println("factorial of "+num+" is "+sum);
    }
}