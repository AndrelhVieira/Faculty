public class Fila {
    int[] fila;
    int inicio;
    int fim;

    public Fila() {
        this.inicio = -1;
        this.fim = -1;
        this.fila = new int[10];
    }

    public void adicionar(int valor) {
        if (this.fim != this.fila.length - 1) {
            if (this.inicio == -1) {
                this.inicio = 0;
            }
            fim++;
            fila[fim] = valor;
        }
    }

    public void mostrarFila() {
        for (int index = 0; index < this.fim; index++) {
            System.out.print(fila[index] + " <- ");
        }
    }
}
