package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String fileName = "objeto.bin";
//		String nome = "Paulo Ferreira";
//		ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(fileName) );
//		oos.writeObject(nome);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream( new FileInputStream(fileName) );
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);
		

	}

}
