package oop;

import java.util.*;


public class Dequeue{
	    public static void main(String[] args)
	    {
	        Deque<String> deque = new LinkedList<String>();
	 
		deque.add("Element 1 ");
		deque.addFirst("Element 2 ");
		deque.offer("Element 3 ");
		deque.offerFirst("Element 4 )");
		deque.offerLast("Element 5 )");
	       System.out.println(deque);
	 deque.removeFirst();
     deque.removeLast();
     System.out.println("Deque after removing first and last : "+ deque);

	    }
	}

