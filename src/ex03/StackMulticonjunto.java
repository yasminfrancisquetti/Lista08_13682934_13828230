package ex03;

import java.util.Stack;

public class StackMulticonjunto<T> {
	private Stack<T>stack;
	
	public StackMulticonjunto(){
			this.stack = new Stack<>();
		}
	
	public void add(T element) {
		this.stack.push(element);
	}
	
	public boolean isEmpty() {
		return this.stack.isEmpty();
	}
	
	public T checkElement() {
		return this.stack.peek();
	}
	
	public T getElement() {
		return this.stack.pop();
	}
	
	public boolean equals(StackMulticonjunto<T> m) {
		return this.stack.equals(m);
	}
	
	public void addAll(StackMulticonjunto<T> m ) {
		while (!m.isEmpty()) {
			this.stack.add(m.getElement());
		}
	}
}
