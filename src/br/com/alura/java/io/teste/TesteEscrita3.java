package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);

		//BufferedWriter bw = new BufferedWriter(osw);
		//PrintStream ps = new PrintStream(new File("lorem2.txt"));
		//PrintStream ps = new PrintStream("lorem2.txt");
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
		
		ps.close();
		
		/* System.out.println();
		 * O atributo out do System é um PrintStream, então o método println que usamos acima
		 * é o mesmo do System.out.println(). A diferença é que o out está ligado ao console
		 */
	}
}
