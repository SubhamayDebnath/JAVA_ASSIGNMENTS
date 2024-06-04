import java.util.*;

class Student2{
    private String name;
    private int age;
    private String grade;

    public void getData(String name, int age, String grade){
        this.name=name;
        this.age=age;
        this.grade = grade;
    }
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
   }

}
public class a2q5 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.getData("Subhamay Debnath", 24, "A");
        s2.getData("Subhra Sarkar", 71, "B");
        System.out.println("Student 1 data:");
        s1.printData();
        System.out.println();
        System.out.println("Student 2 data:");
        s2.printData();

    }
}
