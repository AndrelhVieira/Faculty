package Overload;

public class Soma {
	public int somar(int x, int y) {
		return x + y;
	}
	
	public int somar(int x, int y, int z) {
		return x + y + z;
	}
	
	public double somar(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		Soma s = new Soma();
		System.out.println(s.somar(3, 4));     
		System.out.println(s.somar(3, 4, 5));
		System.out.println(s.somar(3.4, 5.6));
	}
}
