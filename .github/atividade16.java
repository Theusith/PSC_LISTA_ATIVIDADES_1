/*Faça um programa que receba de entrada a distância total (em km) percorrida por um automóvel e a quantidade de
combustível (em litros) consumida para percorrê-la, calcule e imprima o consumo médio de combustível. Fórmula: distância/litro.*/
import java.util.Scanner;

public class atividade16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int distanciaTotal, litrosConsumidos;
		double consumoMedio;
		
		System.out.println("Qual doi a distancia percorrida? ");
		distanciaTotal = sc.nextInt();
		
		System.out.println("Quantos litros foram gastos? ");
		litrosConsumidos = sc.nextInt();
		
		consumoMedio = distanciaTotal / litrosConsumidos;
		
		System.out.println("O conumo médio de combustivel foi de "+ consumoMedio + "Lts.");
		

	}

}
