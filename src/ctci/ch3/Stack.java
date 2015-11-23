package ctci.ch3;

public class Stack {
	Node top;
	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}

	Node pop(){
		if (top != null){
			Node item = new Node(top.data);
			top = top.next;
			return item;
		}
		return null;
	}
	
	void push(Node node){
		node.next = top;
		top = node;
	}

}
