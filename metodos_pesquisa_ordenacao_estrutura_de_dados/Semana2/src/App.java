public class App {
    public static void main(String[] args) throws Exception {
        Pilha p = new Pilha();
        System.out.println("Pilha vazia: " + p.PilhaVazia());
        p.Empilhar(10);
        p.Empilhar(20);
        p.Empilhar(30);
        p.Empilhar(40);
        p.MostrarPilha();
        System.out.println("Pilha vazia: " + p.PilhaVazia());

        System.out.println("- - - - - - - - -");

        Pilha p2 = new Pilha();
        p2.Empilhar(50);
        p2.Empilhar(60);
        p2.Empilhar(70);
        p2.MostrarPilha();
        System.out.println("Desempilhando...");
        p2.Desempilhar();
        p2.Desempilhar();
        p2.MostrarPilha();

        System.out.println("- - - - - - - - -");

        Pilha p3 = new Pilha();
        p3.Empilhar(1);
        p3.Empilhar(2);
        p3.Empilhar(3);
        p3.Empilhar(4);
        p3.Empilhar(5);
        p3.Empilhar(6);
        p3.Empilhar(7);
        p3.Empilhar(8);
        p3.Empilhar(9);
        p3.Empilhar(10);
        p3.Empilhar(11);
        p3.Empilhar(11);
        p3.Empilhar(11);
        p3.Empilhar(11);
        p3.Empilhar(11);
        p3.Desempilhar();
        p3.MostrarPilha();
        System.out.println("Pilha cheia: " + p3.PilhaCheia());
    }
}
