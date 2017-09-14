
public class Fila<T> {

    private static final int TAMANHO_INICIAL = 3;
    private int inseridos;

    private T[] fila;

    public Fila() {

        this.fila = (T[])new Object[TAMANHO_INICIAL];

    }

    public void insert(T elem){
        if(inseridos == fila.length){
            T[] filaAuxiliar = (T[])new Object[fila.length*2];
            for (int i = 0; i < fila.length; i++) {
                filaAuxiliar[i] = fila[i];
            }
            fila = filaAuxiliar;
        }
        fila[inseridos] = elem;
        inseridos++;
    }

    public T pop(){
        T front = front();
        if(front != null){
            for (int i = 0; i < size() - 1; i++) {
                this.fila[i] = this.fila[i+1];
            }
            this.inseridos--;
            this.fila[inseridos] = null;
        }
        return front;
    }

    public T front(){
        if(!isEmpty())
            return this.fila[0];
        return null;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size(){
        return inseridos;
    }
}
