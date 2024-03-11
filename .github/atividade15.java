/*Construa um programa que calcule as raízes de uma equação de 2º grau (Ax2+Bx+C).
 *Sendo que os valores A,B e C são fornecidos pelo usuário. Considere que tem duas raízes*/
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a, b, c;
		double delta, raiz1, raiz2, rDelta;
		
		System.out.println("Digite o valor A:");
		a = sc.nextInt();
		System.out.println("Digite o valor B:");
		b =  sc.nextInt();
		System.out.println("Digite o valor C:");
		c = sc.nextInt();
		
		delta = (b * b) + (-4 * (a * c));
		
		raiz1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
    raiz2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
        
    System.out.println("Valor de delta: " + delta);
    System.out.println("Valor da primeira raiz: "+ raiz1);
    System.out.println("Valor da segunda raiz: "+ raiz2);    
	}

}
