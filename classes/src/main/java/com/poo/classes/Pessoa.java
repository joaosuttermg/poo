package com.poo.classes;

public class Pessoa {
    private int pessoaid;
    private int rg;
    private String cpf;
    private String nome;
    private int enderecoid;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public int getRg(){
        return rg;
    }
    public void setRg(int rg){
        this.rg = rg;
    }



}
