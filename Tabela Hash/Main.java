import java.util.*;

public class Main {

    public static void imprimirTabelaHash(List<Integer>[] tabelaHash, StringBuilder sbCarregado) {
        for (int i = 0; i < tabelaHash.length; i++) {
            sbCarregado.append(i).append(" ->");
            for (int chave : tabelaHash[i]) {
                sbCarregado.append(" ").append(chave).append(" ->");
            }
            sbCarregado.append(" \\").append("\n");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casosDeTeste = entrada.nextInt();
        entrada.nextLine(); 

        StringBuilder sbCarregado = new StringBuilder();

        for (int i = 0; i < casosDeTeste; i++) {
            int enderecosBase = entrada.nextInt();
            int quantidadeDeChaves = entrada.nextInt();
            entrada.nextLine(); 

            int[] chaves = new int[quantidadeDeChaves];
            for (int u = 0; u < quantidadeDeChaves; u++) {
                chaves[u] = entrada.nextInt();
            }
            entrada.nextLine(); 

            List<Integer>[] tabelaHash = new ArrayList[enderecosBase];
            for (int j = 0; j < enderecosBase; j++) {
                tabelaHash[j] = new ArrayList<>();
            }
            for (int chave : chaves) {
                tabelaHash[chave % enderecosBase].add(chave);
            }

            imprimirTabelaHash(tabelaHash, sbCarregado);

            if (i < casosDeTeste - 1) {
                sbCarregado.append("\n"); 
            }
        }

        System.out.print(sbCarregado.toString()); 
    }
}
