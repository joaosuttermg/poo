package com.poo.classes;

import java.util.Scanner;

public class Funcionario extends Pessoa { Endereco endereco;

     public Funcionario (String nome, String cpf, String rg, Endereco endereco){
         super(nome, cpf, rg);
         this.endereco = endereco;
        }
        String login;
        int senha;

        public Funcionario(String nome, String cpf, String rg, String login, int senha) {
            super(nome, cpf, rg);
            this.login = login;
            this.senha = senha;
        }
        public String getLogin() {
            return login;
        }
        public void setLogin(String login) {
            this.login = login;
        }
        public int getSenha() {
            return senha;
        }
        public void setSenha(int senha) {
            this.senha = senha;
        }

        public void autentica() {
            if(login == "funcionario" & senha == 11){
            System.out.println("Autenticado com sucesso!");
            }else{System.out.println("autenticação não concluida");}}

            public void imprimecc() {
                double salario;
                System.out.println("qual seu salario: ");
                Scanner sc = new Scanner(System.in);
                salario = sc.nextDouble(); 
                
                double fgts = salario * 0.08;
                double inss = salario * 0.11;
                double salarioLiquido = salario - fgts - inss;
        
                System.out.println("Contracheque:" );
                System.out.println("Salário Bruto: R$" + salario);
                System.out.println("FGTS: R$" + fgts);
                System.out.println("INSS: R$" + inss);
                System.out.println("Salário Líquido: R$" + salarioLiquido);
            
        }
        
      
    


}
