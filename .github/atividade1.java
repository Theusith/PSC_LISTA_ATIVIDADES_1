import java.util.Scanner;
/*Crie um programa que solicita ao usuário dois números e, em seguida, mostra a soma desses números.*/

//Atividade 1:
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
	    int num1, num2, soma;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o primeiro numero:");
	    num1 = sc.nextInt();
	    System.out.println("Escreva o segundo numero:");
	    num2 = sc.nextInt();
	    soma = num1+num2;
	    System.out.println("A soma dos numeros é:" + soma);
	    sc.close();
		// TODO Auto-generated method stub

	}

}
