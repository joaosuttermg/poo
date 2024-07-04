package com.poo.classes;


public class Endereco {

    String uf;
    String cidade;
    String cep;
    String logradouro;
    int complemento;
    int enderecoid;

    public Endereco(String uf, String cidade, String cep, String logradouro){
        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
    } 

    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String tipo) {
        this.cep = cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public int getComplemento() {
        return complemento;
    }
    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }
   

    
    
}
