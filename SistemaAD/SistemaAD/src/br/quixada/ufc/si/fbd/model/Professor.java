package br.quixada.ufc.si.fbd.model;

import java.sql.Date;


public class Professor extends Pessoa{
    private String tipo;
    private String senha;

   
    public Professor(){
       
    }
    
    public Professor(String nome,String rua, String estado, String cidade, String bairro, String complemento, String numero, String cpf, String data_nasc, String telefone,String tipo, String senha){
        super(nome,rua,estado,cidade,bairro,complemento,numero,cpf,data_nasc,telefone);
        this.tipo = tipo;
        this.senha = senha;
    }

 
    public String getTipo() {
        return tipo;
    }

  
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Professor{" + "tipo =  " + tipo + ", senha  =  " + senha  + " CPF  =  " + this.getCpf() + "Nome  =  " + this.getNome() + "Estado =  " + this.getEstado()
                + "Cidade = " + this.getCidade() + "Bairro =  " + this.getBairro() + "Rua =  " + this.getRua() + "Complemento = " + this.getComplemento() +
                "Rua = " + this.getRua() + "Numero = " + this.getNumero();
    }
    

}
