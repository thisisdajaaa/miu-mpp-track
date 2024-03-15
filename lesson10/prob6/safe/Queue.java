package lesson10.prob6.safe;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue {
	class Node {
		Object value;
		Node next;
	}
	private Node head = null;
	private Node tail = null;

	// synchronized keyword added
	synchronized public void add(Object newValue) {
		Node n = new Node();
		if(head == null) head = n;
		else tail.next = n;
		tail = n;
		tail.value = newValue;
	}
	synchronized public Object remove() {
		if(head == null) return null;
		Node n = head;
		head = n.next;
		return n.value;
	}

	synchronized public int size(){
		int counter = 0;
		Node headRun = head;
		while (headRun != null){
			counter++;
			headRun = headRun.next;
		}
		return counter;
	}

}
