package ex03;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class ArrayListMulticonjunto <T> {
	private  ArrayList<T> list;
	
	
	public ArrayListMulticonjunto() {
		this.list = new ArrayList<>();
	}
	
	public void add(T element) {
		list.add(element);
	}
	
	public int getSize() {
		return this.list.size();
	}
	
	public T getElement(int  n) {
		return this.list.get(n);
	}
	
	public boolean equals(ArrayListMulticonjunto<T> m) {
		if (m.getSize() != this.list.size())
			return false;
		for(int i = 0; i < m.getSize(); i++) {
			if (m.getElement(i) != this.list.get(i))
				return false;
		}
		return true;
	}
	
	public void addAll(ArrayListMulticonjunto<T> m ) {
		int size = m.getSize();
		for (int i = 0; i > size; i++) 
			this.list.add(m.getElement(i));
	}
}
