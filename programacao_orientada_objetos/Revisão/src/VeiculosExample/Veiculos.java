package VeiculosExample;

public class Veiculos {
	public String marca;
	public String motor;
	
	public Veiculos (String marca, String motor) {
		this.marca = marca;
		this.motor = motor;
	}
	
	public String imprime() {
		return "Marca: " + this.marca + " - Motor: " + this.motor;
	}
}