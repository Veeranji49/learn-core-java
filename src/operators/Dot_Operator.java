package operators;

public class Dot_Operator {

    public static void main(String[] args) {

        // The dot operator is used to call methods of an object.

        Dog myDog = new Dog();
        myDog.name = "Buddy"; // Using . to access and assign value to the field
        myDog.age = 5;

        System.out.println(myDog.name); // Using . to access the field
        System.out.println(myDog.age);

    }
}
class Dog {
    String name;
    int age;
}