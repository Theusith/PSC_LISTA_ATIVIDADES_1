/* 10.	Faça um programa que converta a temperatura dada em 
Fahrenheit para Celsius.  Para testar se a 
sua resposta está correta saiba que 100ºC = 212F. Considere C/5 = (F-32)/9
*/
import java.util.Scanner;

public class Atividade10 {
	public static void main(String[] args) {
        double fahrenheit = 212.0; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a temperatuda em Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        
        double celsius = (fahrenheit - 32) / (9 * 5);
 
        System.out.printf("%.2f Fahrenheit são %.2f graus Celsius",fahrenheit , celsius);
		
		sc.close();
		
	}

}
