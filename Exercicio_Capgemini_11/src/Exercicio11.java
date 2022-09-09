import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual preço de custo do produto? ");
		double precoCusto = sc.nextDouble();
		
		System.out.print("Qual percentual de lucro? ");
		double percentualLucro = sc.nextDouble();
		
		double precoVenda = precoCusto*(1+percentualLucro/100);
		
		System.out.printf("Seu preço de venda deve ser %.2f ", precoVenda);
		
		sc.close();
		
	}

}
