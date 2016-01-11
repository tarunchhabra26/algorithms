package pie.ch4.list;

public class ToLastElement {

	public static void main(String[] args) {
		

	}
	
	public LinkedList findMToLast(LinkedList head, int m){
		LinkedList current,mBehind;
		// Initialize current to the head pointer
		current = head;
		
		for (int i = 0 ; i < m ; i++){
			if (current.getNext() != null){
				current = current.getNext();
			} else {
				return null;
			}
		}
		
		mBehind = head;
		while (current.getNext() != null){
			current = current.getNext();
			mBehind = mBehind.getNext();
		}
		
		
		return mBehind;
	}

}
