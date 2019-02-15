package projeto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProgramaHospital {

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		int menu;
		int tipoDePessoa = 0;
		boolean sair = true;

		// VARIAVEIS PESSOA
		List<Pacientes> pacientess = new ArrayList<Pacientes>();
		String nome = null;
		long cpf = 0;
		int idade = 0;
		char sexo = ' ';
		// VARIAVEIS PACIENTE
		String doenca = null;
		String medico = null;
		String enfermeiro = null;
		// VARIAVEIS EMPREGADOS
		long pis = 0;
		int matricula = 0;
		// VARIAVEIS MEDICOS
		long crm = 0;
		String especialidade = null;
		// VAVEIS ENFERMEIRO
		String setor = null;
		long cre = 0;

		// CLASSES
		Pacientes paci = new Pacientes(nome, cpf, idade, sexo, doenca, medico, enfermeiro);
		Medicos med = new Medicos(nome, cpf, idade, sexo, pis, matricula, crm, especialidade);
		Enfermeiro enf = new Enfermeiro(nome, cpf, idade, sexo, pis, matricula, setor, cre);


		// pacientess.add(paci);

		// for (Pacientes p : pacientess) {
		// 	if(p.getNome().equalsIgnoreCase("jo�o")) {
		// 		System.out.println(p.getCpf());
		// 	}
		// }


		// PROGRAMA
		while (sair) {
			System.out.println("\nMENU:\n[1] - Cadastro\n[2] - Vizualizacao\n[3] - Apagar\n[4] - Sair");
			menu = var.nextInt();
			var.nextLine();
			switch (menu) {
			case 1: // CADASTRO
				System.out.println("Digite o nome da pessoa: ");
		
				nome = var.nextLine();
				System.out.println("Digite o CPF da pessoa: ");
				paci.setCpf(var.nextLong());
				System.out.println("Digite a idade da pessoa: ");
				paci.setIdade(var.nextInt());
				System.out.println("Digite o sexo da pessoa ('M' ou 'F'): ");
				paci.setSexo(var.next().charAt(0));
				System.out.println("\nTIPO:\n[1] - Paciente\n[2] - Medico\n[3] - Enfermeiro\n[4] - Sair");
				tipoDePessoa = var.nextInt();

				switch (tipoDePessoa) {
				case 1: // PACIENTE
					System.out.println("Qual doença o paciente apresenta? ");
					paci.setDoenca(var.next());
					System.out.println("Qual medico esta atendendo-o? ");
					paci.setMedico(var.next());
					System.out.println("Qual enfermeiro esta atendendo-o? ");
					paci.setEnfermeiro(var.next());
					pacientess.add(paci);
					break;
				case 2: // MÉDICOS
					System.out.println("Qual CRM do medico? ");
					med.setCrm(var.nextLong());
					System.out.println("Qual a especialidade do medico? ");
					med.setEspecialidade(var.next());
					pacientess.add(med);
					break;
				case 3: // ENFERMEIRO
					System.out.println("Qual CRE do enfermeiro? ");
					enf.setCre(var.nextLong());
					System.out.println("Qual o setor do enfermeiro? ");
					enf.setSetor(var.next());
					break;
				case 4: // SAIR
					break;
				}
				break;
			case 2: // VIZUALIZAÇÃO
				System.out.println("Quem você quer procurar?\n[1] - Paciente\n[2] - Medico\n[3] - Enfermeiro\n[4] - Sair");
				tipoDePessoa = var.nextInt();
				System.out.println("Digite o nome: ");
				String comp = var.nextLine();
				System.out.println("\nDADOS PESSOAIS:");
				for (Pacientes p : pacientess) {
					if(p.getNome().equalsIgnoreCase(comp)) {
						System.out.println("Nome: " + p.getNome());
						System.out.println("CPF: " + p.getCpf());
						System.out.println("Idade: " + p.getIdade());
						System.out.println("Sexo: " + p.getSexo());
					}
					else{
						System.out.println("!NOME NÃO ENCONTRADO!");
					}
				}
				switch (tipoDePessoa) {
				case 1: // VISUALIZAR DADOS DO PACIENTE
					System.out.println("\nDADOS DO PACIENTE:");
					System.out.println("Doença: " + paci.getDoenca());
					System.out.println("Medico: " + paci.getMedico());
					System.out.println("Enfermeiro: " + paci.getEnfermeiro());
					break;
				case 2: // VISUALIZAR DADOS DO M�DICO
					System.out.println("\nDADOS DO M�DICO:");
					System.out.println("CRM: " + med.getCrm());
					System.out.println("Especialidade: " + med.getEspecialidade());
					break;
				case 3: // VISUALIZAR DADOS DO ENFERMEIRO
					System.out.println("\nDADOS DO ENFERMEIRO:");
					System.out.println("CRE: " + enf.getCre());
					System.out.println("Setor: " + enf.getSetor());
					break;
				default:
					System.out.println("\n!TIPO DE Pessoa NAO CADASTRADA!");
					break;
				}
			case 3: // APAGAR
				break;
			case 4: // SAIR
				sair = false;
				break;
			}
		}
		System.out.println("FIM DO PROGRAMA");
		var.close();
	}

}
