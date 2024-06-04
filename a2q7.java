abstract class A {
    public abstract void display();    
}
class B extends A{
    public void display(){
        System.out.println("Call me from B");
    }
}
public class a2q7 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
