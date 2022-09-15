package Capgemini;


/*Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior 
que 80, menor que 25 ou igual a 40;*/

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		if ((num>80) || (num<25) || (num==40)){
			System.out.println("Você é o cara!!!");
		}
		else {
			System.out.println("Você não é o cara!!!");
		}
		
		sc.close();
	}

}
