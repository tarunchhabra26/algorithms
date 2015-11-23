package ctci.ch3;


public class Node {
	Node next = null;
	
	public Node next() {
		return next;
	}

	public void next(Node next) {
		this.next = next;
	}

	public int data;
	public Node(int data){
		this.data = data;
	}
	
	public void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	public Node deleteNode(Node head,int d){
		Node n = head;
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
