package Capgemini;

import java.util.Locale;
import java.util.Scanner;

/*A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. 
 * Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. 
 * O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível 
 * álcool – 25% 
 * gasolina – 21% 
 * diesel –14% 
 * Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
 * clientes;*/

public class Exercicio27 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double desconto = 0;
		double valorVeiculoDesconto = 0;
		double totalDesconto = 0;
		double totalVendido = 0;
		double descontoDado =0;
		double totalVendidoDescontado = 0;
		
		System.out.println("Qual o valor do veiculo a ser adquirido? ");
		double valorVeiculo = sc.nextDouble();
		
		while (valorVeiculo !=0) {
		
			System.out.println("Qual tipo de combustivel? Alcool, Gasolina ou Diesel ");
			sc.nextLine();
			String combustivel = sc.nextLine();
			
			if (combustivel.equals("alcool")) {
				desconto = 0.25;
			}
			else if (combustivel.equals("gasolina")) {
				desconto = 0.21;
			} 
			else {
				desconto = 0.14;
			}
			
			totalDesconto = valorVeiculo*desconto;
			descontoDado += totalDesconto;
			valorVeiculoDesconto = valorVeiculo-(valorVeiculo*desconto);
			totalVendido += valorVeiculo;
			totalVendidoDescontado += valorVeiculoDesconto;
			
			System.out.println();
			System.out.println("O valor do desconto é de R$ "+ totalDesconto);
			System.out.println("O valor do automovel é de R$ "+ valorVeiculo);
			System.out.println("O valor a ser pago pelo cliente é de R$ "+valorVeiculoDesconto);
						
			System.out.println();
			System.out.println("Qual o valor do veiculo a ser adquirido? ");
			valorVeiculo = sc.nextDouble();
			
		}
			System.out.println("Total de desconto oferecido foi de R$ "+descontoDado);
			System.out.println("Total Vendido foi de R$ "+totalVendido);
			System.out.println("Valor pago pelos clientes: R$ "+totalVendidoDescontado);
			sc.close();
	}

}
