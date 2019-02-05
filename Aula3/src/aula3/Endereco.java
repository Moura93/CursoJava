package aula3;

public class Endereco {

	private String logadrouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String uf;
	private String complemento;

	Endereco() {
	}

	Endereco(String logadrouro, int numero, String bairro, String cidade, String uf, String complemento) {
		this.numero = numero;
		this.logadrouro = logadrouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.complemento = complemento;
	}

	public String getlogadrouro() {
		return logadrouro;
	}

	public void setlogadrouro(String logadrouro) {
		this.logadrouro = logadrouro;
	}

	public int getnumero() {
		return numero;
	}

	public void setnumero(int numero) {
		this.numero = numero;
	}

	public String getbairro() {
		return bairro;
	}

	public void setbairro(String bairro) {
		this.bairro = bairro;
	}

	public String getcidade() {
		return cidade;
	}

	public void setcidade(String cidade) {
		this.cidade = cidade;
	}

	public String getuf() {
		return uf;
	}

	public void setuf(String uf) {
		this.uf = uf;
	}

	public String getcomplemento() {
		return complemento;
	}

	public void setcomplemento(String complemento) {
		this.complemento = complemento;
	}

}
