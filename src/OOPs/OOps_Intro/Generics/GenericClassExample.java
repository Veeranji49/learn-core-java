package OOPs.OOps_Intro.Generics;


// A generic class with a type parameter T
class Box<T> {

    private T value;

    // Constructor
    public Box(T value) {
        this.value = value;
    }

    // Getter and setter
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericClassExample {

    public static void main(String[] args) {

        // Creating a Box for Integer
        Box<Integer> integerBox = new Box<>(10);
        System.out.println("Integer Value: " + integerBox.getValue());

        // Creating a Box for String
        Box<String> stringBox = new Box<>("Hello");
        System.out.println("String Value: " + stringBox.getValue());
    }
}
