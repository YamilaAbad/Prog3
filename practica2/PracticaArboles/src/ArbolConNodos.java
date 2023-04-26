
public class ArbolConNodos {
    private Nodo root;

    public ArbolConNodos() {
        this.root = null;
    }

    public void add(int value) {
        if (this.root == null)
            this.root = new Nodo(value);
        else
            this.add(this.root,value);
    }

    private void add(Nodo actual, int value) {
        if (actual.getValue() > value) {
            if (actual.getLeft() == null) {
                Nodo temp = new Nodo(value);
                actual.setLeft(temp);
            } else {
                add(actual.getLeft(),value);
            }
        } else if (actual.getValue() < value) {
            if (actual.getRight() == null) {
                Nodo temp = new Nodo(value);
                actual.setRight(temp);
            } else {
                add(actual.getRight(),value);
            }
        }
    }

    public Integer getRoot(){
        return this.root.getValue();
    }

    public boolean hasElem(Integer elem){
        if (!this.isEmpty()){
            Nodo nodo = root;
            return buscarElemento(nodo, elem);
        }
        return false;
    }

    private boolean buscarElemento(Nodo nodo, Integer elem){
        if(nodo.getValue()==elem){
            return true;
        }else
            if (nodo.getValue()<elem){
                buscarElemento(nodo.getRight(), elem);
            }else
                buscarElemento(nodo.getLeft(),elem);
            return false;
    }
    public boolean isEmpty(){
        return root == null;
    }
}
