package Capgemini;

import java.util.Locale;
import java.util.Scanner;

/*Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
com os seguintes critérios:
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d. 10% para os demais funcionários.
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa
vai aumentar sua folha de pagamento;*/

public class Exercicio28 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double reajuste = 0;
		double salarioAtualizado = 0;
		double valorReajuste = 0;
		double custoFolha = 0;
		
		System.out.print("Quantos funcionarios irão ter salario reajustados: ");
		int n = sc.nextInt();
		System.out.println("Qual salario minimo vigente? ");
		double salarioMinimo = sc.nextDouble();
		
		for (int i =0; i<n;i++) {
			
			sc.nextLine();
			System.out.println("Qual nome do colaborador? ");
			String nome = sc.nextLine();
			System.out.println("Qual salario atual? ");
			double salarioAtual = sc.nextDouble();
			
			if ((salarioAtual/salarioMinimo) <3) {
				reajuste = 0.5;
			} else if ((salarioAtual/salarioMinimo) <=10) {
				reajuste = 0.2;
			} else if ((salarioAtual/salarioMinimo) <=20) {
				reajuste = 0.15;
			} else {
				reajuste = 0.10;
			}
			
			valorReajuste = salarioAtual*reajuste;
			salarioAtualizado = salarioAtual+valorReajuste;
			
			System.out.println("Colaborador: " + nome);
			System.out.println("Valor do reajuste salarial: R$ "+valorReajuste);
			System.out.println("Salario atualizado: R$ "+salarioAtualizado);
			System.out.println();
			
			custoFolha += (salarioAtualizado - salarioAtual);
		}
			sc.close();
		
			System.out.println("Aumento na folha de pagamento de R$ "+custoFolha);
	}

}
