package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Despesa;
import model.Receita;

public class Menu {

	/*
	 * Criar a classe Menu no pacote controller para exibir um menu de opções para o
	 * usuário, permitindo adicionar receitas, adicionar despesas, exibir extrato,
	 * saldo atual, média de despesas e sair do sistema.
	 */
	Scanner scan = new Scanner(System.in);
	Operacoes operacoes = new Operacoes();

	public void exibirMenu() {
		// TODO Auto-generated method stub
		while (true) {

			System.out.println("\nMenu:");
			System.out.println("1. Adicionar Receita");
			System.out.println("2. Adicionar Despesa");
			System.out.println("3. Exibir Extrato");
			System.out.println("4. Exibir Saldo Atual");
			System.out.println("5. Exibir Média de Despesas");
			System.out.println("6. Sair");
			System.out.print("Escolha uma opção: ");
		}

	}

	private int obterOpcoes() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				return scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, insira um número.");
				scan.next(); // Limpa o buffer
			}
		}
	}

	private void adicionarReceita() {
		// TODO Auto-generated method stub

	}

	private void adicionarDespesa() {
		// TODO Auto-generated method stub

	}

	private void ObterValor() {
		// TODO Auto-generated method stub

	}

	private void obterDescricao() {

	}

}