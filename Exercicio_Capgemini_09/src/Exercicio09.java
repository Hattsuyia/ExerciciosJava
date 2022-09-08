import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual valor do deposito? ");
		double deposito = sc.nextDouble();
		
		double juros = (deposito*0.07)+deposito;
		
		System.out.printf("O valor com rendimento é de %.2f", juros);
		
		sc.close();
	}

}
