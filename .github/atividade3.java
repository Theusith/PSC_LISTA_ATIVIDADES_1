/*Crie um algoritmo que leia o primeiro nome do usuário e escreva uma saudação para ele.*/
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
