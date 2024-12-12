package collections.List.Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee_details_by_Scanner {

    public static void main(String[] args) {

        ArrayList<Employee1> list = new ArrayList<Employee1>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Employee details:");

        for (int j = 1; j <= 5; j++) {
            System.out.println("Enter Employee" + " " + j + " " + "details:");
            long id = sc.nextLong();
            String name = sc.next();
            double salary = sc.nextDouble();
            String location = sc.next();

            Employee1 emp = new Employee1(id, name, salary, location);
            list.add(emp);

            for (Employee1 e : list) {
                System.out.println(e.id + e.name + e.salary + e.location);
            }
        }
    }
}

class Employee1 {
    long id;
    String name;
    double salary;
    String location;

    public Employee1(long id, String name, double salary, String location) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    public void details() {
        System.out.println(this.id + this.name + this.location + this.salary);

    }
}
