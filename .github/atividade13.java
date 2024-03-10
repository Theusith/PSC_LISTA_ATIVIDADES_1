/* Escreva um programa que calcula o salário líquido de um funcionário.
 * O programa deve solicitar o valor da hora de trabalho, o 
 * número de horas trabalhadas no mês e o percentual de desconto do INSS */

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o percentual de desconto do INSS (ex: 10 para 10%): ");
        double percentualInss = sc.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        double descontoInss = salarioBruto * (percentualInss / 100);

        double salarioLiquido = salarioBruto - descontoInss;

        System.out.println("\nSalário Bruto: R$" + salarioBruto);
        System.out.println("Desconto do INSS: R$" + descontoInss);
        System.out.println("Salário Líquido: R$" + salarioLiquido);

        sc.close();
	}

}
