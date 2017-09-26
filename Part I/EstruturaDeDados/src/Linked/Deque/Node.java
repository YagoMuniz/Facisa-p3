package Linked.Deque;

/**
 * Classe nó ou elemento do Deque
 * @param <T>
 */
public class Node<T> {

    private T valor;
    private Node<T> prox;

    /**
     * Método construtor que guarda um valor no nó
     * @param valor
     */
    public Node(T valor) {
        this.valor = valor;
    }

    /**
     * Retorna valor do nó
     * @return
     */
    public T getValor() {
        return valor;
    }

    /**
     * Determina o próximo nó do Deque
     * @param elem
     */
    public void setProx(Node<T> elem){
        this.prox = elem;
    }

    /**
     * Retorna próximo nó do Deque
     * @return
     */
    public Node<T> getProx(){
        return this.prox;
    }
}

/**
 * Lista ligada implementada para funcionar como deque.
 * @param <T>
 */
class LinkedList<T>{

    /**
     * Tamanho da lista
     */
    private int tamanho;
    /**
     * Nó do início
     */
    private Node<T> inicio;

    /**
     * Método insere elemento no início da lista.
     * @param elem
     */
    public void insertFront(Node<T> elem){
        if(inicio == null)
            this.inicio = elem;
        else{
            elem.setProx(inicio);
            inicio = elem;
        }
        this.tamanho++;
    }

    /**
     * Método de inserção de elementos no final.
     * @param elem
     */
    public void insertLast(Node<T> elem){
        if(isEmpty()){
            inicio = elem;
        }else{
            Node<T> aux = inicio;
            while(aux.getProx() != null)
                aux = aux.getProx();
            aux.setProx(elem);
        }
        this.tamanho++;

    }
    /**
     * Método de remoção de elementos no início.
     */
    public Node<T> removeFront() {
        Node<T> aux = inicio;
        if (!isEmpty()){
            if(inicio.getProx() == null)
                inicio = null;
            else{
                inicio = aux.getProx();
                aux.setProx(null);
            }
        }
        return aux;
    }
    /**
     * Método de remoção de elementos no final.
     */
    public Node<T> removeLast(){
        Node<T> temp = null;

        if(inicio.getProx() != null){
            Node<T> aux = inicio;
            Node<T> ant = inicio;
            while(aux.getProx() != null){
                ant = aux;
                aux = aux.getProx();
            }
            temp = aux;
            aux.setProx(null);
            ant.setProx(null);
            this.tamanho--;
            return temp;
        }
        temp = inicio;
        this.tamanho--;
        this.inicio = null;
        return temp;
    }

    /**
     * Retorna elemento do início.
     * @return
     */
    public Node<T> front(){
        return inicio;
    }

    /**
     * Retorna último elemento.
     * @return
     */
    public Node<T> last(){
        Node<T> aux = inicio;
        if(!isEmpty()) {
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
        }
        return aux;
    }

    /**
     * Verifica se lista está vazia.
     * @return
     */
    public boolean isEmpty(){
        return inicio == null;
    }

}