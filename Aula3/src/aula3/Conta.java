package aula3;

public class Conta {

	private int numero;
	private int saldo;
	private int limite;
	private String tipo;

	Conta() {
	}

	Conta(int numero, int saldo, int limite, String tipo) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.tipo = tipo;
	}

	public int getnumero() {
		return numero;
	}

	public void setnumero(int numero) {
		this.numero = numero;
	}

	public int getsaldo() {
		return saldo;
	}

	public void setsaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getlimite() {
		return limite;
	}

	public void setlimite(int limite) {
		this.limite = limite;
	}

	public String gettipo() {
		return tipo;
	}

	public void settipo(String tipo) {
		this.tipo = tipo;
	}

}
