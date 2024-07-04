package com.poo.classes;
import java.util.Date;

public class Emprestimo {
    int emprestimoid;
    Date dataemprestimo;
    Date dataprevistadevolucao;
    int pessoaid;

    public Emprestimo (Date dataemprestimo, Date dataprevistadevolucao){
        this.dataemprestimo = dataemprestimo;
        this.dataprevistadevolucao = dataprevistadevolucao;
       
    } 
    
    public Date getDataemprestimo() {
        return dataemprestimo;
    }
    public void setDataemprestimo(Date dataemprestimo) {
        this.dataemprestimo = dataemprestimo;
    }
    
    public Date getDataprevistadevolucao() {
        return dataprevistadevolucao;
    }
    public void setDataprevistadevolucao(Date dataprevistadevolucao) {
        this.dataprevistadevolucao = dataprevistadevolucao;
    }
}
