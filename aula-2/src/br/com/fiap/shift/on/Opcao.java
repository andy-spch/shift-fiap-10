package br.com.fiap.shift.on;

import java.util.Scanner;

public class Opcao {  // public de poder ser utilizada por todos. E class para uma indicar a criação de uma classe.
	public static void main(String[] args) {  // novamente publico, static que não é mutavel. Void pois não retorna nada. Main que recebe um conjunto de argumentos.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("+++++++++++++++++ BEM VINDO AO SISTEMA!! +++++++++++++++++\n\n");
		System.out.println("Digite a opcao desejada:\n");
		System.out.println("[ 1 ] Consultar Saldo");
		System.out.println("[ 2 ] Sacar da Conta Corrente");
		System.out.println("[ 3 ] Sacar do Cartão de Credito");
		System.out.println("[ 4 ] Seguro Residencial");
		System.out.println("[ 5 ] Seguro do Veiculo");
		System.out.println("[ 6 ] Titulo de Captalizacao");
		System.out.println("[ 7 ] Investimentos");
		
		int opcao = sc.nextInt();
		
		if (opcao == 1) {
			System.out.println("Consultando saldo");
		} else if (opcao == 2) {
			System.out.println("Realizando saque da conta corrente");
		} else if (opcao == 3) {
			System.out.println("Realizando saque do cartão de credito");
		} else if (opcao == 4) {
			System.out.println("Cadastrando Seguro Residencial");
		} else if (opcao == 5) {
			System.out.println("Cadastrando seguro do veiculo");
		} else if (opcao == 6) {
			System.out.println("Cadastrando Titulo de Captalizacao");
		} else if (opcao == 7) {
			System.out.println("Realizando investimento");
		} else {
			System.out.println("Opcao invalida!");
		}
		
		sc.close();
		
	}
}
