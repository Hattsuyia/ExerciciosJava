package Capgemini;

/*A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int totalCarros =0;
		int carroAntigo = 0;
		double valorDesconto = 0;
		
		char repetir = 's';
		while ((repetir == 's') ||(repetir=='S')) {
		
		System.out.print("Digite o valor do veiculo: ");
		double valorVeiculo = sc.nextDouble();
		
		System.out.print("Digite o ano do veiculo: ");
		int anoVeiculo = sc.nextInt();
		
		if (anoVeiculo <= 2000) {
			valorDesconto = 0.12;
			carroAntigo++;
		}
		else {
			valorDesconto = 0.07;
		}
		
		totalCarros++;
		
		double desconto = valorVeiculo*valorDesconto;
		double valorFinal = valorVeiculo-desconto;
		
		System.out.println("O valor do desconto foi de: " + String.format("%.2f", desconto));
		System.out.println("O valor final é de: " + String.format("%.2f", valorFinal));
		
		System.out.println("Gostaria de continuar? S ou N");
		repetir = sc.next().charAt(0);
		
		}
		
		System.out.println("Total de carros até ano 2000 foi de: " + carroAntigo);
		System.out.println("Total de carros foi de: " + totalCarros);
		
		sc.close();
	}
}
