/*
Autor: Felipe Moura
Data: 24/01/2019
CAIXA ELETRÔNIO
*/

import java.util.Scanner;
public class Aula22 {
	
	public static void main(String[] args) throws InterruptedException{
		
		Scanner input = new Scanner(System.in);
		while(true) { 

			System.out.println("\nOpções:");
			System.out.println("1. cadastro");
			System.out.println("2. exclusão");
			System.out.println("3. transferência");
			System.out.println("4. depósito");
			System.out.println("5. saque");

			System.out.print("\nDigite o número da sua opção: ");

			int opc = input.nextInt();
			switch(opc) {
				case 1:
					System.out.print("cadastro");
					
					break;
				case 2:
					System.out.print("exclusão");
					break;
				case 3:
					System.out.print("transferência");
					break;
				case 4:
					System.out.print("depósito");
					break;
				case 5:
					System.out.print("saque");
					break;
			}
			for(int i=3; i>0; i--) {
				System.out.print(".");
				Thread.sleep(1000);
			}
			

			
		}
/*		Conta c = new Conta(); {
			c.dono = "rodrigo";
			System.out.println(c.dono);
		}
*/		
	}
}
