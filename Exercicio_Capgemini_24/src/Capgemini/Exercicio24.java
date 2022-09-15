package Capgemini;

import java.util.Scanner;

/*Faça um algoritmo que receba “N” números e mostre 
 *positivo, negativo ou zero para cada número;*/

public class Exercicio24 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros quer digitar: ");
		int num = sc.nextInt();
		
		for (int i = 0; i<num;i++) {
			
			int numero = sc.nextInt();
			
			if (numero ==0) {
				System.out.println("O numero digitado é zero");
			} else if(numero >0 ) {
				System.out.println("Numero é positivo" + numero);
			}else {
				System.out.println("Numero é negativo" + numero);
			}
		}
		
		System.out.println("Concluido com sucesso!!!");
		
		sc.close();
	}

}
