package desafios;

import java.util.Scanner;

public class DesafioIdade {
	/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
	mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
	(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */
	public static void main(String[] args) {
		Scanner idadeInput = new Scanner(System.in);
		System.out.println("Informe os anos: ");
		int idadeAnos = idadeInput.nextInt();
		System.out.println("Informe os meses: ");
		int idadeMeses = idadeInput.nextInt();
		System.out.println("Informe os dias: ");
		int idadeDias = idadeInput.nextInt();
		
		
		int idade = (idadeAnos*365) + (idadeMeses*30) + idadeDias;
		
		System.out.println("Idade em dias:" + idade);
	}
}
