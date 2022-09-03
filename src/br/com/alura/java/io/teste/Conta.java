package br.com.alura.java.io.teste;

import java.io.Serializable;

public class Conta implements Serializable {

	/**
	 * Criei essa classe só para testar se seria possível desserializar dois objetos de classes difentes
	 * porém com o mesmo serialVersionUID, eu acho que não funciona mas não custa tentar kkk
	 */
	private static final long serialVersionUID = 1L;

	private Integer agencia;
	private Integer conta;
	// A palavra chave transient significa o titular não é serializavel e não dá erro, simplesmente não o grava
	private transient Cliente titular;
	private Double saldo = 0.0;
	
	public Conta(Integer agencia, Integer conta) {
		super();
		this.agencia = agencia;
		this.conta = conta;
	}
	
	public void deposita(Double valor) {
		this.saldo += valor;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Double getSaldo() {
		return saldo;
	}
}
