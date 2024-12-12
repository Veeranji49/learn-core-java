package collections.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Interface_Methods {

    public static void main(String[] args) {

		/*

			The Map interface in Java facilitates storing and managing data in
			key-value pairs, allowing efficient retrieval and manipulation of
			values based on corresponding keys.

		 */


        //properties of HashMap
		/*

		 	Default Capacity			= 16
		 	Initial Capacity			= 16
		 	Allw duplicates				= allow duplicates in values, but not keys
		 	Allow null values			= yes
		 	Maintains Insertion order	= no
		 	Maintains Sorted order		= no
		 	Random Access elements		= no
		 	Is it Synchronisation		= no
		 */

        //properties of LinkedHashMap

		/*
	 	Default Capacity			= 16
	 	Initial Capacity			= -
	 	Allw duplicates				= allow duplicates in values, but not keys
	 	Allow null values			= yes
	 	Maintains Insertion order	= yes
	 	Maintains Sorted order		= no
	 	Random Access elements		= no
	 	Is it Synchronisation		= no
	 */

        //properties of TreeMap

		/*

		 	Default Capacity			= -
		 	Initial Capacity			= -
		 	Allw duplicates				= allow duplicates in values, but not keys
		 	Allow null values			= yes
		 	Maintains Insertion order	= no
		 	Maintains Sorted order		= yes
		 	Random Access elements		= no
		 	Is it Synchronisation		= no

		 */


        //properties of Hashtable

				/*

				 	Default Capacity			= 11
				 	Initial Capacity			= -
				 	Allw duplicates				= allow duplicates in values, but not keys
				 	Allow null values			= no
				 	Maintains Insertion order	= no
				 	Maintains Sorted order		= no
				 	Random Access elements		= no
				 	Is it Synchronisation		= yes

				 */


        //creating of Map
        //Map<Integer,String> m=new Hashtable<Integer,String>();
        //Map<Integer,String> m=new LinkedHashMap<Integer,String>();
        //Map<Integer,String> m=new TreeMap<Integer,String>();
        Map<Integer, String> m = new HashMap<Integer, String>();


        //adding the elements
        m.put(1, "anji");
        m.put(2, "veeru");
        m.put(3, "cristiano");
        m.put(4, "messi");
        m.put(5, "neymar");
        m.put(6, "system");

        //displaying all elements
        System.out.println(m);

        //Retrieving all the key elements
        Set<Integer> keys = m.keySet();
        for (Integer key : keys) {
            System.out.println("Keys:" + key);
        }

        //Retrieving all the value elements
        Collection<String> values = m.values();
        for (String value : values) {
            System.out.println("ValuesL:" + value);
        }

        //Retrieving a value based on key element
        System.out.println(m.get(3));

        //Deleting a key value element
        m.remove(6);
        System.out.println(m);


        //Checking the key is present or not
        System.out.println(m.containsKey(3));

        //Checking the value is present or not
        System.out.println(m.containsValue("cristiano"));


        //length of Map elements
        System.out.println(m.size());


        //**  Update the map elements **//
		/* 1)
			m.put(4, "mouse");
			System.out.println(m);

		*/

        //Inserting element if element is not there in the map
        m.putIfAbsent(6, "keyboard");
        System.out.println(m);


        // Update the map elements //
        m.replace(6, "pen");
        System.out.println(m);

        //checking it is empty or not
        System.out.println(m.isEmpty());


        //Removing all the elements in the map
        m.clear();
        System.out.println(m);


    }
}
