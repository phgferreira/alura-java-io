package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacaoHeranca {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		ObjectInputStream inputStream = new ObjectInputStream( new FileInputStream("conta.bin") );
		ContaCorrente contaCorrente = (ContaCorrente) inputStream.readObject();
		inputStream.close();
		
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaCorrente.getTitular().getNome());
	}
}
