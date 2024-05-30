package collections.List.Stack;

import java.util.Stack;

public class Stack_Methods {

    public static void main(String[] args)
    {
		/*

			A Stack in Java is a collection that operates on a last-in,
			 first-out (LIFO) basis, where elements are added and removed
			  from the top. It extends the Vector class and is commonly used
			   for managing elements in a manner similar to a physical stack
			    of items.

		 */

		/*
		 queue = First In First Out(FIFO)
		 stack = Last In First Out (LIFO)

		 	1) Default capacity			= 10
		 	2) Intial capacity 			= 10
		 	3) Allows duplicates		= yes
		 	4) Allows null values		= yes
		 	5) Maintains insertion order= yes
		 	6) Maintains sorted order	= no
		 	7) random access elements	= yes
		 	8) is it synchronization	= yes
		 	9) good at 					= LIFO manner

		 */


        // It allows all the implemented methods of vector


        ////////   Stack class Methods  ////////

        Stack<String> stk=new Stack<String>();

        //adding the elements in stack
        stk.push("list");
        stk.push("vector");
        stk.push("stack");
        stk.push("linkedlist");
        stk.push("arraylist");
        stk.push("set");
        stk.push("hashset");
        stk.push("linkedhashset");
        stk.push("map");

        //displaying all the elements
        System.out.println(stk);

        //deletes the last element in stack in first
        System.out.println(stk.pop());
        System.out.println("pop:"+stk);

        //It shows the last element but not deleted
        System.out.println(stk.peek());
        System.out.println("Peek:"+stk);

        //it gives the index of the element in stack
        System.out.println(stk.search("set"));

        //checking it is empty or not
        System.out.println(stk.isEmpty());

        //empty or not
        System.out.println(stk.empty());

        System.out.println(stk.clone());


    }
}
