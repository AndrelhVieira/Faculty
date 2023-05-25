public class App {
    public static void main(String[] args) throws Exception {
        // int[] vetor = { 1, 5, 2, 3, 1, 3, 1 };
        int[] vetor = { 1, 1, 2, 2, 3, 4, 5, 6 };
        int moda = 0;
        int qtdeModa;

        for (int indexA = 0; indexA < vetor.length; indexA++) {
            qtdeModa = 1;
            for (int indexB = 0; indexB < vetor.length; indexB++) {
                if (indexA == indexB) {
                    continue;
                }
                if (vetor[indexA] == vetor[indexB]) {
                    qtdeModa++;
                }
            }

            if (qtdeModa > 1) {
                moda = vetor[indexA];
            }
        }

        if (moda != 0) {
            System.out.println("Valor da moda: " + moda);
        } else {
            System.out.println("Não existe moda para este vetor!");
        }
    }
}
