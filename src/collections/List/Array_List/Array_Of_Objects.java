package collections.List.Array_List;

import java.util.ArrayList;

public class Array_Of_Objects {

    public static void main(String[] args) {


        //Printing Employee details by using arrays

        ArrayList<Employee> list=new ArrayList<Employee>();

        long[] ids= {1,2,3,4,5,};
        String[] names= {"anji","veeresh","Lakshman","girija","Lakshmi"};
        double[] salaries= {10000,20000,30000,40000,50000};
        String[] locations= {"pkbr","adoni","kosigi","sirigeri","ayodhya"};

        for(int i=0; i<=ids.length-1; i++)
        {
            Employee emp=new Employee(ids[i],names[i],salaries[i],locations[i]);
            list.add(emp);
        }
        System.out.println("Employee details are:");
        for(Employee e:list)
        {
            System.out.println(e.id+" "+e.name+" "+e.location+" "+e.salary);
        }
    }
}
class Employee
{
    long id;
    String name;
    double salary;
    String location;

    public Employee(long id,String name,double salary,String location)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.location=location;
    }
}
