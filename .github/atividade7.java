import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		double salario, salarioReajustado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva seu salário:");
		salario = sc.nextDouble();
		salarioReajustado = salario + (salario * 0.07);
		System.out.println("O novo salário será:" + salarioReajustado);
		sc.close();
		
	
	}

}
