package StringDemo;

public class StringDemo {
	public static void main(String[] args) {
		String ola = "Olá";
		
		String nome1 = new String("Maria");
		String nome2 = new String("Joao");
		
		String saudacao = ola + ", " + nome1 + "!\n\n";
		System.out.println(saudacao);
		
		saudacao = ola;
		
		saudacao = saudacao.concat(", " + nome2);
		saudacao = saudacao.concat("!\n\n");
		
		System.out.println(saudacao + "fim");
	}
}
