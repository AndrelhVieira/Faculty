package ArrayListExample;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		int index;
		ArrayList<String> cores = new ArrayList<String>();
		cores.add("Azul");
		cores.add("Verde");
		cores.add("Vermelho");
		cores.add("Amarelo");
		
		for (index = 0; index < cores.size(); index++) {
			System.out.println((index + 1) + ") " + cores.get(index));
		}
		
		System.out.println("----");
		
		cores.set(1, "Pink");
		
		index = 0;
		
		for (String c: cores) {
			System.out.println((index + 1) + ") " + c);
		}
		
		cores.remove(3);
		
		index = 0;
		System.out.println("----");
		for (String c: cores) {
			System.out.println((index + 1) + ") " + c);
		}
		
		cores.clear();
		
		System.out.println("----");
	    System.out.println("Tamanho da lista = " + cores.size());
	}
}
