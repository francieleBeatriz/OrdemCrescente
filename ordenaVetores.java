import java.util.Arrays;
public class OrdenacaoEstatisticas {

    public static void main(String[] args) {
        char[] vetor1 = {'R', 'O', 'N', 'E', 'D', 'A'};
        char[] vetor2 = {'A', 'D', 'E', 'N', 'O', 'R'};
        char[] vetor3 = {'O', 'R', 'D', 'E', 'N', 'A'};

        System.out.println("VETOR1 antes da ordenacao: " + Arrays.toString(vetor1));
        ordenacaoAndEstatisticas(vetor1);

        System.out.println("\nVETOR2 antes da ordenacao: " + Arrays.toString(vetor2));
        ordenacaoAndEstatisticas(vetor2);

        System.out.println("\nVETOR3 antes da ordenacao: " + Arrays.toString(vetor3));
        ordenacaoAndEstatisticas(vetor3);
    }

    public static void ordenacaoAndEstatisticas(char[] vetor) {
        long startTime = System.nanoTime();
        int quantForExecutados = 0;
        int quantIfExecutado = 0;
        int trocasPosicao = 0;

        for (int i = 0; i < vetor.length - 1; i++) {
            quantForExecutados++;
            for (int j = 0; j < vetor.length - i - 1; j++) {
                char aux = vetor[j];
                quantForExecutados++;
                if (vetor[j] > vetor[j + 1]) {
                    
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    trocasPosicao++;
                    quantIfExecutado++;
                }
            }
        }

        long endTime = System.nanoTime();
        long tempoGasto = endTime - startTime;

        System.out.println("\nVetor Ordenado: " + Arrays.toString(vetor));
        System.out.println("Quantidade de vezes que foi executado um FOR: " + quantForExecutados);
        System.out.println("Quantidade de vezes que foi executado um IF: " + quantIfExecutado);
        System.out.println("Trocas de posicoes realizadas: " + trocasPosicao);
        System.out.printf("Tempo de execucao: %d nanosegundos\n", tempoGasto);
    }

}
