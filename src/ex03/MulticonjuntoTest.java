package ex03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MulticonjuntoTest {

    @Test
    public void testAddStack() {
        StackMulticonjunto<Integer> stack = new StackMulticonjunto<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testEqualsStack() {
        StackMulticonjunto<Integer> stack1 = new StackMulticonjunto<>();
        stack1.add(1);
        stack1.add(2);
        stack1.add(3);
        StackMulticonjunto<Integer> stack2 = new StackMulticonjunto<>();
        stack2.add(1);
        stack2.add(2);
        stack2.add(3);
        assertTrue(stack1.equals(stack2));
    }

    @Test
    public void testAddAllStack() {
        StackMulticonjunto<Integer> stack1 = new StackMulticonjunto<>();
        stack1.add(1);
        stack1.add(2);
        StackMulticonjunto<Integer> stack2 = new StackMulticonjunto<>();
        stack2.add(3);
        stack2.add(4);
        stack1.addAll(stack2);
        assertTrue(stack1.checkElement().equals(4));
    }
    
    
    @Test
    public void testAddSet() {
        SetMulticonjunto<Integer> set = new SetMulticonjunto<>();
        set.add(1);
        set.add(2);
        set.add(3);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testEqualsSet() {
        SetMulticonjunto<Integer> set1 = new SetMulticonjunto<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        SetMulticonjunto<Integer> set2 = new SetMulticonjunto<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        assertTrue(set1.equals(set2));
    }

    @Test
    public void testAddAllSet() {
        SetMulticonjunto<Integer> set1 = new SetMulticonjunto<>();
        set1.add(1);
        set1.add(2);
        SetMulticonjunto<Integer> set2 = new SetMulticonjunto<>();
        set2.add(3);
        set2.add(4);
        set1.addAll(set2);
        assertTrue(set1.contains(3));
        assertTrue(set1.contains(4));
    }
    
    
    
    @Test
    public void testAddLinkedList() {
        LinkedListMulticonjunto<Integer> list = new LinkedListMulticonjunto<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.getSize());
    }

    @Test
    public void testEqualsLinkedList() {
        LinkedListMulticonjunto<Integer> list1 = new LinkedListMulticonjunto<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        LinkedListMulticonjunto<Integer> list2 = new LinkedListMulticonjunto<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        assertTrue(list1.equals(list2));
    }

    @Test
    public void testAddAllLinkedList() {
        LinkedListMulticonjunto<Integer> list1 = new LinkedListMulticonjunto<>();
        list1.add(1);
        list1.add(2);
        LinkedListMulticonjunto<Integer> list2 = new LinkedListMulticonjunto<>();
        list2.add(3);
        list2.add(4);
        list1.addAll(list2);
        assertEquals(4, list1.getSize());
        assertTrue(list1.getElementAt(2).equals(3));
        assertTrue(list1.getElementAt(3).equals(4));
    }
    
    
    
    @Test
    public void testAddArryList() {
        ArrayListMulticonjunto<Integer> list = new ArrayListMulticonjunto<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.getSize());
    }

    @Test
    public void testEqualsArrayList() {
        ArrayListMulticonjunto<Integer> list1 = new ArrayListMulticonjunto<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayListMulticonjunto<Integer> list2 = new ArrayListMulticonjunto<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        assertTrue(list1.equals(list2));
    }

    @Test
    public void testAddAllArrayList() {
        ArrayListMulticonjunto<Integer> list1 = new ArrayListMulticonjunto<>();
        list1.add(1);
        list1.add(2);
        ArrayListMulticonjunto<Integer> list2 = new ArrayListMulticonjunto<>();
        list2.add(3);
        list2.add(4);
        list1.addAll(list2);
        assertEquals(4, list1.getSize());
        assertTrue(list1.getElement(2).equals(3));
        assertTrue(list1.getElement(3).equals(4));
    }    
}
