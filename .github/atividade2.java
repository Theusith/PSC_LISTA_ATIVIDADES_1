/*Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles.*/
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		float resto;
		
		System.out.println("Escreva o primeiro numero:");
		num1 = sc.nextInt();
		System.out.println("Escreva o segundo numero:");
		num2 = sc.nextInt();
		resto = num1 % num2;
		System.out.println("o Resto da davisão dos dois numeros é:" + resto);
		sc.close();
	}

}
