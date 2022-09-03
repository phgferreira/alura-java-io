package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		// Dessa forma é possível receber os dados pela rede
		//Socket socket = new Socket();
		
		// Leitura a digitação do teclado
		//InputStream fis = new FileInputStream("lorem.txt");
		//InputStream fis = socket.getInputStream();
		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// Escrita do arquivo
		//OutputStream fos = new FileOutputStream("lorem2.txt");
		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		// Realiza cópia linha por linha
		String linha = br.readLine();
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			/* Normalmente o BufferedWriter acumula todo o conteúdo de saída para depois descarregar
			 * usando o método flush() você descarrega antes de terminar o uso do BufferedWriter
			 */
			bw.flush(); 
			linha = br.readLine();
		}
		
		
		br.close();
		bw.close();
	}
}
