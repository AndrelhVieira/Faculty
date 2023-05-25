package AbstractExample;

public class Retangulo extends Forma {
	private double lado1;
	private double lado2;
	
	public Retangulo(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public double getLado1() {
		return this.lado1;
	}
	
	public double getLado2() {
		return this.lado2;
	}

	@Override
	public double getArea() {
		return this.lado1 * this.lado2;
	}

	@Override
	public double getPerimetro() {
		return (this.lado1 * 2) + (this.lado2 * 2);
	}
}
