package VeiculosExample;

public class Carro extends Veiculos {
	public int portaMalas;
	
	public Carro(String marca, String motor, int portaMalas) {
		super(marca, motor);
		this.portaMalas = portaMalas;
	}
	
	@Override
	public String imprime() {
		return super.imprime() + " - Porta Malas de " + this.portaMalas + " litros";
	}
}

