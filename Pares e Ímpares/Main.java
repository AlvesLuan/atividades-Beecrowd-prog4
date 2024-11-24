import java.io.IOException;
import java.util.*;
 
public class Main {
    public static void separarParesEImpares(int[] arrayGERAL, ArrayList<Integer> pares, ArrayList<Integer> impares) {
        for (int i = 0; i < arrayGERAL.length; i++) {
            if(arrayGERAL[i] % 2 == 0) {
                pares.add(arrayGERAL[i]);
            } else {
                impares.add(arrayGERAL[i]);
            }
        }
    }

    public static void ordenaParesEmCrescente(ArrayList<Integer> arrayPares){
        Collections.sort(arrayPares);
    }

    public static void ordenaImparesEmDecrescente(ArrayList<Integer> arrayImpares){
        arrayImpares.sort(Collections.reverseOrder());
        
    }

    public static void printarTudo(ArrayList<Integer> arrayListPar, ArrayList<Integer> arrayListImpar){
        for (int num : arrayListPar) {
            System.out.println(num);
        }

        for (int num : arrayListImpar) {
            System.out.println(num);
        }
    }



    public static void main(String[] args) throws IOException {
        Scanner Entrada = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        int tamanho = Entrada.nextInt();
        int arrayDeNumeros[] = new int[tamanho];
 
        for (int i = 0; i < arrayDeNumeros.length; i++){
            arrayDeNumeros[i] = Entrada.nextInt();
        }

        

        separarParesEImpares(arrayDeNumeros, pares, impares);

        ordenaParesEmCrescente(pares);
        ordenaImparesEmDecrescente(impares);

        printarTudo(pares, impares);
        
    }
}
