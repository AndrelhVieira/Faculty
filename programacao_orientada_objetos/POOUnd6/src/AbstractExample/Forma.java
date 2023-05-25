package AbstractExample;

public abstract class Forma {
	public abstract double getArea();
	public abstract double getPerimetro();
	int idade = 10;
	
	public void imprimirHello() {
		System.out.println("Hello World");
		System.out.printf("Idade: %d", this.idade);
	}
}
