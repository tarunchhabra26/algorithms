package pie.ch4.list;

public class CycleDetection {

	public boolean determineCycle(LinkedList head){
		boolean found = false;
		LinkedList fast = head, slow = head;
		
		while(true){
			if (fast != null ||  fast.getNext() != null){
				return false;
			} else if (fast == slow || fast.getNext() == slow){
				return true;
			} else {
				fast = fast.getNext().getNext();
				slow = slow.getNext();
			}
		}
	}
}
