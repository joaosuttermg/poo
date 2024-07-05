package com.poo.classes;

import java.util.Scanner;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, String rg, Endereco endereco) {
        super(nome, cpf, rg, endereco);
        
    }
    @Override
    public void calculacc(){
        double salario;
        System.out.println("qual seu salario: ");
        Scanner sc = new Scanner(System.in);
        salario = sc.nextDouble();

        double fgts = salario * 0.08;
        double inss = salario * 0.11;
        double salarioLiquido = salario - fgts - inss;
        double comissao = salario * 0.1;
    }
    
    public void imprimecc(double fgts, double salario, double salarioLiquido, double inss, double comissao) {
        

        System.out.println("Contracheque:");
        System.out.println("Salário Bruto: R$" + salario);
        System.out.println("FGTS: R$" + fgts);
        System.out.println("INSS: R$" + inss);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
        System.out.println("Comissão: "+ comissao);

    }

  
}
