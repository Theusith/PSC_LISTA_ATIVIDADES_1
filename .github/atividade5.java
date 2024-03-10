/*Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a cotação é US$ 1 = R$ 4,95*/

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double real =1.0 , dolar = 4.95, convertido;
		System.out.println("Escreva um valor em Dolar:");
		real = sc.nextDouble();
		convertido = real / dolar;
		System.out.printf("O valor em real é: R$%.2f", convertido);
		sc.close();

	}

}
