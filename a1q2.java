import java.util.*;
class swapNum{
    int temp;
    public void swappingNumber(int x,int y){
        temp=x;
        x=y;
        y=temp;
        System.out.println("The value of A is " +x+" and the value of B is "+y);
    }
}
class a1q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value of A :");
        int a =sc.nextInt();
        System.out.println("Enter The value of A :");
        int b =sc.nextInt();
        swapNum obj=new  swapNum();
        obj.swappingNumber(a,b);
    }
}
