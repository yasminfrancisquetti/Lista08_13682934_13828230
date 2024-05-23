package ex03;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMulticonjunto<T> {
	private LinkedList<T> linkedList;
	
	public LinkedListMulticonjunto() {
		this.linkedList = new LinkedList<>();
	}
	
	public void add(T element) {
		this.linkedList.add(element);
	}
	
	public boolean equals(LinkedListMulticonjunto<T> m) {
		return this.linkedList.equals(m);
	}
	
	public int getSize() {
		return this.linkedList.size();
	}
	
	public T getElementAt(int n) {
		return this.linkedList.get(n);
	}
	
	public void addAll(LinkedListMulticonjunto<T> m) {
		int size = m.getSize();
		for(int i = 0; i < size; i++) {
			this.linkedList.add(m.getElementAt(i));
		}
	}
}
