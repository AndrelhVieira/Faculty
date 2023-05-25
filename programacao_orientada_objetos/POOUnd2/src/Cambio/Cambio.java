package Cambio;

public class Cambio {
	static float cotacaoDolar = 4.0f;
	
	float converteDolar(float valorReal) {
		return valorReal / cotacaoDolar;
	}
	
	float converteReal(float valorDolares) {
		return valorDolares * cotacaoDolar;
	}
	
	public static void main(String[] args) {
		float valorDolar, valorReal;
		
		Cambio c1 = new Cambio();
		
		System.out.printf("-- U$ 1,00 vale R$ %.2f\n", Cambio.cotacaoDolar);
		System.out.printf("U$ 10,00 = R$ %.2f\n", c1.converteReal(10f));
		System.out.printf("R$ 10,00 = U$ %.2f\n", c1.converteDolar(10f));
		
		Cambio c2 = new Cambio();
		
		Cambio.cotacaoDolar = 5f;
		
		System.out.printf("\n-- U$ 1,00 vale R$ %.2f\n", Cambio.cotacaoDolar); 
		System.out.printf("U$ 10,00 = R$ %.2f\n", c2.converteReal(10f));
		System.out.printf("R$ 10,00 = U$ %.2f\n", c2.converteDolar(10f));
		
		System.out.printf("\nCotação dolar c1: %f", Cambio.cotacaoDolar);
		System.out.printf("\nCotação dolar c2: %f", Cambio.cotacaoDolar);
	}
}
