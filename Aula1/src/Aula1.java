import java.util.Scanner;

/*
Autor: Felipe Moura
Data: 22/01/2019
*/
public class Aula1 {

	public static void main(String[] args) {

			//ENTRADA DE VALORES
		Scanner sc  = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double n2 = sc.nextDouble();
		
			//OPERAÇÃOES
		double s = n1 + n2;
		double m = n1*n2;
		
			//SOMA = MULTIPLICAÇÃO?
		if(s==m) {
			System.out.println("A soma é igual a multiplicação");
		}
		else {
			System.out.println("A soma é diferente da multiplicação");
		}
		
			//TELA
		System.out.println("Soma: " + s);	
		System.out.println("Multiplicação: " + m);

	}

}
