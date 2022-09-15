package Capgemini;

import java.util.Scanner;

/*Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. 
 * Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais. 
 * Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes;
 */

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite dois numeros ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("Os numeros digitados são iguais");
		} else if (num1>num2) {
			System.out.println("Os numeros digitados são diferentes e o maior é " + num1);
		} else {
			System.out.println("Os numeros digitados são diferentes e o maior é " + num2);
		}
		
		sc.close();
	}

}
