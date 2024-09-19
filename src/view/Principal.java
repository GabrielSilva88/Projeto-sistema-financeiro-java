package view;
	
import controller.Menu;
import java.util.Scanner;

import controller.Operacoes;
import model.Despesa;
import model.Receita;

public class Principal {
	/*
	 * Implementar a classe Principal no pacote view com o método main para iniciar
	 * o sistema e permitir interação com o usuário através do menu.
	 */
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		
		menu.exibirMenu();
	}
}

/*
Scanner scan = new Scanner(System.in);

Despesa d = new Despesa("miguel", 123.123);
Receita r = new Receita("Miguel", 120.00);
Operacoes o = new Operacoes();


d.setTitular("Miguel");
r.setTitular("Gabriel");
r.getTitular();
o.acessar("Gabriel", "gbm123@");

System.out.println("Projeto Sistema Financeiro.\nDigite seu Usuário:");
String user = scan.nextLine();

System.out.println("Digite sua senha: ");
String pass = scan.nextLine();
*/
