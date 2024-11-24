import java.io.IOException;
import java.util.*;
 
public class Main {
    public static void organizarVetor(int[] vetor){
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void mostraVetorOrganizado(int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner Entrada = new Scanner(System.in);

        int tamanhoVetor = Entrada.nextInt();
        int vetorDeNumeros[] = new int[tamanhoVetor];
 
        for (int i = 0; i < vetorDeNumeros.length; i++){
            vetorDeNumeros[i] = Entrada.nextInt();
        }
        organizarVetor(vetorDeNumeros);
        mostraVetorOrganizado(vetorDeNumeros);
    }
}
