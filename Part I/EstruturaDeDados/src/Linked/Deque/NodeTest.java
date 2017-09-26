package Linked.Deque;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {

    /**
     * Verifica inserção no início
     */
    @Test
    public void checkInsertFrontSuccess(){

        Node<String> node1 = new Node<String>("A");
        Node<String> node2 = new Node<String>("B");
        Node<String> node3 = new Node<String>("C");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.insertFront(node1);
        Assert.assertEquals(node1, linkedList.front());
        linkedList.insertFront(node2);
        Assert.assertEquals(node2.getValor(), linkedList.front().getValor());
        linkedList.insertFront(node3);
        Assert.assertEquals(node3.getValor(), linkedList.front().getValor());
    }

    /**
     * Testa as falhas na inserção no início
     */
    @Test
    public void checkInsertFrontFail(){

        Node<String> node1 = new Node<String>("A");
        Node<String> node2 = new Node<String>("B");
        Node<String> node3 = new Node<String>("C");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.insertFront(node1);
        Assert.assertNotEquals(node2, linkedList.front());
        linkedList.insertFront(node2);
        Assert.assertNotEquals(node3, linkedList.front());
        linkedList.insertFront(node3);
        Assert.assertNotEquals(node1, linkedList.front());
    }

    /**
     * Teste de inserção no final da lista
     */
    @Test
    public void checkInsertLastSuccess(){

        Node<String> node1 = new Node<String>("A");
        Node<String> node2 = new Node<String>("B");
        Node<String> node3 = new Node<String>("C");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.insertLast(node1);
        Assert.assertEquals(node1, linkedList.last());
        linkedList.insertLast(node2);
        Assert.assertEquals(node2, linkedList.last());
        linkedList.insertLast(node3);
        Assert.assertEquals(node3, linkedList.last());
    }

    /**
     * Teste de remoção no início da lista
     */
    @Test
    public void checkRemoveFrontSuccess(){

        Node<String> node1 = new Node<String>("A");
        Node<String> node2 = new Node<String>("B");
        Node<String> node3 = new Node<String>("C");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.insertFront(node1);
        linkedList.insertFront(node2);
        linkedList.insertFront(node3);

        Assert.assertEquals(node3, linkedList.removeFront());
        Assert.assertEquals(node2, linkedList.removeFront());
        Assert.assertEquals(node1, linkedList.removeFront());
    }

    /**
     * Testa a remoção no final da lista
     */
    @Test
    public void checkRemoveLastSuccess(){

        Node<String> node1 = new Node<String>("A");
        Node<String> node2 = new Node<String>("B");
        Node<String> node3 = new Node<String>("C");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.insertLast(node1);
        linkedList.insertLast(node2);
        linkedList.insertLast(node3);

        Assert.assertEquals(node3, linkedList.removeLast());
        Assert.assertEquals(node2, linkedList.removeLast());
        Assert.assertEquals(node1, linkedList.removeLast());
    }
}
