import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
	
/*O custo de um carro novo ao consumidoré a soma do custo de fábrica mais o percentual do distribuidor e
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
mesmo;*/
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual custo de fabrica do automóvel? ");
		double precoCusto = sc.nextDouble();
		
		double custoConsumidor = ((precoCusto*(1+0.28))*(1+0.45));
		
		System.out.printf("O custo para o consumidor é de R$ %.2f", custoConsumidor);
		
		sc.close();
	}

}
