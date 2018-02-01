package queueinterface;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Deque;
import java.util.LinkedList;

public class QueueDemo {
	
	private static void dequeTest() {
		System.out.println("\nInside dequeTest ...");
		
		// Queue - FIFO

		Deque<String> deque = new ArrayDeque<>(2);
		deque.add("walden");
		deque.add("harry potter");
		deque.add("head first java");

		/*deque.addLast("walden");
		deque.addLast("harry potter");
		deque.addLast("head first java");*/
		
		System.out.println("\nPrinting Queue ...");
		System.out.println(deque.remove()); // removeFirst
		System.out.println(deque.remove());
		System.out.println(deque.remove());
		
		// Stack - LIFO
		deque.push("walden"); // add first
		deque.push("harry potter");
		deque.push("head first java");
		
		System.out.println("\nPrinting Stack ...");
		System.out.println(deque.pop()); // remove first
		System.out.println(deque.pop());	//
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());

	}
	
	public static void main(String[] args) {

		System.out.println(Math.abs((int)2.6));
		System.out.println(Math.ceil(2.3));
		System.out.println(Math.floor(2.3));
		System.out.println(Math.round(2.5f));
		System.out.println(Math.round(2.3d));


		//dequeTest();
	}
	
}

class A{
	public void hello(){

	}
	public void test(){

	}

	public void test1() throws NumberFormatException{

	}

	public void test2() throws IOException{

	}

}

class B extends A{
	public void hello() throws ConcurrentModificationException{

	}

	public void test() throws NumberFormatException{

	}

	public void test1() throws ArrayIndexOutOfBoundsException{

	}

	public void test2() throws FileNotFoundException{

	}

}