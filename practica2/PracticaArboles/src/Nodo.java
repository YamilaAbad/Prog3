public class Nodo {
    private int value;
    private Nodo left;
    private Nodo right;

    public Nodo(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }



}
