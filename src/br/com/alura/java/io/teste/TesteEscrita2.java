package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		FileWriter fw = new FileWriter("lorem2.txt");
		
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		/* No Java é possível utilizar um separador simplesmente colocando o \n na linha
		 * porém isso varia de SO para SO, por meio do System.lineSeparator() é possível trazer
		 * esse separador com base no SO que está executando o código
		 */
		fw.write(System.lineSeparator());
		fw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		
		fw.close();
	}
}
