package ctci.ch3.q1;

public class ArrayStack {
	// Stacks have the index numbers 0,1,2
	final int size = 300;
	int[] buffer = new int[size * 3];
	int[] stackPointer = {-1,-1,-1};
	
	void push(int stackNumber, int value){
		int index =  stackNumber * size + stackPointer[stackNumber] + 1;
		buffer[index] = value;
		stackPointer[stackNumber]++;
	}
	
	int pop(int stackNumber){
		int index = stackNumber * size + stackPointer[stackNumber];
		stackPointer[stackNumber]--;
		int value = buffer[index];
		buffer[index] = 0;
		return value;
	}
	
	boolean isEmpty(int stackNumber){
		return (stackPointer[stackNumber] == -1);
	}
	
	int peek(int stackNumber){
		int index = stackNumber * size + stackPointer[stackNumber];
		int value = buffer[index];
		return value;
	}

}
