package pie.ch4.list;

public class LinkedList {
	
	private Object data;
	private LinkedList next;
	
	public LinkedList(Object data){
		this.data = data;
	}
	
	public LinkedList getNext(){
		return this.next;
	}
	
	public Object getData(){
		return this.data;
	}

}
