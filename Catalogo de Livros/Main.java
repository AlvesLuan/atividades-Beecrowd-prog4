import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {

    public static void printar(int[] arrayDeMaiores){
        for (int num : arrayDeMaiores) {
            System.out.println(num);
        }
    }

    public static void somaMaiores(int[] arrayDeMaiores){
        int resultado = 0;
        for (int u = 0; u < arrayDeMaiores.length ; u++){
            resultado += arrayDeMaiores[u];
        }
        System.out.println(resultado);
    }
 
    public static void main(String[] args) throws IOException {
        Scanner Entrada = new Scanner(System.in);
        int linhas = 0;
        int totalLinhas = 5;
        int arrayDeMaiores[] = new int[5];
        
        /*  entradas a testar:
            5 2 5 6 3 8 
            5 9 6 3 1 5
            5 4 8 5 2 6
            5 3 2 4 9 5
            5 7 8 5 1 4     */

        while (linhas < totalLinhas) {
            String linha = Entrada.nextLine();
            String partes[] = linha.split(" ");
            
            int qtdLivros = Integer.parseInt(partes[0]);
            int arrayDeValores[] = new int[qtdLivros];

            for (int i = 0; i < qtdLivros && i + 1 < partes.length; i++) {
                arrayDeValores[i] = Integer.parseInt(partes[i + 1]);
            }

            int maiorValor = Integer.MIN_VALUE;
            for (int valor : arrayDeValores) {
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
            }
            arrayDeMaiores[linhas] = maiorValor;

            linhas++;
        }
        int ultimaLinha = Entrada.nextInt();

        somaMaiores(arrayDeMaiores);
        //printar(arrayDeMaiores);
    }
}
