package ctci.ch2;

public class LinkedListNode {
	LinkedListNode next = null;
	
	public LinkedListNode next() {
		return next;
	}

	public void next(LinkedListNode next) {
		this.next = next;
	}

	public int data;
	public LinkedListNode(int data){
		this.data = data;
	}
	
	public void appendToTail(int d){
		LinkedListNode end = new LinkedListNode(d);
		LinkedListNode n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	public LinkedListNode deleteNode(LinkedListNode head,int d){
		LinkedListNode n = head;
		if (head.data == d){
			return head.next;
		}
		while (n.next != null){
			if (n.next.data == d){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}

}
