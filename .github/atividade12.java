/* Escreva um algoritmo para ler um 
valor e escrever o seu antecessor e o seu sucessor. */

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		int numero, sucessor, antecessor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		numero = sc.nextInt();
		sucessor = numero + 1;
		antecessor = numero - 1;
		
		System.out.printf("O sucessor de %d é %d, e o antecessor de %d é %d", numero, sucessor, numero, antecessor);
	}
}
