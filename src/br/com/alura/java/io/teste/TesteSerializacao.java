package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Paulo");
//		cliente.setProfissao("Analista de Sistemas");
//		cliente.setCpf("12345678990");
		
		String fileName = "cliente.bin";
//		ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(fileName) );
//		oos.writeObject(cliente);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream( new FileInputStream(fileName) );
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getNomeCpfPrifissao());

	}

}
