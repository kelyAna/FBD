package br.quixada.ufc.si.fbd.model;

import java.time.LocalDate;


public class Administrador extends Pessoa{
    private String senha;
    
    
    
    public Administrador(){
        
    }
    
    public Administrador(String nome,String rua, String estado, String cidade, String bairro, String complemento, int numero, String cpf, LocalDate data_nasc, String telefone,String senha){
        //super(nome,rua,estado,cidade,bairro,complemento,numero,cpf,data_nasc,telefone);
        this.senha = senha;
    }

  
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
