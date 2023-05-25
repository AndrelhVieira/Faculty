package EstudantesExample;

public class Onibus extends Veiculo {
	private int numeroPassageiros;
	private boolean articulado;
	
	public Onibus(String marca, String motor, int numeroPassageiros, boolean articulado) {
		super(marca, motor);
		this.numeroPassageiros = numeroPassageiros;
		this.articulado = articulado;
	}
	
	public int getNumeroPassageiros() {
		return this.numeroPassageiros;
	}
	
	public boolean isArticulado() {
		return this.articulado;
	}
}
