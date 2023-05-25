package Moto;

import EstudantesExample.Veiculo;

public class Moto extends Veiculo {
	private int cilindradas;
	
	public Moto(String marca, String motor, int cilindradas) {
		super(marca, motor);
		this.cilindradas = cilindradas;
	}

    public int getCilindradas() {
        return cilindradas;
    }
    
    @Override
    public String imprimir() {
    	return super.imprimir() + " de " + getCilindradas() + " cilindradas.";
    }
}
