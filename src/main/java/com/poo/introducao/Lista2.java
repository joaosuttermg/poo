package com.poo.introducao;
import java.util.Scanner ;

public class Lista2 {

    public void ex1 (){
         System.out.println("DIGITE UM NÙMERO: ");
         Scanner scanner = new Scanner(System.in);
        int numerodigitado = scanner.nextInt();

        if( numerodigitado % 2 == 0 ){
            System.out.println("seu numero é par");
            
        }else if (numerodigitado == 0) {
            System.out.println("seu número é 0 ");
            
        }else{
            System.out.println("seu número é ímpar ");

        }
    }
    public void ex2 (){

        int numero1;
        int numero2;
        System.out.println("DIGITE UM NÚMERO: ");
        Scanner sc= new Scanner(System.in);
        numero1 = sc.nextInt();

        System.out.println("DIGITE OUTRO NÚMERO: ");
        numero2 = sc.nextInt();

        if (numero1 > numero2) { System.out.println("o número "+ numero1 + " é maior. ");
            
        }else if(numero1 == numero2) {
            System.out.println("os número são iguais. ");
        } else {System.out.println("o número"+ numero2 + " é maior. ");}

        
    }
    public void ex3 (){
        String idade;
        String deficiente = "n";
        String gestante = "n";

        System.out.print("VOCÊ TEM MAIS DE 65 ANOS?: ");
        Scanner sc = new Scanner(System.in);
        idade = sc.nextLine();
        if (idade.equals("s")){
            System.out.println("VÁ PARA A FILA PREFERENCIAL");
        }else if(idade != "s"){ 
        System.out.print("POSSUI ALGUMA DEFICIENCIA? S/N");
        deficiente = sc.nextLine();
        }if(deficiente.equals("s")){System.out.println("VÁ PARA A FILA PREFERENCIAL");}
        else if (deficiente != "s"){ 
        System.out.print("É GESTANTE?: S/N ");
        gestante = sc.nextLine();
        }if(gestante.equals("s")){System.out.println("VÁ PARA A FILA PREFERENCIAL");}
        else{System.out.println("VÁ PARA A FILA NORMAL");}
        
    }
    public void ex4 (){
        int idade;

        System.out.println("QUAL SUA IDADE?");
        Scanner sc = new Scanner(System.in);
        idade = sc.nextInt();

        if(idade <16){System.out.println("Você não pode entrar no evento!");}
        else if(idade == 16 || idade ==17 || idade ==18){System.out.println("Entrada permitida apenas com acompanhamento dos responsaveis.");}
        else{System.out.println("Você pode entrar no evento! ");}

    }
    public void ex5 (){
        String emailcadastrado;
        String senhacadastrada;
        String emaildigitado;
        String senhadigitada;

        System.out.println("cadastre seu email: ");
        Scanner sc = new Scanner(System.in);
        emailcadastrado = sc.nextLine();
        System.out.println("cadastre sua senha: ");
        senhacadastrada = sc.nextLine();

        System.out.println("digite seu email: ");
        emaildigitado = sc.nextLine();
        if(emaildigitado.equals(emailcadastrado)){System.out.println("digite sua senha: ");}
        else{System.out.println("email incorreto.");}
        senhadigitada = sc.nextLine();
        if (senhadigitada.equals(senhacadastrada)){System.out.println("acesso liberado!");}
        else{System.out.println("senha incorreta");}

    }


}
