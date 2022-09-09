import java.util.Locale;
import java.util.Scanner;

//Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;

public class Execicio14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		if (num1>num2) {
			System.out.println("O maior numero é: " + num1);
		} else {
			System.out.println("O maior numero é: " + num2);
		}
		
		sc.close();
	}

}
