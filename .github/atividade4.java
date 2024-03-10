import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, endereco, telefone;
		System.out.println("Escreva seu nome:");
		nome = sc.nextLine();
		System.out.println("Escreva o seu endereço:");
		endereco = sc.nextLine();
		System.out.println("Escreva telefone:");
		telefone = sc.nextLine();
		System.out.println("Seu nome é:"+ nome);
		System.out.println("Endereço:"+ endereco);
		System.out.println("Telefone:"+ telefone);
		sc.close();
	}

}
