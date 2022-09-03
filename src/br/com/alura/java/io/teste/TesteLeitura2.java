package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Scanner scanner = new Scanner("contas.csv"); => Isso não funciona
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			/* Definir a localidade é importante para o caso de precisar converter para double
			 * porque em algumas localidades usa-se ',' e em outros usa-se '.' como separador decimal
			 */
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			Integer valor2 = linhaScanner.nextInt();
			Integer valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			Double valor5 = linhaScanner.nextDouble();

			System.out.println(valor1 + ", " + valor2 + ", " + valor3 + ", " + valor4 + ", " + valor5);
			
			linhaScanner.close();
			
//			String valores[] = linha.split(",");
//			System.out.println(Arrays.toString(valores));
		}
		
		scanner.close();
	}
}
