package com.poo.classes;

public class Autor extends Pessoa {
    public Autor(String nome, String cpf, String rg) {
        super(nome, cpf, rg);
        //TODO Auto-generated constructor stub
    }
    int autorid;
    String nome;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
