package variables;

public class Variables {

    static int staticVariable = 1234; // static variable with static keyword and it will access directly to the
    // created methods

    String name = "veeranji jilakara"; // instance variables without static keyword and it will be access by using
    // class object.

    public static void main(String[] args) {
        System.out.println(staticVariable);
        anji(23000.00);
    }

    public static void anji(double cost) {
        int i = 9;
        Variables variables = new Variables();
        System.out.println(staticVariable);// static variable
        System.out.println(variables.name);// non-static variable
        System.out.println(i); // local variable is inside method and directly access
        System.out.println(cost);// method parameters access method to the main method and directly access.
    }

}

/* ****** Global scope ****/
//static variable : The variable will be created inside the class outside to method with static keyword and accessed by classname.

//instance variable : The variable will be created inside the class outside to method without static keyword and it will be access by using class object.


//******     Local Scope    *****//
//Local variable : The variable will be created inside the class, inside the method without any static keyword and directly access

//Method Parameters : The variable will be created inside the class, inside the method without any static keyword and access method to the main method and directly access.


//###########   Variable Naming Conventions     #########//
/*
 1) case sensitive  :  name ||  NAME
 2) if variable name has one word, use the lower case letters
 3) if variable name has multiple letters, use the camelCase :  variableName, firstName, lastName
 4) dont use keywords as variable names
 5) use special characters like $, _  and _ will use for constant values like MATH_PI = 3.14;
 6) dont use shortcuts for variables names and it will impact on next developers.

 */
