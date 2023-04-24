public class Main {
    public static void main(String[] args) {
        ordenarAscendente e2 = new ordenarAscendente();
        int[] arreglo = {1, 2, 3, 4, 5};
        int inferior=0;
        int superior = arreglo.length-1;
        int elemento=2;
        int encontrado=e2.ordenarAscendente(arreglo, elemento, inferior, superior);
        //System.out.println(arreglo.length);
        System.out.println("El numero "+ elemento+" se encontro en la posicion "+encontrado);


    }
}