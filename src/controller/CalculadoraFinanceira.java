package controller;

import java.util.List;

import model.Despesa;
import model.Receita;

public class CalculadoraFinanceira {

	// atibutos e metodo estatico
	/*
	 * Implementar a classe CalculadoraFinanceira no pacote controller, contendo
	 * métodos estáticos para calcular o saldo atual e a média de despesas.
	 */

	public static double calularSaldoAtual(List<Receita> receitas, List<Despesa> despesas) {
		double totalReceitas = receitas.stream().mapToDouble(Receita::getValor).sum();
		double totalDespesas = despesas.stream().mapToDouble(Despesa::getValor).sum();
		return totalReceitas - totalDespesas;

	}

	public static double calcularMediaDespesas(List<Despesa> despesas) {
		
		return despesas.stream().mapToDouble(Despesa::getValor).average().orElse(0);
		
	}
}
