package desafios;

import java.util.Scanner;

public class DesafioReajuste {
	/* Informar um saldo e imprimir o saldo com reajuste de 1%. */
	public static void main(String[] args) {
		Scanner desafioReajuste = new Scanner(System.in);
		
		System.out.println("Informe o saldo:");
		double saldo = desafioReajuste.nextDouble();
		
		double saldoReajustado = saldo + (saldo*0.01);
		System.out.println("Saldo com reajuste de 1%: " + saldoReajustado);
	}
}
