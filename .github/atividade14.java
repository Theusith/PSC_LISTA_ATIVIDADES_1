/*Desenvolva um programa que, dados dois valores A e B, troque os valores de forma que A passe a ter o valor de B e vice-versa. Exiba os valores após a troca.*/

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		int valor1, valor2, troca;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor:");
		valor2 = sc.nextInt();
		
		troca = valor1;
		valor1 = valor2;
		valor2 = troca;
		
		System.out.printf("Primeiro valor: %d\nSegundo valor: %d", valor1, valor2);
			
	}

}
