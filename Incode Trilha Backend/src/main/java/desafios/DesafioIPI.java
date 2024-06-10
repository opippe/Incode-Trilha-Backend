package desafios;

import java.util.Scanner;

class Peca {
    int codigo;
    double valorUnitario;
    int quantidade;

    void addPeca(int c, double v, int q) {
        codigo = c;
        valorUnitario = v;
        quantidade = q;
    }
}

public class DesafioIPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a porcentagem do IPI: ");
        double ipi = scanner.nextDouble();

        Peca peca1 = new Peca();
        Peca peca2 = new Peca();

        System.out.println("Informe o código da peça 1: ");
        int codigo1 = scanner.nextInt();
        System.out.println("Informe o valor unitário da peça 1: ");
        double valorUnitario1 = scanner.nextDouble();
        System.out.println("Informe a quantidade da peça 1: ");
        int quantidade1 = scanner.nextInt();
        peca1.addPeca(codigo1, valorUnitario1, quantidade1);

        System.out.println("Informe o código da peça 2: ");
        int codigo2 = scanner.nextInt();
        System.out.println("Informe o valor unitário da peça 2: ");
        double valorUnitario2 = scanner.nextDouble();
        System.out.println("Informe a quantidade da peça 2: ");
        int quantidade2 = scanner.nextInt();
        peca2.addPeca(codigo2, valorUnitario2, quantidade2);

        double valorTotal = (peca1.valorUnitario * peca1.quantidade + peca2.valorUnitario * peca2.quantidade) * (ipi / 100 + 1);

        System.out.println("O valor total a ser pago é: " + valorTotal);
    }
}

