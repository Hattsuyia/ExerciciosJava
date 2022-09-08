import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual valor total das compras? ");
		double compras = sc.nextDouble();
		
		System.out.println("Em quantas vezes deseja parcelar? ");
		int qtdparcelas = sc.nextInt();
		
		double parcelas = compras/qtdparcelas;
		
		for (int i = 1; i<=qtdparcelas;i++) {
			System.out.println("O valor da "+i+ "a parcela é de R$ " + String.format("%.2f", parcelas));
		}
		
		sc.close();
	}

}
