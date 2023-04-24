public class ConversorBinario {

    public void convertir(int numero) { int resto=0;

        if(numero!=0){
            resto=numero%2;
            System.out.print(resto);
            numero= numero/2;
            convertir(numero);
        }
    }
}
