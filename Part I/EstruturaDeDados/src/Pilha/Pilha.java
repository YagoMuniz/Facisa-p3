package Pilha;

/**
 * Classe que representa uma pilha genérica de elementos.
 * @author yagomuniz
 * */
public class Pilha<T> {

    private static final int TAMANHO_INICIAL = 3;
    private int inseridos;
    private T elementos[];

    public Pilha(){
        this.elementos = (T[])new Object[TAMANHO_INICIAL];
    }

    public void push(T elemento){

        if(this.elementos.length == inseridos){
            T arrayAuxiliar[] = (T[])new Object[this.elementos.length*2];

            for (int i = 0; i < this.elementos.length; i++) {
                arrayAuxiliar[i] = this.elementos[i];
            }
            this.elementos = arrayAuxiliar;
        }

        this.elementos[inseridos] = elemento;
        this.inseridos++;
    }

    public T pop(){
        T topo = top();
        if(topo != null){
            this.elementos[inseridos-1] = null;
            this.inseridos--;
        }
        return topo;
    }

    public T top(){
        return isEmpty() ? null : this.elementos[inseridos-1];
    }

    public int tamanho(){
        return inseridos;
    }

    public boolean isEmpty(){
        return tamanho() == 0;
    }
}
