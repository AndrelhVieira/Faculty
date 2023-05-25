package ArrayListExample;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int option = 0;
		Scanner reader = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<String>();

		
		while(option != 3) {
			System.out.println("Selecione uma opcao");
			System.out.println("1 - Inserir novo nome\n2 - Exibir lista de nomes\n3 - Sair");
			option = reader.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Insira um nome: ");
					String currentName = reader.next();
					
					if(!currentName.isEmpty()) {
						names.add(currentName);
					}
				break;
				case 2:
					for (String name: names) {
						System.out.println(name);
					}
					break;
				case 3:
					System.out.println("Fim do programa");
					break;
				default:
					System.out.println("Selecione um numero valido");
			}
		}
	}
}
