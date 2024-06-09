package OOPs.Inheritance;

public class Single_Level_Inheritance {

    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();
    }
}

class Parent {

    public void method1() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {

    public void method2() {
        System.out.println("This is Child class");
    }
}