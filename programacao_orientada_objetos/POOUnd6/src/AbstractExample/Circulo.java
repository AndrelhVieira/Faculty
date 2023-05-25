package AbstractExample;

public class Circulo extends Forma implements Imprimivel {
	private static final double PI = 3.1415;
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	@Override
	public double getArea() {
		return PI * this.raio * this.raio;
	}

	@Override
	public double getPerimetro() {
		return 2 * PI * this.raio;
	}
	
	@Override
	public void imprimir() {
		System.out.printf("Circulo - Area: %.2f%n", this.getArea());
	}
}
