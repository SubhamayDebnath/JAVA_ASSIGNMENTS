import java.util.*;
public class a1q6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        for (int i = 2; i<=num ; i++ ){
            boolean isPrime=true;
            for (int j=2; j < i ;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
