import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
(inclusive);*/

public class Exercicio17 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Quantos numeros deseja digitar? ");
		int n = sc.nextInt();
		
		int soma = 0;
		
		System.out.println("Digite a quantidade de numeros solicitada ");
		
		for (int i = 1; i<=n;i++) {
			int numero = rand.nextInt(1000);
			System.out.println("Numero "+i+":"+numero);
			
			if ((numero >=10) && (numero <=150)){
				soma +=1;
			}
		}
		
		System.out.println("A quantidade de numeros entre 10 e 150 é "+soma);
		
		sc.close();
	}

}
