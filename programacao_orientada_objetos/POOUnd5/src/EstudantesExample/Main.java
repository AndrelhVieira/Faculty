package EstudantesExample;

import java.util.ArrayList;

import Moto.Moto;

public class Main {
	public static void main(String[] args) {
		var veiculos = new ArrayList<Veiculo>();
		
		veiculos.add(new Carro("Ford KA", "Firefly 1.0", 257));
		veiculos.add(new Carro("Fiat Uno", "Zetec Rocam 1.2", 290));
		
		veiculos.add(new Moto("Harley Davidson", "Milwaukee-Eight", 1868));
		veiculos.add(new Moto("Honda Biz", "OHC 4 tempos", 125));
        
		veiculos.add(new Onibus("Mercedes Benz", "Motor M", 20, false));

        for (Veiculo veiculo: veiculos) {
        	System.out.println(veiculo.imprimir());
        }
	}
}
