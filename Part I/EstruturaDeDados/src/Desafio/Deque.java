package Desafio;

public class Deque<T> {

    private T[] deque;
    private int inseridos;

    public T[] getDeque() {
        return deque;
    }

    public Deque(int tamanho) {
        this.deque = (T[])new Object[tamanho];
    }

    public void insertFront(T elem) throws DequeFullException{
        if(inseridos == deque.length){
            throw new DequeFullException();
        }

        for (int i = inseridos-1; i >= 0; i--) {
            deque[i+1] = deque[i];
        }
        deque[0] = elem;
        this.inseridos++;
    }

    public void insertLast(T elem) throws DequeFullException{
        if(inseridos == deque.length){
            throw new DequeFullException();
        }
        deque[inseridos] = elem;
        inseridos++;
    }

    public T removeFront(){
        if(isEmpty()){
           return null;
        }

        T front = front();

        for (int i = 0; i < inseridos-1; i++) {
            deque[i] = deque[i+1];
        }
        deque[inseridos-1] = null;
        inseridos--;
        return front;
    }

    public T removeLast(){
        if(isEmpty()){
            return null;
        }

        T last = last();

        deque[inseridos-1] = null;
        inseridos--;
        return last;
    }

    public boolean isEmpty(){
        return this.inseridos == 0;
    }

    public T front(){
        return this.deque[0];
    }

    public T last(){
        return this.deque[this.inseridos-1];
    }
}
