package Carro;

public class Carro {
	private String marca;
	private boolean ligado;
	
	public Carro(String marca, boolean ligado) {
		this.marca = marca;
		this.ligado = ligado;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public boolean isLigado() {
		return this.ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	private void imprimir() {
		System.out.println("- - - - -");
		System.out.println("Marca:  " + this.getMarca());
		System.out.println("Ligado: " + (this.isLigado() == true ? "Ligado" : "Desligado"));
		System.out.println("- - - - -");
	}
	
	public static void main(String[] args) {
		Carro meuCarro = new Carro("Ford", false);
		meuCarro.imprimir();
		
		meuCarro.setMarca("Peugeot");
		meuCarro.setLigado(true);
		meuCarro.imprimir();
		
		meuCarro.setMarca("Chevrolet");
		meuCarro.setLigado(false);
		meuCarro.imprimir();
	}
}
