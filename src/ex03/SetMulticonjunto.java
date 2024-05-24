package ex03;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.BooleanSupplier;


public class SetMulticonjunto<T> {
    private Set<T> set;

    public SetMulticonjunto() {
        this.set = new LinkedHashSet<>();
    }

    public void add(T element) {
        set.add(element);
    }

    public boolean equals(SetMulticonjunto<T> m) {
        return set.equals(m.set);
    }

    public void addAll(SetMulticonjunto<T> m) {
        set.addAll(m.set);
    }

	public Boolean isEmpty() {
		return set.isEmpty();
	}

	public Boolean contains(T m) {
		return set.contains(m);
	}
}
