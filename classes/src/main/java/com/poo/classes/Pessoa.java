package com.poo.classes;

abstract class Pessoa {
    private int pessoaid;
    private int rg;
    private String cpf;
    private String nome;
    private String endereco;
    public int contador = 1000;
    
    public int getPessoaid() {
        return pessoaid;
    }
    public void setPessoaid(int pessoaid) {
        this.pessoaid = pessoaid;
    }
    public Pessoa(String nome, String cpf, String rg){
        this.nome = nome;
        
        this.cpf = cpf;
        this.endereco = endereco;
        this.pessoaid = contador;
        contador ++;
    } 
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
public void exibirinf(){
System.out.println("rg: "+ getRg());
System.out.println("cpf: "+ getCpf());
System.out.println("nome: "+ getNome());
System.out.println("endereço : "+ endereco);
System.out.println("id: "+ getPessoaid());
}

}
