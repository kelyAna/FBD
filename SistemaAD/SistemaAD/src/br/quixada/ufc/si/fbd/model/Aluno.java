package br.quixada.ufc.si.fbd.model;

import java.sql.Date;
import java.time.LocalDate;


public class Aluno extends Pessoa{
    private int matricula;

   
    public Aluno(){
        super();
    }
    
    public Aluno(String nome,String rua, String estado, String cidade, String bairro, String complemento, String numero, String cpf, String data_nasc, String telefone,int matricula){
        super(nome,rua,estado,cidade,bairro,complemento,numero,cpf,data_nasc,telefone);
        this.matricula = matricula;

    }

    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String toString() {
        return "Professor{" + "Nome =  " + this.getNome() + " Matricula  =  " + this.matricula  + " CPF:  =  " + this.getCpf() +  "Estado =  " + this.getEstado()
                + "Cidade = " + this.getCidade() + "Bairro =  " + this.getBairro() + "Rua =  " + this.getRua() + "Complemento = " + this.getComplemento() +
                "Rua = " + this.getRua() + "Numero = " + this.getNumero();
    }
    
}
