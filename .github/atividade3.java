import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		String nome;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o seu nome:");
		nome = sc.nextLine();
		System.out.println("Saudações, "+ nome + "!");
		sc.close();

	}

}
