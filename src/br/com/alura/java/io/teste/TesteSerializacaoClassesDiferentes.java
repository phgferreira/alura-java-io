package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoClassesDiferentes {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cliente cliente = new Cliente();
		cliente.setNome("Fulano de Tal");
		
		ObjectOutputStream outputStream = new ObjectOutputStream( new FileOutputStream("clientev2.bin") );
		outputStream.writeObject(cliente);
		outputStream.close();
		
		ObjectInputStream inputStream = new ObjectInputStream( new FileInputStream("clientev2.bin") );
		// Pensando bem independente do serialVersionUID, vai dar CastException
		Conta conta = (Conta) inputStream.readObject();
		inputStream.close();
		
		System.out.println(conta);
	}
}
