package projeto;

/*
 * DOENÇA
 * MÉDICO
 * ENFERMEIRO
 */
public class Paciente extends Pessoa {
	String doenca;
	String medico;
	String enfermeiro;

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(String enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	Paciente() {

	}

	public Paciente(String nome, long cpf, int idade, char sexo, String doenca, String medico, String enfermeiro) {
		super(nome, cpf, idade, sexo);
		this.doenca = doenca;
		this.medico = medico;
		this.enfermeiro = enfermeiro;
	}
}
