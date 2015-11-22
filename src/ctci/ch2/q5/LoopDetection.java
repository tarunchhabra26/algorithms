package ctci.ch2.q5;

import ctci.ch2.LinkedListNode;

public class LoopDetection {

	public LinkedListNode findBeginning(LinkedListNode head) {

		LinkedListNode n1 = head;
		LinkedListNode n2 = head;

		// Move n2 at double the speed as compared to n1
		while (n2.next() != null) {
			n1 = n1.next();
			n2 = n2.next().next();
			if (n1 == n2)
				break;
		}

		// Error check
		if (n2.next() == null)
			return null;

		// Set n1 to head and then move both pointer 1 by one then n2 will get
		// set at start of the loop
		n1 = head;
		while (n1 != n2) {
			n1 = n1.next();
			n2 = n2.next();
		}

		return n2;
	}

}
