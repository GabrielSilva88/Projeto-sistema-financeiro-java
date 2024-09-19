package controller;

import java.util.ArrayList;
import java.util.List;

import model.Despesa;
import model.Receita;

import controller.CalculadoraFinanceira;

public class Operacoes {
	
	/*
	 * Desenvolver a classe Operacoes no pacote controller para gerenciar as
	 * operações do sistema, incluindo adicionar transações, exibir extrato, saldo
	 * atual e média de despesas.
	 */
	
	private List<Receita> receitas = new ArrayList<>();
	private List<Despesa> despesas = new ArrayList<>();
	
	public void adicionarReceita(){
		
	}
	
	public void adicionarDespesas() {
		
	}
	
	public void exibirExtrato() {
		
	}
	
	public double getSaldoAtual() {
		return CalculadoraFinanceira.calularSaldoAtual(receitas, despesas);
		
	}
	
	public double getMediaDespesas() {
		return CalculadoraFinanceira.calcularMediaDespesas(despesas);
		
	}

	public void adicionarDespesa(Despesa despesa) {
		// TODO Auto-generated method stub
		
	}
}
