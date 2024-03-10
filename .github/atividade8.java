/*Escreva um programa que converte uma quantidade de metros para centímetros.*/
import java.util.Scanner;

public class Atividade8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int metros, centimetros;
		System.out.println("Escreva a quantidade em metros:");
		metros = sc.nextInt();
		centimetros = metros * 100;
		System.out.println(metros + " metros em centimetros são " + centimetros + " centimetros");
		sc.close();
	}

}
