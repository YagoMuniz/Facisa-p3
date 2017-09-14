import org.junit.Assert;
import org.junit.Test;

public class FilaTest {

    @Test
    public void checkQueueIsEmpty(){
        Fila<String> fila = new Fila<String>();
        Assert.assertTrue(fila.isEmpty());
    }
}
