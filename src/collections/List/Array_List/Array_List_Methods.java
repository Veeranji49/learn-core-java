package collections.List.Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List_Methods {

    public static void main(String[] args) {


        ////@@@@***  ArrayList Methods  ***@@@@////

		/*

		 	An ArrayList in Java is a dynamic collection that can store multiple
		 	items of any type. It automatically adjusts its size as you add or
		 	remove items. Think of it as a expandable list that can hold various
		 	things in your Java program.

		 */


		/*

		 1)Default Capacity 			= 0
		 2)Initial Capacity 			= 10
		 3)Allows duplicates 			= yes
		 4)Allows null values			= yes
		 5)Maintains insertion order	= yes
		 6)Maintains sorted order 		= no
		 7)Random access elements 		= yes
		 8)Is it synchronization		= no
		 9)It is good at Multithreading, data storing,retrieving

		 */


        ArrayList<String> list=new ArrayList<String>();

        //adding the values to the arrayList
        list.add("anji");
        list.add("veeru");
        list.add("mouse");
        list.add("lakshman");
        list.add("veeresh");
        list.add("saroja");
        list.add("mallikarjuna");

        //displaying the values
        System.out.println(list);

        //To reverse the arraylist
        Collections.reverse(list);
        System.out.println(list);

        ArrayList<String> arr=new ArrayList<String>();

        //adding the values to second arraylist
        arr.add("computer");
        arr.add("mouse");
        arr.add("cpu");
        arr.add("keyboard");
        arr.add("laptop");
        arr.add("anji");

        //displaying all the values
        System.out.println("displaying arr elements:"+arr);

        System.out.println("equal :"+arr.equals(list));

        //index
        arr.indexOf(list);
        System.out.println("index:"+arr);

        //Retrieving single element
        System.out.println(list.get(6));

        //deleting single element
        System.out.println(arr.remove(3));
        System.out.println(arr);

        //deleting all elements
        System.out.println(arr.removeAll(list));

        //displaying all the elements
        System.out.println(arr);

        //return an array containing all the elements in the list
        arr.toArray();
        System.out.println("array:"+arr);

        //Updating the elements with specified index
        System.out.println(arr.set(0,"processor"));
        System.out.println(arr);

        //to clear all the elements
        arr.clear();
        System.out.println(arr);

        ArrayList<String> str=new ArrayList<String>();

        //adding the elements
        str.add("anji");
        str.add("computer");
        str.add("cpu");
        str.add("god");
        str.add("goddess");
        str.add("brahma");
        str.add("vishnu");
        str.add("maheshwara");
        str.add("veeranji");
        str.add("manjunatha");
        str.add("anjaneya");
        str.add(3,"bag");


        //displaying all the elements
        System.out.println("displaying:"+str);

        //It will become synchronisation elements
        //it will not access multiple threads at a time
        Collections.synchronizedList(str);

        //returns a list iterator over the elements in the list
        str.listIterator();
        System.out.println("List iterator:"+str);

        //returns a sequencial collection with the stream
        str.stream();
        System.out.println("stream:"+str);


        //returns the hashcode value for the list
        str.hashCode();
        System.out.println("hashcode:"+str);



        //returns elements in proper sequence
        str.iterator();
        System.out.println("iterator:"+str);

        //Length of list elements
        System.out.println(str.size());

        //verification= the element is present or not
        System.out.println(str.contains(list));
        System.out.println(str.contains("cpu"));

        //It is empty or not
        System.out.println(str.isEmpty());

        //returns a shallow copy of arraylist
        str.clone();
        System.out.println("clone:"+str);

        //retains only the elements in the specified locations
        System.out.println(str.retainAll(list));
        System.out.println(str);
    }

}
