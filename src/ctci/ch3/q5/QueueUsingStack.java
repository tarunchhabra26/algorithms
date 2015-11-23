package ctci.ch3.q5;

import java.util.Stack;

public class QueueUsingStack {

	private Stack<Integer> s1 = new Stack<Integer>();
	private Stack<Integer> s2 = new Stack<Integer>();

	public static void main(String[] args) {

	}

	public void enqueue(int data) {
		if (s2.isEmpty()) {
			s1.push(data);
			s2.push(data);
		} else {
			s2 = null;
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
	}

	public int dequeue() {
		return s2.pop();
	}

	public int peek() {
		if (!s2.isEmpty())
			return s2.peek();
		else
			return 0;
	}
	
	public int size(){
		return s1.size() + s2.size();
	}

}
