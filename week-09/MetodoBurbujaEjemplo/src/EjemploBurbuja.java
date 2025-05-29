import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploBurbuja {
    public static void main(String[] args) {
        int[] numeros ={64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array original: "+ Arrays.toString(numeros));
        ordenar(numeros);
        System.out.println("Array ordenado: "+ Arrays.toString(numeros));
}
public static void ordenar(int[] arr){
        int n = arr.length;
        boolean intercambio;
    for (int i = 0; i < n - 1; i++) {
        intercambio = false;
        for (int j = 0; j < n -1 - i; j++) {
            if(arr[j]> arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                intercambio = true;
            }

        }
        if(!intercambio){
            break;
        }
        System.out.println("Despues de la pasada "+ (i +1) + ": "+ Arrays.toString(arr));
    }
}
}