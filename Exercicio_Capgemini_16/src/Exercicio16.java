import java.util.Locale;
import java.util.Scanner;

/*Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. 
Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), 
Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);*/

public class Exercicio16 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual aluno estará informando as notas? ");
		String nome = sc.nextLine();
		System.out.println("Informe as 3 notas do aluno");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
		double media = (nota1+nota2+nota3)/3;
		
		if (media >= 7) {
			System.out.println("O aluno " + nome + " foi aprovado com media "+ String.format("%.2f", media));
		}else if (media <= 5) {
			System.out.println("O aluno " + nome + " foi reprovado com media "+ String.format("%.2f", media));
		}else {
			System.out.println("O aluno " + nome + " ficou em recuperação com media "+ String.format("%.2f", media));
		}
		sc.close();
	}

}
