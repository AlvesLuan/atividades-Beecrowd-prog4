import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner Entrada = new Scanner(System.in);
        String linha = Entrada.nextLine();
        
        // 5 2 5 6 3 8
        String[] partes = linha.split(" ");
        int qtdLivros = Integer.parseInt(partes[0]); // Converte para inteiro
        int arrayDeValores[] = new int[qtdLivros];
        for (int i = 1; i < arrayDeValores.length; i++){
            arrayDeValores[i] = Integer.parseInt(partes[i]);
        }

        System.out.print(qtdLivros+" ");
        for (int num : arrayDeValores) {
            System.out.print(num+" ");
        }
        
    }
 
}
