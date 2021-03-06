
public abstract class Conta {

	private int numero;
	private double saldo;
	private double limite;
	private String tipo;

	Conta() {
	}

	Conta(int numero, double saldo, double limite, String tipo) {
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
	
	public double getsaldo() {
		return saldo;
	}
	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getlimite() {
		return limite;
	}
	public void setlimite(double limite) {
		this.limite = limite;
	}

	public String gettipo() {
		return tipo;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}

}
