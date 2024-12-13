import java.util.*;
import java.util.stream.Collectors;
import java.io.IOException;

public class Main {
    
    private static List<Integer> gerarTodosOsConjuntos(int[] portugues, int[] matematica, int[] fisica, int[] quimica, int[] biologia) {
        List<Integer> valoresConjuntos = new ArrayList<>();
        for (int lp : portugues) {
            for (int lm : matematica) {
                for (int lf : fisica) {
                    for (int lq : quimica) {
                        for (int lb : biologia) {
                            valoresConjuntos.add(lp + lm + lf + lq + lb);
                        }
                    }
                }
            }
        }
        return valoresConjuntos;
    }

    private static int[] lerLivros(Scanner scanner) {
        int n = scanner.nextInt();
        int[] livros = new int[n];
        for (int i = 0; i < n; i++) {
            livros[i] = scanner.nextInt();
        }
        return livros;
    }

    private static int calcularSomaDosMaiores(List<Integer> valoresConjuntos, int K) {
        List<Integer> ordenados = valoresConjuntos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int soma = 0;
        for (int i = 0; i < K; i++) {
            soma = soma + ordenados.get(i);
        }
        return soma;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] livrosPortugues = lerLivros(scanner);
        int[] livrosMatematica = lerLivros(scanner);
        int[] livrosFisica = lerLivros(scanner);
        int[] livrosQuimica = lerLivros(scanner);
        int[] livrosBiologia = lerLivros(scanner);
        int K = scanner.nextInt();

        List<Integer> valoresConjuntos = gerarTodosOsConjuntos(livrosPortugues, livrosMatematica, livrosFisica, livrosQuimica, livrosBiologia);

        int soma = calcularSomaDosMaiores(valoresConjuntos, K);

        System.out.println(soma);
    }
}
