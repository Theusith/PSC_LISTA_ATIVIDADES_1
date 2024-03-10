/* Crie um programa que calcula a média 
simples de três notas fornecidas pelo usuário. */

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		int num1, num2, num3;
		double mediaSimples;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Três numeros para "
				+ "ser feito a média! \nPrimeiro numero:");
		num1 = sc.nextInt();
		
		System.out.println("Segundo numero: ");
		num2 = sc.nextInt();
		
		System.out.println("Terceiro numero: ");
		num3 = sc.nextInt();
		
		mediaSimples = (num1 + num2 + num3)/3;
		System.out.printf("A média é: %.2f", mediaSimples);
		
		
		// TODO Auto-generated method stub

	}

}
