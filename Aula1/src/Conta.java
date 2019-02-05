/*
Autor: Felipe Moura
Data: 24/01/2019
*/
public class Conta{
		private String dono;
		private double saldo;
		private double limite;
		
		
		public static void cadastro(String nome, int cpf, double saldo) {
			int quantDEcontas = 0;
			int numeroDAconta = quantDEcontas + 1;
			System.out.println("Número da Conta: " + numeroDAconta);
			System.out.println("Nome: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("Saldo: " + saldo);
			double limite;
			limite = ((saldo*1.5)/500) - ((saldo*1.5)%500) + 1; 
			System.out.println("Limite: " + limite);
		}
		void depositar(){
		}
		void saca(){
		}
		void imprimeExtrato(){
		}
}
