import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		double raio, area, pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio do círculo que se deseja a área: ");
		raio = sc.nextDouble();
		area = pi * (raio*2);
		System.out.printf("O valor da área do circulo é de %.2f", area);
		sc.close();
	}

}
