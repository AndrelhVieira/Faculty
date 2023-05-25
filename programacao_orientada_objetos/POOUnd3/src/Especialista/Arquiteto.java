package Especialista;

import Matemática.Circulo;

public class Arquiteto {
	private String nome;
	private int idade;

	public Arquiteto(String nome, int idade) {
		this.nome = nome;
		this.idade = idade; 
	}
	
	public void exibirDadosPessoais(){
		System.out.println(nome);
		System.out.println(idade + " anos");
	}
	
	public void trabalhe(double r1, double r2, double r3) {
		Circulo a = new Circulo(r1);
		double x = a.area();
		double y = a.perimetro();
		imprima(r1,x,y);
		
		Circulo b= new Circulo(r2); 
		x = b.area();
		y = b.perimetro();
		imprima(r2,x,y);
		
		b = new Circulo(r3);      
		x = b.area();
		y = b.perimetro();
		imprima(r3,x,y);
	}

	private void imprima(double raio, double area, double perimetro) {
		System.out.printf("raio: %.2f cm\n", raio);  
		System.out.printf("area: %.2f cm\n", area);
		System.out.printf("perimetro: %.2f cm\n", perimetro);
		System.out.println();
	}

	public static void main (String[] args) {
		Arquiteto a1 = new Arquiteto ("Oscar Niemeyer", 104);
		a1.trabalhe(5, 7, 10);
	}
}
