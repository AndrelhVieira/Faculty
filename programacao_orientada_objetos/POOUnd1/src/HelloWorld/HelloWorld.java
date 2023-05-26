package HelloWorld;

// import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World in Java!");

		// final int age = 10;
		// System.out.println(age);

		// Scanner reader = new Scanner(System.in);
		//
		// System.out.print("Informe seu nome: ");
		// String name = reader.next();
		//
		// switch(name) {
		// case "André":
		// System.out.println("Nome bonito rsrs");
		// break;
		// default:
		// System.out.println("Não conheço esse nome");
		// }

		// int [] list = new int[] {1,2,3,4,5};
		String[] names = new String[] {
				"André",
				"Gabi",
				"Poliana",
				"Luiz"
		};

		for (int index = 0; index < names.length; index++) {
			System.out.println(names[index]);
		}
	}
}
