package ctci.ch2.q3;

import ctci.ch2.LinkedListNode;
import ctci.ch2.q1.RemoveDuplicates;

public class DeleteNode {
	public static void main(String[] args) {
		LinkedListNode nodeList = new LinkedListNode(2);
		nodeList.appendToTail(6);
		nodeList.appendToTail(7);
		nodeList.appendToTail(6);
		nodeList.appendToTail(7);
		nodeList.appendToTail(8);
		nodeList.appendToTail(7);
		
		System.out.println("Given linked list : ");
		new RemoveDuplicates().traverseLinkedList(nodeList);
		
		nodeList = nodeList.deleteNode(nodeList, 6);
		
		System.out.println("New linked list : ");
		new RemoveDuplicates().traverseLinkedList(nodeList);
		
	}

}
