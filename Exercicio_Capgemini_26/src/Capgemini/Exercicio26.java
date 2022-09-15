package Capgemini;

import java.util.Scanner;

/*Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. 
Caso o usuário digite um número que não esteja neste intervalo, 
exibir a seguinte mensagem: número inválido;*/

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero de 1 a 5");
		int num = sc.nextInt();
		
		switch (num) {
		
		case 1: 
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Três");
			break;
		case 4:
			System.out.println("Quatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		default:
			System.out.println("Número inválido. Digite um numero válido de 1 a 5");
		}
		
		System.out.println("Concluido!!");
		sc.close();
		}
	}
