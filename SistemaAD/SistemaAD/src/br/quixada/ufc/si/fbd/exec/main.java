package br.quixada.ufc.si.fbd.exec;


import br.quixada.ufc.si.DAO.AlunoDAO;
import br.quixada.ufc.si.DAO.ProfessorDAO;
import br.quixada.ufc.si.fbd.model.Aluno;
import br.quixada.ufc.si.fbd.model.Professor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class main {
    static Scanner tcl = new Scanner(System.in);
    static DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) throws ParseException{
        
        
        /*
        System.out.println("Digite o cpf:");
        String cpf = tcl.next();
        System.out.println("Digite a senha:");
        String senha = tcl.next();
        System.out.println("Digite o nome:");
        String nome = tcl.next();
        System.out.println("Digite a data de nascimento:");
        String dataRec = tcl.nextLine();
        String dataN = tcl.next();
        System.out.println("Digite o tipo:");
        String tipo = tcl.next();
        System.out.println("Digite o estado:");
        String estado = tcl.next();
        System.out.println("Digite a cidade:");
        String cidade = tcl.next();
        System.out.println("Digite o bairro:");
        String bairro = tcl.next();
        System.out.println("Digite o complemento:");
        String com = tcl.next();
        System.out.println("Digite a rua:");
        String rua = tcl.next();
        System.out.println("Digite o numero:");
        String numero = tcl.next();
        */
        Professor profDAO = new Professor();
        /*
        profDAO.setCpf(cpf);
        profDAO.setSenha(senha);
        profDAO.setNome(nome);
        profDAO.setData_nasc(dataN);
        profDAO.getTipo();
        profDAO.setEstado(estado);
        profDAO.setCidade(cidade);
        profDAO.setBairro(bairro);
        profDAO.setComplemento(com);
        profDAO.setRua(rua);
        profDAO.setNumero(numero);
        */
        ProfessorDAO prof = new ProfessorDAO();
       // prof.create(profDAO);
       // System.out.println("Cadastrado");
        
        //prof.update(profDAO);
        /*
        
        
        
        
        
        System.out.println("Digite o numero:");
        String numero = tcl.next();
        System.out.println(prof.read(numero));
        */
        
       /* System.out.println("Digite o cpf: ");
        String cpf = tcl.next();
        
        System.out.println("Digite o nome: ");
        String nome = tcl.next();
        
        profDAO.setCpf(cpf);
        profDAO.setNome(nome);
        
        prof.update(profDAO);*/
        
        //System.out.println("Digite o cpf: ");
        //String cpf = tcl.next();
        //prof.delete(cpf);
        AlunoDAO aluDAO = new AlunoDAO();
        
        Aluno alu = new Aluno();
        /*
        System.out.println("Digite o matricula: ");
        int matricula = tcl.nextInt();
        aluDAO.delete(matricula);
        */
        System.out.println("Digite a matricula: ");
        int matricula = tcl.nextInt();
        System.out.println(aluDAO.read(matricula));
        /* 
        System.out.println("Digite a matricula: ");
        int matricula = tcl.nextInt();
        
        System.out.println("Digite o nome: ");
        String nome = tcl.next();
        
        alu.setMatricula(matricula);
        alu.setNome(nome);
        
        aluDAO.update(alu);
      */
        /*System.out.println("Digite o nome:");
        String nome = tcl.next();
        System.out.println("Digite a matricula:");
        int matricula = tcl.nextInt();
        System.out.println("Digite a data de nascimento:");
        String dataRec = tcl.nextLine();
        String dataN = tcl.next();
        System.out.println("Digite o estado:");
        String estado = tcl.next();
        System.out.println("Digite a cidade:");
        String cidade = tcl.next();
        System.out.println("Digite o bairro:");
        String bairro = tcl.next();
        System.out.println("Digite o complemento:");
        String com = tcl.next();
        System.out.println("Digite a rua:");
        String rua = tcl.next();
        System.out.println("Digite o numero:");
        String numero = tcl.next();
        
        
      
        alu.setNome(nome);
        alu.setMatricula(matricula);
        alu.setData_nasc(dataN);
        alu.setEstado(estado);
        alu.setCidade(cidade);
        alu.setBairro(bairro);
        alu.setComplemento(com);
        alu.setRua(rua);
        alu.setNumero(numero);
        
        aluDAO.create(alu);
                */
    }
     
}