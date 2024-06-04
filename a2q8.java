interface Sum {
    void displaySum();
}
interface Add {
    void displayAdd();
}
class A1 implements Sum, Add {
    private int num1;
    private int num2;
    public  A1(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void displaySum(){
        int sum=num1+num2;
        System.out.println("Sum is "+sum);
    }
    public void displayAdd(){
        int add=num1+num2;
        System.out.println("Add is "+add);
    }
}
public class a2q8 {
    public static void main(String[] args) {
        A1 obj = new A1(15,3);
        obj.displaySum();
        obj.displayAdd();
    }
}
