package model;

public abstract class Transacao {
	/*
	 * Criar as classes Transacao, Despesa e Receita. no pacote model.
	 * 
	 * Transacao deverá ser uma classe abstrata que representa uma transação
	 * financeira.
	 * 
	 * Despesa e Receita deverão ser subclasses de Transacao que representam
	 * despesas e receitas, respectivamente.
	 */
	
	private String discricao;
	private double valor;
	
	@Override
	public String toString() {
		return discricao + ": R$ " + valor;
	}

	public Transacao(String descricao, double valor) {
		super();
		this.discricao = descricao;
		this.valor = valor;
		// TODO Auto-generated constructor stub
	}



	public String getDescricao() {
		return discricao;
	}



	public void setDescricao(String descricao) {
		this.discricao = descricao;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}


}