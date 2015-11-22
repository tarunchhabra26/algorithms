package ctci.ch2.q1;

import ctci.ch2.LinkedListNode;

public class RemoveDuplicates {
	public static void main(String args[]){
		//Create a sample linked list and then traverse it
		LinkedListNode nodeList = new LinkedListNode(2);
		nodeList.appendToTail(6);
		nodeList.appendToTail(7);
		nodeList.appendToTail(6);
		nodeList.appendToTail(7);
		nodeList.appendToTail(8);
		nodeList.appendToTail(7);
		
		System.out.println("Given linked list : ");
		new RemoveDuplicates().traverseLinkedList(nodeList);
		
		//Removing duplicates
		nodeList = new RemoveDuplicates().deleteDuplicateNodes(nodeList);
		System.out.println("\nNew linked list : ");
		new RemoveDuplicates().traverseLinkedList(nodeList);
		
		
	}
	
	public void traverseLinkedList(LinkedListNode list){
		int count = 0;
		if (list == null){
			System.out.println("List is empty");
		}
		while (list != null){
			if (count != 0)
				System.out.print("->");
			System.out.print(list.data);
			list = list.next();
			count++;
		}
	}
	
	public LinkedListNode deleteDuplicateNodes(LinkedListNode head){
		if (head != null){
			LinkedListNode currentNode = head;
			LinkedListNode nextNode = null;
			LinkedListNode previous = null;
			
			while (currentNode != null) {
				nextNode = currentNode.next();
				previous = currentNode;
				while (nextNode != null) {
					if (nextNode.data == currentNode.data) {
						previous.next(nextNode.next());
					} else {
						previous = nextNode;
					}
					nextNode = nextNode.next();
				}
				currentNode = currentNode.next();
			}
		}
		return head;
	}
}
