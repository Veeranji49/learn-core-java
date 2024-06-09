package OOPs.Polymorphism;

public class CompileTime_Polymorphism {

        // Method to add two integers
        public int add(int a, int b) {
            return a + b;
        }

        // Method to add three integers
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // Method to add two doubles
        public double add(double a, double b) {
            return a + b;
        }

        // Method to concatenate two strings
        public String add(String a, String b) {
            return a + b;
        }

        public static void main(String[] args) {
            CompileTime_Polymorphism math = new CompileTime_Polymorphism();

            // Calls the add method with two integers
            int result1 = math.add(5, 10);
            System.out.println("Addition of two integers: " + result1);

            // Calls the add method with three integers
            int result2 = math.add(5, 10, 15);
            System.out.println("Addition of three integers: " + result2);

            // Calls the add method with two doubles
            double result3 = math.add(5.5, 10.5);
            System.out.println("Addition of two doubles: " + result3);

            // Calls the add method with two strings
            String result4 = math.add("Hello, ", "world!");
            System.out.println("Concatenated string: " + result4);
        }
    }

