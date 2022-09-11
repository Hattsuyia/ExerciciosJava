import java.util.Scanner;

/*Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
ou não para cumprir o serviço militar obrigatório. Informe os totais;*/

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome = "";
		char sexo = ' ';
		int idade = 0;
		String saude = "";
		int candidatosAptos =0;
		int totalCandidatos=0;
		
		char repetir = 's';
		while ((repetir == 's') ||(repetir=='S')) {
		
		System.out.print("Informe seu nome: ");
		nome = sc.nextLine();
		System.out.print("Informe sua condição fisica boa ou ruim: ");
		saude = sc.nextLine();
		System.out.print("Informe seu sexo M ou F: ");
		sexo = sc.nextLine().charAt(0);
		System.out.print("Informe sua idade: ");
		idade = sc.nextInt();
		sc.nextLine();
				
		if ((sexo =='M') || (sexo == 'm')) {
			if ((idade >=18) && (idade<=45)) {
				if (saude.equals("boa")) {
					System.out.println("apto");
					candidatosAptos++;
				}
				else {
					System.out.println("Inapto, condição da saude "+ saude);
				}
			}
			else {
				System.out.println("Inapto idade fora da obrigatoriedade "+ idade);
			}
		} 
		else {
			System.out.println("Inapto, candidato do sexo Feminino");
		}
		
		totalCandidatos++;
		
		System.out.println("Deseja continuar? S ou N ");
		repetir = sc.next().charAt(0);
		sc.nextLine();
		
		}
		
		System.out.println("Total de Candidatos: "+ totalCandidatos);
		System.out.println("Total Candidatos aptos: "+ candidatosAptos);
		
		sc.close();
	}
}