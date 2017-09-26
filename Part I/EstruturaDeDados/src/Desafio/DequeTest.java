package Desafio;

import org.junit.Assert;
import org.junit.Test;

public class DequeTest {

    @Test
    public void checkInsertFront(){
        Deque<String> deque = new Deque<>(5);

        String[] array = new String[]{"C", "B", "A"};

        deque.insertFront("A");
        deque.insertFront("B");
        deque.insertFront("C");

        Object[] arrayDeque = deque.getDeque();

        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(array[i], arrayDeque[i]);
        }
    }

    @Test
    public void checkInsertLast(){
        Deque<String> deque = new Deque<>(5);

        String[] array = new String[]{"A", "B", "C"};

        deque.insertLast("A");
        deque.insertLast("B");
        deque.insertLast("C");

        Object[] arrayDeque = deque.getDeque();

        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(array[i], arrayDeque[i]);
        }
    }

    @Test
    public void checkRemoveFront(){
        Deque<String> deque = new Deque<>(5);

        String[] array = new String[]{"B", "C"};

        deque.insertLast("A");
        deque.insertLast("B");
        deque.insertLast("C");

        Object front = deque.removeFront();

        Object[] arrayDeque = deque.getDeque();

        for (int i = 0; i < 2; i++) {
            Assert.assertEquals(array[i], arrayDeque[i]);
        }
        Assert.assertEquals(front.toString(), "A");
    }

    @Test
    public void checkRemoveLast(){
        Deque<String> deque = new Deque<>(5);

        String[] array = new String[]{"A", "B"};

        deque.insertLast("A");
        deque.insertLast("B");
        deque.insertLast("C");

        Object last = deque.removeLast();

        Object[] arrayDeque = deque.getDeque();

        for (int i = 0; i < 2; i++) {
            Assert.assertEquals(array[i], arrayDeque[i]);
        }
        Assert.assertEquals(last.toString(), "C");
    }

    @Test
    public void checkDequeFullExceptpion(){

    }

}
