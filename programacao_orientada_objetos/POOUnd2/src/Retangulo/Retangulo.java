package Retangulo;

public class Retangulo {
	float altura;
	float largura;
	
	public Retangulo (float altura, float largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	float calcularPerimetro() {
		float pm = 2 * altura + 2 * largura;
		return pm;
	}
	
	void imprimirDados() {
		float p = calcularPerimetro();
		System.out.println("Retângulo: ");
		System.out.println("- altura:    " + altura);
		System.out.println("- largura:   " + largura);
		System.out.println("- perimetro: " + p);
	}
	
	public static void main(String[] args) {
		System.out.println("Mundo dos retangulos");
		
		Retangulo retg1 = new Retangulo(10, 20);
		retg1.imprimirDados();
		
		Retangulo retg2 = new Retangulo(5, 15);
		retg2.altura = 20;
		retg2.largura = 25;
		retg2.imprimirDados();
	}
}
