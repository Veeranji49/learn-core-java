package oops.OOps_Intro.Access_Modifiers;

public class AccessModifierExample {

    // private: Accessible only within this class
    private String privateField = "Private Field";

    // default (no modifier): Accessible within the same package
    String defaultField = "Default Field";

    // protected: Accessible within the same package and subclasses
    protected String protectedField = "Protected Field";

    // public: Accessible from any other class
    public String publicField = "Public Field";

    // private method
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // default method
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // protected method
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // public method
    public void publicMethod() {
        System.out.println("Public Method");
    }

    public void displayAll() {
        // Accessing all fields and methods within the same class
        System.out.println(privateField);
        System.out.println(defaultField);
        System.out.println(protectedField);
        System.out.println(publicField);

        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }

    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();

        // Accessing fields and methods within the same class
        example.displayAll();

        // Accessing fields directly (outside of displayAll)
        // System.out.println(example.privateField); // Not accessible, will cause an error
        System.out.println(example.defaultField); // Accessible
        System.out.println(example.protectedField); // Accessible
        System.out.println(example.publicField); // Accessible

        // Accessing methods directly (outside of displayAll)
        // example.privateMethod(); // Not accessible, will cause an error
        example.defaultMethod(); // Accessible
        example.protectedMethod(); // Accessible
        example.publicMethod(); // Accessible
    }
}
