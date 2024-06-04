import java.util.*;
class A{
    int a;
    double b;
    String c;
    A(){
        a = 100;
        b = 45.32;
        c = "Subhamay";
    }
    A(int x){
        a=x;
        b=0.0;
        c="";
    }
    A(double y, String z){
        a=0;
        b=y;
        c=z;
    }
}
public class a1q10 {
    public static void main(String[] args) {
        A r = new A();
        A r2 = new A(10);
        A r3 = new A(23.88, "Subhamay");
        System.out.println(r.a + " " + r.b + " " + r.c);
        System.out.println(r2.a + " " + r2.b + " " + r2.c);
        System.out.println(r3.a + " " + r3.b + " " + r3.c);
    }
}
