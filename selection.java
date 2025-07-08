class sortMethods {
    public static void main(String[] args) {

        int vetor[] = {3, 2, 1, 5, 4};
        int n = vetor.length;
        int mComparations = 0;
        int mMoviments = 0;

        long startTime = System.nanoTime(); 

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                mComparations++;
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
            int aux = vetor[min];
            mMoviments++;
            vetor[min] = vetor[i];
            mMoviments++;
            vetor[i] = aux;
            mMoviments++;
        }

        long endTime = System.nanoTime(); 
        long duração = endTime - startTime;

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
