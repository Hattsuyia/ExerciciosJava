import java.util.Locale;
import java.util.Scanner;

/*Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;*/

public class Exercicio13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero qualquer: ");
		double N = sc.nextDouble();
		
		if (N>10) {
			System.out.println("Esse numero é maior do que 10.");
		} 
		else if (N==10){
			System.out.println("Este numero é o numero 10.");
		} 
		else {
			System.out.println("Este numero é menor do que 10.");
		}
		sc.close();
	}
}
