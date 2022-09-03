package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Scanner scanner = new Scanner("contas.csv"); => Isso não funciona
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			String valores[] = linha.split(",");
			System.out.println(Arrays.toString(valores));
		}
		
		scanner.close();
	}
}
