import java.util.Scanner;
/*
 Autor: Felipe Moura
 Data: 23/01/2019
 Indentificar de um n�mero � par ou impar
*/

public class Casa1 {

	public static void main(String[] args) {
		
		double num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		num = input.nextDouble();
		
		if(num%2 != 0){
			System.out.println("O n�mero � impar");
		}
		else {
			System.out.println("O n�mero � par");
		}
	}

}
