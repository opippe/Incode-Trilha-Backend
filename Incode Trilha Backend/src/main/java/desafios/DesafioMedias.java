package desafios;

public class DesafioMedias {
	/* Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
		números 4, 5 e 6. A soma das duas médias. A média das médias. */
	public static void main(String[] args) {
		float media897 = (8+9+7)/3;
		System.out.println("Média dos números 8, 9 e 7: " + media897);
		float media456 = (4+5+6)/3;
		System.out.println("Média dos números 4, 5 e 6: " + media456);
		float somaMedias = media897 + media456;
		System.out.println("Soma das médias: " + somaMedias);
		System.out.println("Média das médias: " + (somaMedias/2));
	}
}
