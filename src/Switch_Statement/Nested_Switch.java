package Switch_Statement;

import java.util.Scanner;

public class Nested_Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id and department :");
        int id = sc.nextInt();
        String department = sc.next();

        switch (id) {

            case 1:
                System.out.println("Id is 1");
                break;

            case 2:
                System.out.println("Id is 2");
                break;

            case 3:
                System.out.println("Id is 3");
                switch (department) {

                    case "IT":
                        System.out.println("IT department with id 3");
                        break;
                }
                switch (department) {

                    case "Non-IT":
                        System.out.println("Non-IT department with id 3");
                        break;
                }
                break;

            case 4:
                System.out.println("Id is 4");
                switch (department) {

                    case "Voice":
                        System.out.println("Voice process with id 4");
                        break;

                    default:
                        System.out.println("Enter a valid department");
                }
                break;

            default:
                System.out.println("Enter a valid id and department");
        }

    }
}
