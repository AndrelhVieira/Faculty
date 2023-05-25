package Associacao;

public class Dono {
	private String nome;
	private Cao[] pets;
	
	public Dono(String nome) {
		this.nome = nome;
		this.pets = new Cao[3];
	}
	
	public void addPet(int index, Cao pet) {
		this.pets[index] = pet;
	}
	
	public Cao getPet(int index) {
		return this.pets[index];
	}

	public void alimentarCaes() {
		for (int index = 0; index < 3; index++) {
			pets[index].realizarRefeicao();
		}		
	}
	
	public void receberFesta() {
		for (int index = 0; index < 3; index++) {
			System.out.println(this.nome + " está recebendo festa de " + this.pets[index].getNomeCao());
		}
	}
	
	public void listarCaes() {
		for (int index = 0; index < 3; index++) {
			this.pets[index].printCao();
		}
	}
	
	public static void main(String[] args) {
		Dono maria = new Dono("Maria");
		Cao pipoca = new Cao("Pipoca", "Beagle", "Fêmea", 3, "Enrolada", "Pêlo curtinho");
		Cao rex = new Cao("Rex", "Labrador", "Macho", 2, "Esticado", "Peludo");
		Cao bruce = new Cao  ("Bruce", "Pug", "Macho", 2, "Caracol", "Pêlo curtinho");

		maria.addPet(0, pipoca);
		maria.addPet(1, rex);
		maria.addPet(2, bruce);
		
		pipoca.setMeuDono(maria);
		rex.setMeuDono(maria);
		bruce.setMeuDono(maria);
		
		System.out.println("Cachorros de " + maria.nome);
		maria.listarCaes();
		
		maria.alimentarCaes();
		maria.receberFesta();
	}
}
