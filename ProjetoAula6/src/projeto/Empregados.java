package projeto;

/*
 * PIS
 * MATRICULA
 * CONTA()	<- PERGUNTAR AO PROFESSOR COMO IMPLEMENTAR A CLASSE CONTA EM EMPREGADOS
 */
public class Empregados extends Pessoas {

	public long pis;
	public int matricula;

	Empregados() {

	}

	public Empregados(String nome, long cpf, int idade, char sexo, long pis, int matricula) {
		super(nome, cpf, idade, sexo);
		this.matricula = matricula;
		this.pis = pis;
	}

	public long getPis() {
		return pis;
	}

	public void setPis(long pis) {
		this.pis = pis;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
