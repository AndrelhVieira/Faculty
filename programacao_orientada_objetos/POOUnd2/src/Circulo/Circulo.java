package Circulo;

import java.util.Scanner;

public class Circulo {
	float raio;
	final static float PI = 3.1415f;
	
	public Circulo (float raio) {
		this.raio = raio;
	}
	
	float calcularPerimetro() {
		return 2 * PI * this.raio;
	}
	
	void imprimirDados() {
		System.out.println("Círculo: ");
		System.out.println("- raio     : " + raio);
      	System.out.println("- perímetro: " + calcularPerimetro());
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		float raio;
		
		System.out.println("Mundo dos circulos");
		
		// Primeira instância
		System.out.println("Entre com o valor do raio: ");
		raio = reader.nextFloat();
		
		Circulo circ1 = new Circulo(raio);
		circ1.imprimirDados();
		
		System.out.println("- - - - - - - - - -");
		
		// Segunda instância
		System.out.println("Entre com o valor do raio: ");
		raio = reader.nextFloat();
		
		Circulo circ2 = new Circulo(raio);
		circ2.imprimirDados();
	}
}
