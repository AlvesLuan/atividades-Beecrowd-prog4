public class SortMethods {
    public static void main(String[] args) {
        int vetor[] = {25, 57, 48, 37, 12, 92, 86, 19, 73, 33};
        int n = vetor.length;          // tamanho do vetor
        int mComparations = 0;         // contador de comparações
        int mMoviments = 0;            // contador de movimentações

        long startTime = System.nanoTime();
        int h = 1;
        while (h < n) {
            h = h * 3 + 1;  // sequência de incremento (gap)
        }

        // Loop principal para o ShellSort
        while (h > 0) {
            for (int i = h; i < n; i++) {
                int aux = vetor[i];
                mMoviments++;  // para a movimentação do auxiliar
                int j = i;
                // Comparações e movimentações enquanto o valor da posição anterior é maior
                while (j >= h && vetor[j - h] > aux) {
                    vetor[j] = vetor[j - h];
                    mMoviments++;  // movimentações
                    mComparations++;  // comparações
                    j -= h;
                }
                vetor[j] = aux;
                mMoviments++;  // movimentação do aux
            }
            h = (h - 1) / 3;  // ajustando o valor de h
        }

        long endTime = System.nanoTime();  // tempo final
        long duration = endTime - startTime;  // duração da execução

        // Exibindo os resultados
        System.out.println("\n\nVetor ordenado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nComparações: " + mComparations);
        System.out.println("Movimentações: " + mMoviments);
        System.out.println("Tempo de execução (ns): " + duration);
        System.out.println("\n");
    }
}
