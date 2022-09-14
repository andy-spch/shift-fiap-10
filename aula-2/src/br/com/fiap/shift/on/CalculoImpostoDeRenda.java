package br.com.fiap.shift.on;

import java.util.Scanner;

public class CalculoImpostoDeRenda {
	public static void main(String[] args) {
		System.out.println("CALCULO DO IMPOSTO DE RENDA");
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe seu salario: ");
		double salario = 0;
		if (leitor.hasNextDouble()) {
			salario = leitor.nextDouble();
		}
		double resultado = 0;
		leitor.close();
		
		if (salario <= 1903.98) {
			System.out.println("Voce esta na faixa isenta de imposto de renda");
		} else if (1903.99 <= salario && salario <= 2826.65) {
			System.out.println("de R$ 1.903,99 a R$ 2.826,65 - 7,5% - Dedução de R$ 142,80");
			resultado = salario * 0.075 - 142.80;
		} else if (2826.66 <= salario && salario <= 3751.05) {
			System.out.println("de R$ 2.826,66 a R$ 3.751,05 - 15% - Dedução de R$ 354,80");
			resultado = salario * 0.15 - 354.80;
		} else if (3751.06 <= salario && salario <= 4664.68) {
			System.out.println("de R$ 3.751,06 a R$ 4.664,68 - 22,5% - Dedução de R$ 636,13");
			resultado = salario * 0.225 - 636.13;
		} else {
			System.out.println("Aliquota máxima acima de R$ 4.664,68 - 27,5% -  Dedução de R$ 869,36 ");
			resultado = salario * 0.275 - 869.36;
		}
		while (salario > 1903.98 || salario <= 4664.68) {
			System.out.printf("Com o seu salario de R$%2.2f, pagara o valor de R$%2.2f, de imposto de renda." , salario, resultado);
			break;
		}	
	}
}
