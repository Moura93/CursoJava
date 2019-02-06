package exemplos;

import java.util.Scanner;

/*Faça um algoritmo para ler a base e a altura de um triângulo. Em seguida, escreva a área do mesmo.
 *OBS: Área = (Base*Altura)/2
 */
public class Ex3 {


	public static void main(String[] args) {
		
		System.out.println(areas(4,4,4));
		//Se entrar com 3 parametros vai para área do trapezio
		//Se entrar com 2 parametros vai para a área do triangulo
	}
	
	//ÁREA DO TRIANGULO
	public static double areas(int base1, int altura) {		
		double area = (base1*altura)/2;
		//System.out.println(area);
		return area;
	}
	
	//ÁREA DO TRAPEZIO
	public static double areas(int base1, int base2, int altura) {		
		double area = ((base1+base2)*altura)/2;
		//System.out.println(area);
		return area;
	}
}
