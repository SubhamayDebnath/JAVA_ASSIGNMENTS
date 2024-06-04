import java.util.*;
class A{
    void fun(int x , int y){
        int c = (x+y);
        System.out.println(c);
    }
    void fun(double x , double y){
        double c = (x * y);
        System.out.println(c);
    }

}
public class a1q11 {
    public static void main(String[] args) {
        A r=new A();
        r.fun(13,23);
        r.fun(57, 60);
    }
}
