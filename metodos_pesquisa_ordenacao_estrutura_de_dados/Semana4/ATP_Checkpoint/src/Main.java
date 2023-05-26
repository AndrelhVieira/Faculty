/* Projeto desenvolvido por:
    * André Luiz Vieira
    * Miguel Natan Tomaz
    * Vitoria Kotowski da Cunha
    * Brenda Menezes Bertolo
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Lista l = new Lista();
        l.insereUltimo(50);
        l.insereUltimo(20);
        l.insereUltimo(30);

        l.mostrar();

        System.out.print("| \n antes inserePrimeiro \n");

        l.inserePrimeiro(0);

        l.mostrar();

        System.out.print("| \n antes de insereUltimo \n");

        l.insereUltimo(250);

        l.mostrar();

        System.out.print("| \n antes de remover primeiro \n");

        l.removePrimeiro();

        l.mostrar();

        System.out.print("| \n antes de remover ultimo \n");

        l.removeUltimo();

        l.mostrar();

        System.out.print("| \n antes de remove() primeiro \n");

        No primeiroNo = l.getPrimeiro();

        l.remove(primeiroNo);

        l.mostrar();

        System.out.print("| \n Antes do insereDepois \n");

        No primeiroNoAgora = l.getPrimeiro();

        l.insereDepois(primeiroNoAgora, 555);

        l.mostrar();
    }
}
