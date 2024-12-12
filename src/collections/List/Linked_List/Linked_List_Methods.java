package collections.List.Linked_List;

import java.util.LinkedList;

public class Linked_List_Methods {

    public static void main(String[] args) {

		/*

			A linked list is a collection of elements, where each element points to
			the next one in the sequence, forming a chain. It's a flexible structure
			 allowing for easy addition and removal of elements anywhere in the
			 sequence.

		 */

		/*

		 	1) Default Capacity			= 0
		 	2) Initial Capacity			= 0
		 	3) Allows duplicates		= yes
		 	4) Allows null values		= yes
		 	5) Maintains Insertion Order= yes
		 	6) Maintains Sorted Order	= no
		 	7) Random access of elements= yes
		 	8) Is it synchronization	= no
		 	9) good at 					= it is good at data manupulations

		 */

        //////   LinkedList class Methods  /////

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("cristiano");
        ll.add("messi");
        ll.add("neymar");
        ll.add("zlatan");
        ll.add("ramos");
        ll.add("marcelo");
        ll.add("pele");
        ll.add("benzema");

        //displaying all the elements
        System.out.println(ll);

        //displaying all the elements using foreach loop
        for (String ele : ll) {
            System.out.println(ele);
        }

        //retrieving one element
        System.out.println(ll.get(5));

        //removing element from linkedlist
        System.out.println(ll.remove(5));
        System.out.println(ll);

        //the element is present or not
        System.out.println(ll.contains("ramos"));


        //converting into array elements
        ll.toArray();
        System.out.println(ll);


        //it shows length of linked list
        System.out.println(ll.size());


        //updating the elements
        ll.set(6, "anji");
        System.out.println(ll);

        //It shows it is empty or not
        System.out.println(ll.isEmpty());

        //It clear all the elements in linkedlist
        ll.clear();
        System.out.println(ll);


        //and other implements methods of list interface
    }
}
