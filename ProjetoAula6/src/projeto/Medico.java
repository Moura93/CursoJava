package projeto;

/*
 * CRM
 * ESPECIALIDADE
 */
public class Medico extends Empregado {

	public long crm;
	public String especialidade;

	public long getCrm() {
		return crm;
	}

	public void setCrm(long crm) {
		this.crm = crm;
	}

	Medico() {

	}

	public Medico(String nome, long cpf, int idade, char sexo, long pis, int matricula, long crm,
			String especialidade) {
		super(nome, cpf, idade, sexo, pis, matricula);
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
