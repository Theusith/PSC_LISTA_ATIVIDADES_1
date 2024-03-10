/*Crie um algoritmo que leia a idade de uma pessoa e calcule quantos dias essa pessoa já viveu*/

import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {
		int idade, ano =365, tempoTotal;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a sua idade?");
		idade = sc.nextInt();
		tempoTotal = idade * ano;
		System.out.println("Você ja viveu "+ tempoTotal + " dias.");
		sc.close();

	}

}
