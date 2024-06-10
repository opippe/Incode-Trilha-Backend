package desafios;

import java.util.Scanner;

public class DesafioSalarioMinimo {
	/* Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
	calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
	(1SM=R$788,00). */
	public static void main(String[] args) {
		Scanner desafioSalarioMinimo = new Scanner(System.in);
		System.out.println("Informe o valor do salário mínimo: ");
		int salarioMinimo = desafioSalarioMinimo.nextInt();
		System.out.println("Informe o valor so seu salário: ");
		int salario = desafioSalarioMinimo.nextInt();
		System.out.println("Você ganha " + (salario / salarioMinimo) + " salários mínimos.");
	}
}
