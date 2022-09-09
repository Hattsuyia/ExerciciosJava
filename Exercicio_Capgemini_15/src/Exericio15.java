import java.util.Locale;
import java.util.Scanner;

//Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

public class Exericio15 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int N = sc.nextInt();
		
		if ((N >=100) && (N<= 200)) {
			System.out.println("O numero esta entre 100 e 200 ");
		} else {
				System.out.println("O numero não esta entre 100 e 200");
		}
			
		sc.close();

	}

}
