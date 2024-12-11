import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner Entrada = new Scanner(System.in);
        boolean repeticao = true;
        do{
            String linha = Entrada.nextLine();

            if (linha.equals("FIM")) {
                repeticao = false;
                break;
            }
            
            String[] partes = linha.split(" ");
            String nome = partes[0];
            String situacao = partes[1];

            System.out.println(nome+" E "+situacao);
        }while (repeticao);

        System.out.println("SAIU") ;

    }
}
