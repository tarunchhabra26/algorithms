package ctci.ch3.q3;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class MultipleStacks {
	List<Stack<Integer>> setOfStacks = null;
	final static int MAX_SIZE = 30;

	void push(int data){
		if (setOfStacks == null){
			setOfStacks = new ArrayList<Stack<Integer>>();
			Stack<Integer> s = new Stack<Integer>();
			s.push(data);
			setOfStacks.add(s);
		} else {
			for (Stack<Integer> stack : setOfStacks){
				if (stack.size() < 30){
					stack.push(data);
					break;
				} 
			}
		}
			
	}
}
