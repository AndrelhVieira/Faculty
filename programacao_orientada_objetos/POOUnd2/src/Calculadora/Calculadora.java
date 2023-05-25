package Calculadora;

import java.util.Scanner;

public class Calculadora {
	static float somar(float a, float b) {
		return a + b;
	}
	
	static float multiplicar(float a, float b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		float x, y, z;
		
		System.out.println("Entre com o vlaor de x: ");
		x = reader.nextFloat();
		
		System.out.println("Entre com o vlaor de y: ");
		y = reader.nextFloat();
		
		z = Calculadora.somar(x, y);
		System.out.println("x + y = " + z);
		
		z = Calculadora.multiplicar(x, y);
		System.out.println("x * y = " + z);
	}
}
