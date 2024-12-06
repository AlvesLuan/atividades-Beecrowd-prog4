import java.io.IOException;
import java.util.*;

public class Main {

    public static List<Integer>[] criarTabelaHash(int enderecosBase, int[] chaves) {
        List<Integer>[] tabelaHash = new List[enderecosBase];
        for (int i = 0; i < enderecosBase; i++) {
            tabelaHash[i] = new ArrayList<>(); 
        }
        for (int chave : chaves) {
            int hash = chave % enderecosBase; 
            tabelaHash[hash].add(chave); 
        }
        return tabelaHash;
    }

    public static void imprimirTabelaHash(List<Integer>[] tabelaHash) {
        for (int i = 0; i < tabelaHash.length; i++) {
            System.out.print(i + " ->");
            for (int chave : tabelaHash[i]) {
                System.out.printf(" %d ->", chave);
            }
            System.out.println(" \\");
        }
    }


    static Scanner Entrada = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int casosDeTeste = Entrada.nextInt();
        Entrada.nextLine(); 

        for (int i = 0; i < casosDeTeste; i++) {
            String[] entradasASeparar = Entrada.nextLine().split(" ");
            int enderecosBase = Integer.parseInt(entradasASeparar[0]);
            int quantidadeDeChaves = Integer.parseInt(entradasASeparar[1]);

            int[] chaves = new int[quantidadeDeChaves];
            String[] entradaChaves = Entrada.nextLine().split(" ");
        
            for (int i = 0; i < quantidadeDeChaves; i++) {
                chaves[i] = Integer.parseInt(entradaChaves[i]);
            }

            List<Integer>[] tabelaHash = criarTabelaHash(enderecosBase, chaves);

            imprimirTabelaHash(tabelaHash);
            if (i < casosDeTeste - 1) {
                System.out.println(); 
            }
        }













    }
}
