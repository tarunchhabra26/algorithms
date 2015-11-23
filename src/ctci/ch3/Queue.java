package ctci.ch3;

public class Queue {
	Node first, last;

	void enqueue(Node node) {
		if (first == null) {
			last = node;
			first = last;
		} else {
			last.next = node;
			last = last.next;
		}
	}

	Node dequeue() {
		if (first != null) {
			Node item = first;
			first = first.next;
			return item;
		}
		return null;
	}

}
