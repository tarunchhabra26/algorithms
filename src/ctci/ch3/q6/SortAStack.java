package ctci.ch3.q6;

import java.util.Stack;

public class SortAStack {
	
	public static void main (String args[]){
		Stack<Integer> s1 = new Stack<Integer>();
		
		s1.push(1);
		s1.push(6);
		s1.push(3);
		s1.push(4);
		
		s1 = new SortAStack().sort(s1);
		
		System.out.println(s1);
	}

	public Stack<Integer> sort(Stack<Integer> s1) {
		Stack<Integer> tempStack = new Stack<Integer>();
		int tmp;
		while (!s1.isEmpty()) {
			tmp = s1.pop();
			while (!tempStack.isEmpty() && tempStack.peek() < tmp) {
				s1.push(tempStack.pop());
			}
			tempStack.push(tmp);
		}

		return tempStack;

	}

}
