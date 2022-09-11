package Capgemini;

import java.util.Locale;
import java.util.Scanner;

/*Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. 
Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
Informe o valor de custo de cada produto, o valor de venda de cada produto, a 
média de preço de custo e do preço de venda;*/

public class Exercicio22 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos produtos ira avaliar ");
		int n = sc.nextInt();
		
		double mediaCusto = 0;
		double custoTotal = 0;
		double mediaVenda = 0;
		double vendaTotal = 0;
		
		for (int i =1; i<=n;i++) {
			
			System.out.print("Qual o "+i+"o produto? ");
			sc.nextLine();
			String produto = sc.nextLine();
			System.out.print("Informe o preco de custo: ");
			double precoCusto = sc.nextDouble();
			System.out.print("Informe o preco de venda: ");
			double precoVenda = sc.nextDouble();
			
			double resultado = precoVenda - precoCusto;
			
			System.out.println();
			
			System.out.println("O produto "+ produto);
			
			if (resultado > 0) {
				System.out.println("Houve lucro na negociação " + resultado);
			}
			else if (resultado ==0 ) {
				System.out.println("Não houve lucro nem prejuizo ");
			}
			else {
				System.out.println("Teve prejuizo " + resultado);
			}
			
			custoTotal = custoTotal+precoCusto;
			vendaTotal = vendaTotal+precoVenda;
		}
		
		mediaCusto = custoTotal/n;
		mediaVenda = vendaTotal/n;
		Double resultadoFinal = mediaVenda - mediaCusto; 
		
		System.out.println();
		System.out.printf("Custo Total medio: %.2f%n R$ ", mediaCusto);
		System.out.printf("Venda Total media: %.2f%n R$ ", mediaVenda);
		
		if (resultadoFinal > 0) {
			System.out.println("As operações obtiveram lucro de: R$ " + String.format("%.2f", resultadoFinal));
		}
		else {
			System.out.println("Você teve prejuizo: R$ " + String.format("%.2f", resultadoFinal));
		}
		
		sc.close();
	}

}
