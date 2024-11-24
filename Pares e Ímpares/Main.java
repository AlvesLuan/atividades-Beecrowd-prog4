import java.io.IOException;
import java.util.*;
 
public class Main {
    public static void organizarArray(int[] array){
        Arrays.sort(array);

        /*
        int tamanho = array.length;
        //bubbleSort não pode, mt pesadin, time exceed.
         
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        } */
    }

    public static void mostraarrayOrganizado(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner Entrada = new Scanner(System.in);

        int tamanhoArray = Entrada.nextInt();
        int arrayDeNumeros[] = new int[tamanhoArray];
 
        for (int i = 0; i < arrayDeNumeros.length; i++){
            arrayDeNumeros[i] = Entrada.nextInt();
        }
        organizarArray(arrayDeNumeros);
        mostraarrayOrganizado(arrayDeNumeros);
    }
}
