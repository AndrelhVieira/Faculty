package FilesExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; 
import java.io.IOException;

public class Byte {
	public static void EscreverDados() {
		FileOutputStream arq;
		
		try {
			arq = new FileOutputStream("arq1.txt");
			
			for (int cont = 65; cont < 91; cont++) {
				arq.write(cont);
				System.out.print((char)cont);
			}
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void LerDados() {
		FileInputStream arq;
		int letra = 0;
		
		try {
			arq = new FileInputStream("arq1.txt");
			while(letra != -1) {
				letra = arq.read();
				if (letra != -1) {
					System.out.print((char)letra);
				}
			}
			
			arq.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void CopiarDados() {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("arq1.txt");
			out = new FileOutputStream("arq2.txt");
			
			int c;
			
			while((c = in.read()) != -1) {
				out.write(c);
				System.out.print((char)c);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("Arquivo não encontrado");
		}
	}
	
	public static void main (String[] args) {
		System.out.println("\n\nEscrita--------------");
		EscreverDados();
		System.out.println("\n\nLeitura--------------");
		LerDados();
		System.out.println("\n\nCopia--------------");
		CopiarDados();
	}
}
