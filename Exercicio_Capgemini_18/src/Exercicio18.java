import java.util.Random;

/*Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;*/

public class Exercicio18 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		for (int i=1;i<=75;i++) {
			int num = rand.nextInt(100);
			System.out.println("idade da " +i+"a pessoa:"+ num);
			if (num >=18) {
				System.out.println("Maior de idade");
			} else {
				System.out.println("Menor de idade");
			}
		}
	}
}
