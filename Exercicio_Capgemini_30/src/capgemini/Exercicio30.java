package capgemini;

import java.util.Scanner;

//Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;

public class Exercicio30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int maior = 0;
		int meio = 0;
		int menor = 0;
		
		if ((num1>num2) && (num1 > num3) && (num2>num3)){
			maior = num1;
			meio = num2;
			menor = num3;
		} else if ((num1>num2)&& (num1<num3) && (num3>num2)) {
			maior = num3;
			meio = num1;
			menor = num2;
		} else if ((num1<num3) && (num2>num3) && (num2>num1)) {
			maior = num2;
			meio = num3;
			menor = num1;
		} else if ((num2>num1) && (num2>num3) && (num1>num3)) {
			maior = num2;
			meio = num1;
			menor = num3;
		} else if ((num3>num1) && (num3>num2) && (num2>num1)) {
			maior = num3;
			meio = num2;
			menor = num1;
		} else {
			maior = num1;
			meio = num3;
			menor = num2;
		}
		
		System.out.println(menor+" " + meio+ " " + maior);
		
		sc.close();

	}

}
