package ctci.ch3.q2;

import java.util.Stack;

public class StackWithMin {
	static Stack<Integer> s1 =  new Stack<Integer>();
	static Stack<Integer> s2 =  new Stack<Integer>();
	public static void main(String args[]){
		
		push(10);
		push(40);
		push(2);
		push(89);
		push(1);
		push(99);
		push(100);
		
		System.out.println("Minimum element " + min());
		
	}
	
	private static void push(int item){
		s1.push(item);
		if (s2.isEmpty())
			s2.push(item);
		else 
			if (item < s2.peek())
			s2.push(item);
	}
	
	private static int min(){
		return s2.pop();
	}
	
}
