interface Animal{
    void eat();
}
interface Mammal{
    void run();
}
class Dog implements Animal, Mammal{
    public void eat(){
        System.out.println("Dog eats bones");
    }
    public void run(){
        System.out.println("Dog runs on four legs");
    }
}
public class a3q6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();

    }
}
