package exemplos;
import java.util.Scanner;
/* Uma série de 20 valores reais, fazer um algoritmo que calcule e escreva a média aritmética destes valores
 * se a média obtida for maior que 8, deverá ser atribuida 10 para a média
 */
public class Ex1 {

	public static void main(String[] args) {
		int ini;
		int[] serie = new int[20];
		int soma = 0;
		double media = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro valor da série: ");
		ini = input.nextInt();
		
		for(int i = 0; i < 20; i++) {
			serie[i] = ini++; 
			soma = serie[i] + soma;
		}
		
		media = soma/20;
		if(media>8) {
			System.out.println("A média é acima de 8, seu valor é: " + 10);
		}
		else {
			System.out.println("A média é abaixo de 8, seu valor é: " + media);
		}
		
		
	}
}
