package Pilha;

import org.junit.Assert;
import org.junit.Test;

public class PilhaTest {

    @Test
    public void checkIsEmpty(){
        Pilha<String> pilha = new Pilha<String>();
        Assert.assertTrue(pilha.isEmpty());
    }

    @Test
    public void checkIsEmptyFail(){
        Pilha<String> pilha = new Pilha<String>();
        pilha.push("A");
        Assert.assertFalse(pilha.isEmpty());
    }

    @Test
    public void checkSize(){
        Pilha<String> pilha = new Pilha<String>();
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        Assert.assertEquals(3, pilha.tamanho());
    }

    @Test
    public void checkTop(){
        Pilha<String> pilha = new Pilha<String>();
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        Assert.assertEquals("C", pilha.top());
    }
}
