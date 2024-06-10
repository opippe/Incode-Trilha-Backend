package desafios;

import java.util.Scanner;

public class DesafioVizinhos {
	/* Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
	antecessor e seu sucessor.*/
	public static void main(String[] args) {
		Scanner desafioVizinhos = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int num = desafioVizinhos.nextInt();
		System.out.println("O antecessor de " + num + " é " + (num - 1) + ", e o seu sucessor é " + (num + 1));
	}
}