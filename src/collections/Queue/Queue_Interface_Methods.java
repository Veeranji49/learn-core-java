package collections.Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Interface_Methods {

    public static void main(String[] args) {

		/*

		 	A pqeue in collections is a sepqential data structure that follows the principle
		 	 of First-In-First-Out (FIFO), allowing elements to be inserted at the rear and
		 	  removed from the front, analogous to a line of people waiting for service,
		 	  commonly employed in task scheduling and event handling.

		 */


        //properties
		/*

		 	Default capacity			= 11
		 	Initial capacity			= 11
		 	Allows duplicates			= yes
		 	Allows Null values			= no
		 	Maintaines Insertion Order	= no
		 	Maintaines Sorted order		= no
		 	Random access elements		= no
		 	Is it synchronised			= no


		 */


        //creating of pqeue
        Queue<String> pq = new PriorityQueue<String>();


        //adding the elements
        pq.offer("anji");
        pq.offer("veeresh");
        pq.offer("lakshman:");
        pq.offer("mallikarjuna");
        pq.offer("saroja");
        pq.offer("girija");
        pq.offer("Lakshmi");
        pq.offer("Naveen");
        pq.offer("krishnaveni");

        //displaying the pqeue elements
        System.out.println(pq);


        //adding the elements
        pq.add("mouse");
        pq.add("keyboard");
        System.out.println(pq);

        //Showing top/head value but not deleted
        System.out.println(pq.peek());

        //showing top/head value but deleted
        System.out.println(pq.poll());
        System.out.println(pq);

        //deleted top value
        System.out.println(pq.remove());
        System.out.println(pq);

        //deleting specific value
        System.out.println(pq.remove("mouse"));
        System.out.println(pq);

        //length of the pqeue
        System.out.println(pq.size());

        //Elemement is present or not
        System.out.println(pq.contains("anji"));

        //checking pqeue is empty or not
        System.out.println(pq.isEmpty());


        //Deleting/removing all the elements
        pq.clear();
        System.out.println(pq);


        //creation of arrayDeque
        ArrayDeque<String> au = new ArrayDeque<String>();


        //adding the elements
        au.offer("buds");
        au.offerFirst("mouse");
        au.offerLast("keyboard");
        au.add("glass");
        au.addFirst("monitar");
        au.addLast("buttons");
        au.offer("wire");

        //displaying the elements
        System.out.println(au);

        //display top / head element but not deleted
        System.out.println(au.peek());
        System.out.println(au.peekFirst());
        System.out.println(au.peekLast());

        //display elements but deleted
        System.out.println(au.poll());
        System.out.println(au.pollFirst());
        System.out.println(au.pollLast());
        System.out.println(au);

        //checking it is empty or not
        System.out.println(au.isEmpty());

        //checking the element is present or not
        System.out.println(au.contains("glass"));

        //finding the length of queue
        System.out.println(au.size());

        //removing single element
        System.out.println(au.remove());
        System.out.println(au);

        //removing all the elements in queue
        au.clear();
        System.out.println(au);


    }
}
