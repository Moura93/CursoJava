package exemplos;
import java.util.Scanner;
/* Uma s�rie de 20 valores reais, fazer um algoritmo que calcule e escreva a m�dia aritm�tica destes valores
 * se a m�dia obtida for maior que 8, dever� ser atribuida 10 para a m�dia
 */
public class Ex1 {

	public static void main(String[] args) {
		int ini;
		int[] serie = new int[20];
		int soma = 0;
		double media = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro valor da s�rie: ");
		ini = input.nextInt();
		
		for(int i = 0; i < 20; i++) {
			serie[i] = ini++; 
			soma = serie[i] + soma;
		}
		
		media = soma/20;
		if(media>8) {
			System.out.println("A m�dia � acima de 8, seu valor �: " + 10);
		}
		else {
			System.out.println("A m�dia � abaixo de 8, seu valor �: " + media);
		}
		
		
	}
}
