package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Scanner scanner = new Scanner("contas.csv"); => Isso não funciona
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		String linha = scanner.nextLine();
		while (scanner.hasNextLine())
			linha += System.lineSeparator() + scanner.nextLine();
		
		System.out.println(linha);
		
		scanner.close();
	}
}
