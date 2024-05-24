package ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMultiConjunto<T> {
    private LinkedList<T> linkedList;

    public LinkedListMultiConjunto() {
        this.linkedList = new LinkedList<>();
    }

    public void add(T element) {
        this.linkedList.add(element);
    }

    public boolean equals(LinkedListMultiConjunto<T> m) {
        return this.linkedList.equals(m);
    }

    public int getSize() {
        return this.linkedList.size();
    }

    public T getElementAt(int n) {
        return this.linkedList.get(n);
    }

    public void addAll(LinkedListMultiConjunto<T> m) {
        int size = m.getSize();
        for(int i = 0; i < size; i++) {
            this.linkedList.add(m.getElementAt(i));
        }
    }
}