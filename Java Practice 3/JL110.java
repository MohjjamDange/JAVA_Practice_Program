// Java Program to traverse the list both in forward and
// backward direction using listIterator

import java.util.*;

public class JL110 {

	public static void main(String[] args)
	{
		// list of names
		//List<String> names = new LinkedList<>();

        Stack<Integer> sobj = new Stack<Integer>();


		sobj.add(12);
		sobj.add(13);
		sobj.add(15);
		sobj.add(16);
		sobj.add(18);

		// Getting ListIterator
		ListIterator<Integer> listIterator
			= sobj.listIterator();

		// Traversing elements
		System.out.println("Forward Direction Iteration:");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		// Traversing elements, the iterator is at the end
		// at this point
		System.out.println("Backward Direction Iteration:");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
