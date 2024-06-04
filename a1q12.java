
class outer {
    int a=10;
    class inner1{
        int b=20;
        class inner2{
            int c=30;
            void display(){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        }
    }
}
public class a1q12 {
    public static void main(String[] args) {
        outer r=new outer();
        outer.inner1 r2=r.new inner1();
        outer.inner1.inner2 r3=r2.new inner2();
        r3.display();
    }
}