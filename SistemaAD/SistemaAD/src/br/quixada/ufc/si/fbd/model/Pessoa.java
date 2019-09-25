package br.quixada.ufc.si.fbd.model;

import java.sql.Date;
import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String rua;
    private String estado;
    private String cidade;
    private String bairro;
    private String complemento;
    private String numero;
    private String cpf;
    private String data_nasc;
    private String telefone;

    public Pessoa() {

    }

    public Pessoa(String nome,String rua, String estado, String cidade, String bairro, String complemento,String numero, String cpf, String data_nasc, String telefone) {
        this.nome = nome;
        this.rua = rua;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
        this.telefone = telefone;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public String getRua() {
        return rua;
    }

    
    public void setRua(String rua) {
        this.rua = rua;
    }

  
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

}
