package aula3;
public class Pessoa {

	private String nome;
	private int cpf;
	private int identidade;
	private String sexo;
	private int idade;
	private Endereco endereco;

	Pessoa() {
	}

	Pessoa(String nome, int cpf, int identidade, String sexo, int idade, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.identidade = identidade;
		this.sexo = sexo;
		this.idade = idade;
		this.endereco = endereco;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public int getcpf() {
		return cpf;
	}

	public void setcpf(int cpf) {
		this.cpf = cpf;
	}

	public int getidentidade() {
		return identidade;
	}

	public void setidentidade(int identidade) {
		this.identidade = identidade;
	}

	public String getsexo() {
		return sexo;
	}

	public void setsexo(String sexo) {
		this.sexo = sexo;
	}

	public int getidade() {
		return idade;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
