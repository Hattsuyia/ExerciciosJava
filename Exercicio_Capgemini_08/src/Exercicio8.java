import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Transformador Dolares em Reais");
		System.out.println("Qual a cotação do dolar atual? ");
		double cotacao = sc.nextDouble();
		System.out.println("Digite a quantidade de Dolares para conversão");
		double dolar = sc.nextDouble();
		
		double reais = cotacao*dolar;
		
		System.out.println("A quantidade de reais disponivel é de: R$ "+ String.format("%.2f", reais));
		
		sc.close();
	}

}
