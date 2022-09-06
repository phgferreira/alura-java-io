package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class TesteFormatoArquivos {

	public static void main(String[] args) throws IOException {
		// O arquivo deve ter apenas uma linha
		String arquivo = "testeCharset_utf8.txt";
		
		// ############ LEITURA LEITURA COM BUFFERED READER ############
		InputStream inputStream = new FileInputStream(arquivo);
		Reader reader = new InputStreamReader(inputStream, "utf-16");
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		String linha = bufferedReader.readLine();
		System.out.println(linha);
		
		bufferedReader.close();
		
		// ############ LEITURA COM SCANNER ############
		Scanner scanner = new Scanner( new File(arquivo), "utf-16" );

		linha = scanner.nextLine();
		System.out.println(linha);
			
		scanner.close();
	}
}
