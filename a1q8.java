import java.util.*;
class quadratic{
    void quadraticFun(){
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a:");
        a = sc.nextInt();
        System.out.println("enter value of b:");
        b = sc.nextInt();
        System.out.println("enter value of c:");
        c = sc.nextInt();
        double d=(b*b)-4*a*c;
        if(d > 0){
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }else if (d==0){
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        }else{
            System.out.println("No real roots exist.");
        }
    }
}
public class a1q8 {

    public static void main(String[] args) {
        quadratic obj=new quadratic();
        obj.quadraticFun();
    }
}
