package collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Interface_Methods {

    public static void main(String[] args) {
		/*
		 	The Set interface in Java is a collection that stores unique elements,
		 	ensuring no duplicates, and it does not guarantee the order of elements,
		 	offering methods for adding, removing, and querying elements without
		 	duplicates, widely used for membership testing and eliminating duplicates
		 	 in collections.

		 */

        //properties of HashSet
		/*
		 	Default Capacity			= o
		 	Initial Capacity			= 16
		 	Allw duplicates				= no
		 	Allow null values			= yes
		 	Maintains Insertion order	= no
		 	Maintains Sorted order		= no
		 	Random Access elements		= no
		 	Is it Synchronisation		= no
		 */


        //creation of set/hashset
        HashSet<Integer> set = new HashSet<>();

        //adding the elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);

        //displaying the elements
        System.out.println(set);

        //checking it is present in which class
        System.out.println(set.getClass());

        //checking the element is present or not
        System.out.println(set.contains(6));

        //checking the set is empty or not
        System.out.println(set.isEmpty());

        //deleting an element in a set
        System.out.println(set.remove(7));
        System.out.println(set);

        //finding the length of the set
        System.out.println(set.size());

        //To remove all the elements in a set
        set.clear();
        System.out.println(set);


        //properties of LinkedHashSet
		/*
		 	Default Capacity			= 16
		 	Initial Capacity			= 16
		 	Allw duplicates				= no
		 	Allow null values			= yes
		 	Maintains Insertion order	= yes
		 	Maintains Sorted order		= no
		 	Random Access elements		= no
		 	Is it Synchronisation		= no
		 */

        //creation of LINKED HASHSET
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        //adding the elements in the set
        lhs.add("anji");
        lhs.add("veeru");
        lhs.add("bottle");
        lhs.add("mouse");
        lhs.add("keyboard");
        lhs.add("monitor");

        //displaying all the elements
        System.out.println(lhs);

        //finding the length of the set
        System.out.println(lhs.size());

        //deleting a element in a set
        System.out.println(lhs.remove("monitor"));
        System.out.println(lhs);

        //checking the element is present or not
        System.out.println(lhs.contains("mouse"));

        //checking the set is empty or not
        System.out.println(lhs.isEmpty());


        //deleting all the elements in a set
        lhs.clear();
        System.out.println(lhs);


        //properties of TreeSet
		/*
		 	Default Capacity			= 0
		 	Initial Capacity			= 0
		 	Allw duplicates				= no
		 	Allow null values			= no
		 	Maintains Insertion order	= no
		 	Maintains Sorted order		= yes
		 	Random Access elements		= no
		 	Is it Synchronisation		= no
		 */

        //Creation of TreeSet
        TreeSet<Integer> ts = new TreeSet<Integer>();

        //adding the elements in the TreeSet
        ts.add(11);
        ts.add(12);
        ts.add(13);
        ts.add(14);
        ts.add(15);
        ts.add(16);
        ts.add(17);
        ts.add(18);


        //Displaying all the elements in TreeSet
        System.out.println(ts);

        //finding the first element
        System.out.println(ts.first());


        //removing an element in TreeSet
        System.out.println(ts.remove(18));
        System.out.println(ts);

        //checking the set is empty or not
        System.out.println(ts.isEmpty());

        //finding the length of the set
        System.out.println(ts.size());

        //returns the greatest element
        System.out.println(ts.floor(16));

        //checking which class it is
        System.out.println(ts.getClass());

        //Returns the least element in this set strictly greater than thegiven element, or null if there is no such element
        System.out.println(ts.higher(13));

        //Returns the greatest element in this set strictly less than thegiven element, or null if there is no such element.
        System.out.println(ts.lower(17));

        //finding the last element
        System.out.println(ts.last());

        //Returns the greatest element in this set strictly less than thegiven element, or null if there is no such element.
        System.out.println(ts.pollFirst());

        //Returns the greatest element in this set strictly less than thegiven element, or null if there is no such element.
        System.out.println(ts.pollLast());

        //Returns the greatest element in this set strictly less than thegiven element, or null if there is no such element.
        System.out.println(ts.headSet(16));

        //Returns the greatest element in this set strictly less than thegiven element, or null if there is no such element.
        ts.clear();
        System.out.println(ts);


    }
}
