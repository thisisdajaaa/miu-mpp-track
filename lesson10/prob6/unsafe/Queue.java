package lesson10.prob6.unsafe;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue {
	class Node {
		Object value;
		Node next;
	}
	private Node head;
	private Node tail;

	public Queue() {}

	public void add(Object newValue) {
		Node n = new Node();
		if(head == null) head = n;
		else tail.next = n;
		tail = n;
		tail.value = newValue;
	}
	public Object remove() {
		if(head == null) return null;
		Node n = head;
		head = n.next;
		return n.value;
	}

	public int size() {
		Node current = head;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}
}
