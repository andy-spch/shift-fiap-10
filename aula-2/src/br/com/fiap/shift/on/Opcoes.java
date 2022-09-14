package br.com.fiap.shift.on;

import java.util.Scanner;

public class Opcoes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("+++++++++++++++++ BEM VINDO AO SISTEMA MAIS LIMPO COM SWITCH CASE!! +++++++++++++++++\n\n");
		System.out.println("Digite a opcao desejada:\n");
		System.out.println("[ 1 ] Consultar Saldo");
		System.out.println("[ 2 ] Sacar da Conta Corrente");
		System.out.println("[ 3 ] Sacar do Cartão de Credito");
		System.out.println("[ 4 ] Seguro Residencial");
		System.out.println("[ 5 ] Seguro do Veiculo");
		System.out.println("[ 6 ] Titulo de Captalizacao");
		System.out.println("[ 7 ] Investimentos");
		
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Consultando Saldo");
			break;
		case 2:
			System.out.println("Realizando saque da conta corrente");
			break;
		case 3:
			System.out.println("Realizando saque do cartao de credito");
			break;
		case 4:
			System.out.println("Cadastrando Seguro Residencial");
			break;
		case 5:
			System.out.println("Cadastrando seguro do veiculo");
			break;
		case 6:
			System.out.println("Cadastrando Titulo de Captalizacao");
			break;
		case 7:
			System.out.println("Realizando investimento");
			break;
			default:
				System.out.println("Opcao Invalida");
		}
		sc.close();
	}
}
