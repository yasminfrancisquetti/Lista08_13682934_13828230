package ex04;

import java.util.HashSet;
import java.util.Iterator;

class LinkedListConjuntoAdapter<T> implements Iterable<T> {
    private LinkedListMultiConjunto<T> multiconjunto;
    private HashSet<T> conjunto;

    public LinkedListConjuntoAdapter(LinkedListMultiConjunto<T> multiconjunto) {
        this.multiconjunto = multiconjunto;
        this.conjunto = new HashSet<>();
        for (int i = 0; i < multiconjunto.getSize(); i++) {
            conjunto.add(multiconjunto.getElementAt(i));
        }
    }

    public boolean contains(T element) {
        return conjunto.contains(element);
    }

    public int size() {
        return conjunto.size();
    }

    public boolean add(T element) {
        if (!conjunto.contains(element)) {
            multiconjunto.add(element);
            conjunto.add(element);
            return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return conjunto.iterator();
    }
}