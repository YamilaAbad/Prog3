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

    @Override
    public String toString() {
        return toString(" ", true);
    }
    private String toString(String actual, boolean esElultimo){
        String tree = actual;
        if(esElultimo){
            tree +="└──";
            actual += " ";
        }else{
            tree += "├──";
            actual += "│ ";
        }
        tree += this.value + "\n";
        if(this.getLeft() != null){
            tree += this.getLeft().toString(actual, this.getRight() == null);
        }
        if(this.getRight() != null){
            tree += this.getRight().toString(actual, true);
        }
        return tree;
    }
    public void setValue(int sucesor) {
        this.value=sucesor;
    }
}
