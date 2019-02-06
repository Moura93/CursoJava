package exemplos;
import java.util.Scanner;
/*Faça um programa que receba a idade de dez pessoas e que calcule e mostre a quantidade 
 * de pessoas com idade maior ou igual a 18anos
 */
public class Ex2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for(int i=0 ; i < 10; i++) {
			System.out.println("Digite a idade da pessoa "+i+": ");
			idades[i] = input.nextInt();
		}
		
		for(int i=0 ; i < 10; i++) {
			if(idades[i]>=18) {
				System.out.println("A pessoa "+i+" é maior de 18anos e tem: "+idades[i]+"anos");	
			}
		}
	}
}
