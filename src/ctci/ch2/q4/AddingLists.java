package ctci.ch2.q4;

import ctci.ch2.LinkedListNode;
import ctci.ch2.q1.RemoveDuplicates;

public class AddingLists {

	public static void main(String[] args) {
		LinkedListNode nodeList = new LinkedListNode(3);
		nodeList.appendToTail(1);
		nodeList.appendToTail(5);

		LinkedListNode nodeList1 = new LinkedListNode(5);
		nodeList1.appendToTail(9);
		nodeList1.appendToTail(2);

		int carry = 0;
		nodeList = addLists(nodeList, nodeList1, carry);
		
		System.out.println("Linked list after additions :");
		new RemoveDuplicates().traverseLinkedList(nodeList);
	}

	private static LinkedListNode addLists(LinkedListNode nodeList, LinkedListNode nodeList1, int carry) {

		if (nodeList == null || nodeList1 == null)
			return null;
		LinkedListNode resultNode = null;
		while (nodeList != null || nodeList1 != null) {
			if (resultNode == null)
				resultNode = new LinkedListNode((nodeList.data + nodeList1.data + carry) % 10);
			else {
				resultNode.appendToTail((nodeList.data + nodeList1.data + carry) % 10);
			}

			if  (nodeList.data + nodeList1.data  >= 10)
				carry  = 1;
			nodeList = nodeList.next();
			nodeList1 = nodeList1.next();
				
		}

		return resultNode;
	}

}
