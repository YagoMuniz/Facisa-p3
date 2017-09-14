import org.junit.Assert;
import org.junit.Test;

public class DequeTest {

    @Test
    public void checkCreateDequeSuccess(){
        Deque<String> deque = new Deque<String>();
        Assert.assertEquals(0, deque.size());
    }

    @Test
    public void checkInsertBackSuccess(){

        Deque<String> deque = new Deque<String>();
        deque.insertBack("A");
        deque.insertBack("B");
        deque.insertBack("C");
        deque.insertBack("D");

        Assert.assertEquals(4, deque.size());

    }

    @Test
    public void checkInsertFrontSuccess(){

        Deque<String> deque = new Deque<String>();
        deque.insertFront("A");
        deque.insertFront("B");
        deque.insertFront("C");
        deque.insertFront("D");

        String[] array = new String[]{"D", "C", "B", "A"};
        Object[] dequeInterno = deque.getDeque();

        for (int i = 0; i < 4; i++) {
            Assert.assertEquals(array[i], dequeInterno[i]);
        }

        Assert.assertEquals(4, deque.size());

    }

    @Test
    public void checkDeleteFrontSuccess(){

        Deque<String> deque = new Deque<String>();
        deque.insertFront("A");
        deque.insertFront("B");
        deque.insertFront("C");
        deque.insertFront("D");

        String[] array = new String[]{"D", "C", "B", "A"};
        Object[] dequeInterno = deque.getDeque();

        deque.removeFront();

        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(array[i+1], dequeInterno[i]);
        }

        Assert.assertEquals(3, deque.size());

    }
    @Test
    public void checkDeleteBackSuccess(){

        Deque<String> deque = new Deque<String>();
        deque.insertBack("A");
        deque.insertBack("B");
        deque.insertBack("C");
        deque.insertBack("D");

        String[] array = new String[]{"A", "B", "C"};
        Object[] dequeInterno = deque.getDeque();

        deque.removeBack();

        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(array[i], dequeInterno[i]);
        }

        Assert.assertEquals(3, deque.size());

    }

}
