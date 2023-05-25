public class Pilha {
    private int topo;
    private int[] dados;

    public Pilha() {
        this.dados = new int[10];
        this.topo = -1;
    }

    public boolean PilhaVazia() {
        if (this.topo == -1) {
            return true;
        }

        return false;
    }

    public void Empilhar(int valor) {
        // System.out.println("this.topo " + this.topo);
        // System.out.println("this.dados.length " + this.dados.length);
        if (this.topo < this.dados.length - 1) {
            this.topo++;
            this.dados[this.topo] = valor;
        }
    }

    public void MostrarPilha() {
        for (int index = this.dados.length - 1; index >= 0; index--) {
            if (this.dados[index] != 0) {
                System.out.println("|" + this.dados[index] + "|");
            }
        }
    }

    public void Desempilhar() {
        if (!this.PilhaVazia()) {
            this.dados[this.topo] = 0;
            this.topo--;
        }
    }

    public boolean PilhaCheia() {
        System.out.println("this.topo " + this.topo);
        if (this.topo == this.dados.length - 1) {
            return true;
        }

        return false;
    }

}