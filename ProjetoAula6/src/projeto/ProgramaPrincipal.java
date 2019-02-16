package projeto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal{

    public static void main(String[] args){

        //---VARIAVEIS---//
        // PESSOA //
        String nome=null; long cpf=0; int idade=0; char sexo=' ';
        // PACIENTE //
        String doenca=null; String medico=null; String enfermeiro=null;
        // FUNCIONARIO //
        long pis=0; int matricula=0;
        // MÉDICO //
        long crm=0; String especialidade=null;
        // ENFERMEIRO //
        String setor=null; long cre=0;

        //---LITAS---//
        List<Paciente> pacientes = new ArrayList<Paciente>();
        List<Medico> medicos = new ArrayList<Medico>();
        List<Enfermeiro> enfermeiros = new ArrayList<Enfermeiro>();

        //---CRIAÇÃO DE OBJETOS---//
        Scanner scan = new Scanner(System.in);
        Paciente objPaciente = new Paciente(nome, cpf, idade, sexo, doenca, medico, enfermeiro);
		Medico objMedico = new Medico(nome, cpf, idade, sexo, pis, matricula, crm, especialidade);
        Enfermeiro objEnfermeiro = new Enfermeiro(nome, cpf, idade, sexo, pis, matricula, setor, cre);
        
        //---ENTRADAS---//
        System.out.println("\n[1] - Paciente\n[2] - Médico\n[3] - Enfermeiro");
        // int opcao = Integer.parseInt(scan.nextLine());
        // int opcao = (int)scan.nextDouble();
        // scan.nextLine();
        switch ((int)scan.nextLong()){
        
        case 1: // PACIENTE //
            System.out.println("PACIENTE\nDigite o NOME, CPF, IDADE, SEXO, DOENÇA, MEDICO e ENFERMEIRO: \n");
            objPaciente.setNome(scan.nextLine());
            objPaciente.setCpf(scan.nextLong());
            objPaciente.setIdade(scan.nextInt());
            objPaciente.setSexo(scan.next().charAt(0));
            objPaciente.setDoenca(scan.next());
            objPaciente.setMedico(scan.next());
            objPaciente.setEnfermeiro(scan.next());
            pacientes.add(objPaciente);

            for (Paciente p : pacientes) {
                System.out.println(p);
            }
            break;

        case 2: // MÉDICO //
            System.out.println("MÉDICO\nDigite o NOME, CPF, IDADE, SEXO, PIS, MATRICULA, CRM e ESPECIALIDADE: \n");
            objMedico.setNome(scan.nextLine());
            objMedico.setCpf(scan.nextLong());
            objMedico.setIdade(scan.nextInt());
            objMedico.setSexo(scan.next().charAt(0));
            objMedico.setPis(scan.nextLong());
            objMedico.setMatricula(scan.nextInt());
            objMedico.setCrm(scan.nextLong());
            objMedico.setEspecialidade(scan.next());
            medicos.add(objMedico);
            break;

        case 3: // ENFERMEIRO //
            System.out.println("ENFERMEIRO\nDigite o NOME, CPF, IDADE, SEXO, PIS, MATRICULA, CRE e SETOR: \n");
            objEnfermeiro.setNome(scan.nextLine());
            objEnfermeiro.setCpf(scan.nextLong());
            objEnfermeiro.setIdade(scan.nextInt());
            objEnfermeiro.setSexo(scan.next().charAt(0));
            objEnfermeiro.setPis(scan.nextLong());
            objEnfermeiro.setMatricula(scan.nextInt());
            objEnfermeiro.setCre(scan.nextLong());
            objEnfermeiro.setSetor(scan.nextLine());
            enfermeiros.add(objEnfermeiro);
            break;

        }

        





        
        scan.close();   // CLOSE SCANNER
    }

}