package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import java.util.Arrays;
public class pessoaPrincipal {

	private static Scanner scan;

	public static void main(String[] args) {

		int opcao = 0;
		Pessoa pessoa=new Pessoa();
		

		while (opcao != 5) {
			System.out.print("Seja Bem-Vindo ao Sistema de Cadastro de informações pessoais");
			System.out.println("/////////////////////////////////////////////////////");
			System.out.println("MENU PRINCIPAL");
			System.out.println("1 - Cadastrar Pessoa");
			System.out.println("2 - Consultar Dados de uma pessoa");
			System.out.println("3 -Remover Dados de uma pessoa");
			System.out.println("4 -Exibir todos os dados");
			System.out.println("5- Sair do Sistema");

			scan = new Scanner(System.in);
			System.out.println("Digite a opção desejada:  ");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				
				System.out.print("Insira o nome da Pessoa :    ");
				String this.nome = scan.next();
				System.out.print("Insira a Data de Nascimento  :     ");
				String dataNasc = scan.next();
				System.out.print("Insira a altura :    ");
				double altura = scan.nextDouble();
				System.out.print("Insira sua idade :    ");
				int idade = scan.nextInt();
				
				pessoa = new Pessoa();
				pessoa.add(pessoa);
				
				break;

			case 2:
				pessoa = new Pessoa();
				System.out.print("Insira o nome da Pessoa :    ");
				String pesquisa = scan.next();
				pessoa = pessoa.pesquisaPorNome(pesquisa);
				pessoa.exibirDados();
				break;
				
			}

		}

	}
}
