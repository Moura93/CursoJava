
public class ContaFisica extends Conta{
	
	private int cpf;

	
	public ContaFisica(int cpf, int numero, double saldo, double limite, String tipo){
		super(numero, saldo, limite, tipo);
		this.cpf = cpf;
	}
	
	public int getcpf() {
		return cpf;
	}

	public void setcpf(int cpf) {
		this.cpf = cpf;
	}
}