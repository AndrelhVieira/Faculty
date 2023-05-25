package EstudantesExample;

import java.util.ArrayList;
import java.util.List;

public class Carro extends Veiculo {
	private int portaMalas;
	
	public Carro(String marca, String motor, int portaMalas) {
		super(marca, motor);
		this.portaMalas = portaMalas;
	}
	
	public int getPortaMalas() {
		return this.portaMalas;
	}
	
	public static List<Carro> criar(String ... modelos) {
	    var carros = new ArrayList<Carro>();
	    for (var modelo : modelos) {
	        carros.add(new Carro(modelo, "1.0", 250));
	    }
	    return carros;
	}
	
}
