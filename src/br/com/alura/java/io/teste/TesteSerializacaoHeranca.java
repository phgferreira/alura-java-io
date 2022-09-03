package br.com.alura.java.io.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoHeranca {

	public static void main(String[] args) throws IOException {
		Cliente cliente = new Cliente();
		cliente.setNome("Paulo Ferreira");
		cliente.setProfissao("Analista de Sistemas");
		cliente.setCpf("12345678990");
		
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.setTitular(cliente);
		contaCorrente.deposita(222.3);
		
		ObjectOutputStream outputStream = new ObjectOutputStream( new FileOutputStream("conta.bin") );
		outputStream.writeObject(contaCorrente);
		outputStream.close();
	}
}
