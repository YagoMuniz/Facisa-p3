package Deque;

/**
 * Classe que representa a estrutura de dados deque,
 *  usando classe genérica.
 * @param <T>
 */
public class Deque<T> {

    private T[] deque;
    private static final int TAMANHO_INICIAL = 3;
    private int inseridos;

    /**
     * Método construtor que cria deque.
     */
    public Deque() {
        this.deque = (T[]) new Object[TAMANHO_INICIAL];
    }

    /**
     * Insere o elemento na frente do deque.
     * @param elem
     */
    public void insertFront(T elem){

        verificarTamanho();

        for (int i = size()-1; i >= 0; i--) {
            this.deque[i+1] = this.deque[i];
        }
        this.deque[0] = elem;
        this.inseridos++;
    }

    /**
     * Insere o elemento no final do deque.
     * @param elem
     */
    public void insertBack(T elem){

        verificarTamanho();

        this.deque[size()] = elem;
        this.inseridos++;
    }

    /**
     * Remove o elemento do início do deque.
     * @return
     */
    public T removeFront(){
        T front = front();
        if(front != null){
            for (int i = 0; i < size()-1; i++) {
                this.deque[i] = this.deque[i+1];
            }
            this.inseridos--;
            this.deque[size()] = null;
        }
        return front;
    }

    /**
     * Remove o elemento do final do deque.
     * @return o último elemento do deque.
     */
    public T removeBack(){
        T back = back();
        if(back != null){
            this.deque[size()-1] = null;
            this.inseridos--;
        }
        return back;
    }

    /**
     * Retorna o primeiro elemento do deque.
     * Se não existir, retorna null.
     * @return primeiro elemento do deque.
     */
    public T front(){
        return isEmpty() ? null : this.deque[0];
    }

    /**
     * Retorna o útimo elemento do deque.
     * Se não existir, retorna null.
     * @return último elemento do deque.
     */
    public T back(){
        return isEmpty() ? null : this.deque[size()-1];
    }

    /**
     * Verifica o tamanho do array interno e redimensiona-lo se possível.
     */
    private void verificarTamanho() {
        if(size() == this.deque.length){
            T[] dequeAux = (T[]) new Object[this.deque.length*2];
            for (int i = 0; i < size(); i++) {
                dequeAux[i] = this.deque[i];
            }
            this.deque = dequeAux;
        }
    }

    /**
     * Retorna array interno do deque.
     * @return array interno do deque.
     */
    public T[] getDeque(){
        return this.deque;
    }

    /***
     * Retorna o tamanho atual do deque.
     * @return
     */
    public int size(){
        return inseridos;
    }

    /**
     * Verifica se o deque está vazio.
     * @return
     */
    public boolean isEmpty(){
        return size() == 0;
    }

}
