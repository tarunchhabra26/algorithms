package ctci.ch2.q2;

import ctci.ch2.LinkedListNode;
import ctci.ch2.q1.RemoveDuplicates;

public class Sublist {

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
		
		int index = 2;
		
		LinkedListNode subNodeList = returnSublist(nodeList,index);
		
		System.out.println("\nSub linked list : ");
		new RemoveDuplicates().traverseLinkedList(subNodeList);

	}
	
	private static LinkedListNode returnSublist(LinkedListNode nodeList, int index) {
		int count = 0;
		while (nodeList != null){
			if (count == index){
				return nodeList;
			}
			nodeList = nodeList.next();
			count++;
		}
		return nodeList;
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

}
