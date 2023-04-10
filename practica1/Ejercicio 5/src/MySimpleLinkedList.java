import java.util.Iterator;

public class MySimpleLinkedList<T> {
    private Node<T>first;
    private int size;
    private Node<T>cursor;

    public MySimpleLinkedList(){
        this.first=null;
        this.size = 0;
        this.cursor=null;
    }
    //Metodos
    public void insertFront(T info){//Insertar en la primera posicion
        Node<T>tmp = new Node<T>(info, null);
        tmp.setNext(this.first);
        this.first = tmp;
        this.size++;
    }
    public T extractFront(){ //Elimina el primer elemento ingresado
        T tmp = this.first.getInfo();
        this.first = this.first.getNext();
        this.size--;
        return tmp;
    }
    public int size(){//Tamaño de la lista
        return this.size;
    }
    public T get(int index){ //muestra que informacion hay dentro del nodo
        int contador=0;
        if(index < this.size){
            Node<T>tmp = this.first;
            while(contador < index){
                tmp =tmp.getNext();
                contador++;
            }
            return tmp.getInfo();
        }else{
            return null;
        }
    }
    public void iniciarCursor(){
        this.cursor= this.first;//O(1)
    }
    public T getInfoCursor(){
        return this.cursor.getInfo();
    }
    public void avanzarCursor(){
        this.cursor= this.cursor.getNext();
    }
    public boolean cursorLlegoAlFinal(){
        return this.cursor == null;
    }
    public boolean isEmpty() {
        return this.first == null;
    }
    @Override
    public String toString(){
        String lista ="";
        Node<T>tmp = this.first;
        while(tmp != null){
            lista += tmp.getInfo().toString();
            if(tmp.getNext() != null){
                lista += "->";
            }
            tmp= tmp.getNext();
        }
        return lista;
    }

}

