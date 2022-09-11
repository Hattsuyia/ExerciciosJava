import java.util.Random;

/*Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
mulher. No final informe total de homens e de mulheres;*/

public class Exercicio19 {

	public static void main(String[] args) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String sexo = "HM";
		String randomString ="";
		Random rand = new Random();
		
		int homem = 0, mulher = 0;
		int randInt;
		char randomSex = 0;
		int tamanho = 5;
		int index = -1;
		
		for (int j=0; j<56; j++) {
			randomString = "";
			for (int i =0; i<tamanho;i++) {
				
				index = rand.nextInt(alphabet.length());
				randomString += alphabet.substring(index, index+1);
				
				}
				
		randInt = rand.nextInt(sexo.length());
		randomSex = sexo.charAt(randInt);
		
		System.out.println("Digite o nome da pessoa: " + randomString);
		System.out.println("Sexo: " + randomSex);
	    
		if (randomSex == 'M') {
			homem++;
		}else {
			mulher++;
			}
		}
		
		System.out.println("Qtd homens: "+ homem);
		System.out.println("Qtd mulheres: "+ mulher);
	}
}