package collections.List.Vector;

import java.util.Vector;

public class Vector_Methods {

    public static void main(String[] args)
    {

		/*
		 	A Vector in Java is a synchronized dynamic array-like structure that can
		 	 hold multiple elements of any type, offering thread-safe operations
		 	  in multi-threaded environments.
		 */


		/*

		 1)Default Capacity 			= 10
		 2)Initial Capacity 			= 10
		 3)Allows duplicates 			= yes
		 4)Allows null values			= yes
		 5)Maintains insertion order 	= yes
		 6)Maintains sorted order 		= no
		 7)Random access elements 		= yes
		 8)Is it synchronization		= yes
		 9)It is good at Multithreading, data storing,retrieving

		 */

        ////////  Vector Class Methods  ////////

        Vector<String> v1=new Vector<String>();

        //adding the elements to the vector
        v1.add("apple");
        v1.add("banana");
        v1.add("guava");
        v1.add("mango");
        v1.add("grapes");
        v1.add("orange");
        v1.add("pineapple");
        v1.add("sapota");

        //displaying all the elements in the vector v1
        System.out.println("Displaying v1:"+v1);

        //getting / retrieving single element
        System.out.println(v1.get(4));

        //remvoing element from v1
        System.out.println(v1.remove(3));
        System.out.println(v1);

        //The element is present or not
        System.out.println(v1.contains("apple"));

        //displaying in array elements
        v1.toArray();
        System.out.println("Array:"+v1);

        //Length of vector v1
        System.out.println("length:"+v1.size());

        //updating the elements
        v1.set(6, "papaya");
        System.out.println("Updating:"+v1);

        //capactity of vector v1
        v1.capacity();
        System.out.println("capacity:"+v1);

        //The vector is empty or not
        System.out.println("Is Empty:"+v1.isEmpty());

        //returns hashcode values for the list
        v1.hashCode();
        System.out.println("hashcode:"+v1);

        //deleting all the elements in the vector
        v1.clear();
        System.out.println("All clear:"+v1);

    }
}
