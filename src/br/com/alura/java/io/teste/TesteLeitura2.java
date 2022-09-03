package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {
		
		//Scanner scanner = new Scanner("contas.csv"); => Isso não funciona
		Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.US_ASCII);
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			/* Definir a localidade é importante para o caso de precisar converter para double
			 * porque em algumas localidades usa-se ',' e em outros usa-se '.' como separador decimal
			 */
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			Integer agencia = linhaScanner.nextInt();
			Integer numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			Double saldo = linhaScanner.nextDouble();
			
			// Esse método faz com que cada argumento (valor1, valor2, etc.) encaixem dentro de um string nos lugares %s
			System.out.format( new Locale("pt","br"), "%s - %04d-%08d, %20s: %08.2f %n", 
													tipoConta, agencia, numero, titular, saldo);
			
			linhaScanner.close();
			
//			String valores[] = linha.split(",");
//			System.out.println(Arrays.toString(valores));
		}
		
		scanner.close();
	}
}
