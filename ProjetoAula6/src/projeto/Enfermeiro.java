package projeto;

/*
 * SETOR
 * CRE
 */
public class Enfermeiro extends Empregado {

	public String setor;
	public long cre;

	Enfermeiro() {

	}

	public Enfermeiro(String nome, long cpf, int idade, char sexo, long pis, int matricula, String setor, long cre) {
		super(nome, cpf, idade, sexo, pis, matricula);
		this.setor = setor;
		this.cre = cre;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public long getCre() {
		return cre;
	}

	public void setCre(long cre) {
		this.cre = cre;
	}

}
