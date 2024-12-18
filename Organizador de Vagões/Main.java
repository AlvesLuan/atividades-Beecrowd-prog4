import java.io.IOException;
import java.util.*;
 

 
public class Main {

    public static void imprimir(int casosDeTeste, int[] resultados){
        for (int i = 0; i < casosDeTeste; i++) {
        System.out.println("Optimal train swapping takes " + resultados[i] + " swaps.");
        }
    }

    public static int bubbleSort (int arr[], int n){
        int contadorTrocas = 0;

        // bubbleSort retirado dos Slides!!!!!!!!!!!!!
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < n - i - 1; ++j){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    contadorTrocas++;
                }
            }
        }
        return contadorTrocas;
    }
 
    public static void main(String[] args) throws IOException {
        Scanner Entrada = new Scanner(System.in);

        int casosDeTeste = Entrada.nextInt();
        int[] resultados = new int[casosDeTeste];

        int contadorTestes = 0;
        while (contadorTestes < casosDeTeste) {
            int quantosVagoes = Entrada.nextInt();

            int vagoes[] = new int[quantosVagoes];
            for (int i = 0; i < quantosVagoes; i++) {
                vagoes[i] = Entrada.nextInt();
            }

            resultados[contadorTestes] = bubbleSort(vagoes, quantosVagoes);
            contadorTestes++;
        }
        imprimir(casosDeTeste, resultados);
    }
}
