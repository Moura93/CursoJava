import java.util.Scanner;
/*
Autor: Felipe Moura
Data: 24/01/2019
Escolher a quantidade de vezes que o seu nome deve ser printado na tela
*/

public class Aula2 {

	public static void main(String[] args) {

		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a quantidade de vezes: ");
		num = input.nextInt();
		
		int i = num;
		while(i > 0) {
			System.out.println("Felipe Moura Wanderley: " + i);
			i--;
		}
	}

}
