public class Buscar {
    public void coincidencias(int[] arr, int pos) {
        if(pos<arr.length){
            System.out.println(pos);
            if (arr[pos]==pos) {
                System.out.println("El numero: "+arr[pos]+" es igual a: "+pos);
                coincidencias(arr,pos+1);
            } else {
                coincidencias(arr,pos+1);
            }
        }
    }

}
