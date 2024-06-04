abstract class Vehicle{
    public abstract void engine();
}

class Car extends Vehicle{
    public void engine(){
        System.out.println("Car has good engine");
    }
}
class Truck extends Vehicle{
    public void engine(){
        System.out.println("Truck has bad engine");
    }
}
public class a2q9 {
    public static void main(String[] args) {
        Car car=new Car();
        Truck truck=new Truck();
        car.engine();
        truck.engine();    
    }
}
