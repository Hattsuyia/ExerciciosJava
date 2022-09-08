import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 numeros");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int auxiliar = 0;
		
		auxiliar = A;
		A = B;
		B = auxiliar;
		
		System.out.println(A + " " + B);
		
		sc.close();
	}

}
