import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma temperatura em Celsius: ");
		double tempC = sc.nextDouble();
		
		double fah = (9*tempC+160)/5;
		
		System.out.print("A temperatura convertida em Fahrenheit é: " + fah);
		
		sc.close();
	}

}
