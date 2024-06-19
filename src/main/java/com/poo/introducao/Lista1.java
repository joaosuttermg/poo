package com.poo.introducao;

import java.util.Scanner ;



public class Lista1 {

    public void ex1 (){
        int num1;
        int num2;
        int resultado;

        System.out.println("digite um número: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        System.out.println("digite outro número: ");
        num2 = sc.nextInt();

        resultado = num1 + num2;

        System.out.println("o resultado da soma dos dois numeros é: "+ resultado);
        sc.close();


    }
    public void ex2 (){


       String nome;
       String sobrenome;

       System.out.println("qual seu nome?: ");
       Scanner sc = new Scanner(System.in);

         nome = sc.nextLine();

         System.out.println("E seu sobrenome?: ");
          sobrenome = sc.nextLine();

          System.out.println("Olá, "+ nome +" "+ sobrenome);
          sc.close();


    }
    public void ex3 (){

        double numASerConvertido;
        double numConvertido;

        System.out.println("DIGITE UM VALOR PARA CONVERTER: ");
        Scanner sc2 = new Scanner(System.in);

        numASerConvertido = sc2.nextDouble();

        numConvertido = numASerConvertido / (5.25);
        System.out.println("Seu valor convertido dólar: "+ numConvertido );
        sc2.close();

    }
    public void ex4 (){

    int numAntecessor;
    int numSucessor;
    int numEscolhido;

    System.out.println("ESCREVA UM NÚMERO: ");
    Scanner sc3 = new Scanner(System.in);

    numEscolhido = sc3.nextInt();

    numAntecessor = numEscolhido - 1;
    numSucessor = numEscolhido + 1;

    System.out.println("O NÚMERO ANTECESSOR É " + numAntecessor + " E O NÚMERO SUCESSOR É: " + numSucessor );
    sc3.close();


    }
    public void ex5 (){

        double area;
        double valorm2;
        double valorTotal;

        System.out.println("DIGITE A ÁREA DO TERRENO EM METROS QUADRADOS: ");
        Scanner sc4 = new Scanner(System.in);

        area = sc4.nextDouble();

        System.out.println("DIGITE O VALOR DE CADA METRO QUADRADO: ");
        valorm2 = sc4.nextDouble();

        valorTotal = area * valorm2;
        System.out.println("VALOR TOTAL: "+ valorTotal);
        sc4.close();

    





    }
    public void ex6 (){

       int km;
       double valorgasto;
       double consumomedio;
       
       System.out.println("digite a distancia percorrida em km:  ");
       Scanner sc5 = new Scanner(System.in);

       km = sc5.nextInt();
       System.out.println("digite o gasto com combustível em litros:  ");
       valorgasto = sc5.nextInt();

       consumomedio = km / valorgasto;

       System.out.println("o valor gasto é de: "+ consumomedio);
       sc5.close();



    }
    public void ex7 (){
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        System.out.println("digite sua nota na prova: ");
        Scanner sc6 = new Scanner(System.in);

        nota1 = sc6.nextDouble();

        System.out.println("digite sua nota no trabalho: ");
        nota2 = sc6.nextDouble();

        System.out.println("digite sua nota no simulado: ");
        nota3 = sc6.nextDouble();

        System.out.println("digite sua nota de conceito: ");
        nota4 = sc6.nextDouble();

       media = nota1 + nota2 + nota3 + nota4 / 4;
       System.out.println("sua média aritimetica é : "+ media);
       sc6.close();




    }
    public void ex8 (){
        double temperaturaF;
        double temperaturaC;

        System.out.println("DIGITE O VALOR EM FAHRENHEIT: ");
        Scanner sc8 = new Scanner(System.in);
        temperaturaF = sc8.nextDouble();

        temperaturaC = (temperaturaF- 32) * 5/9;

        System.out.println("SEU VALOR EM CELSIUS É : "+ temperaturaC);
        sc8.close();





    }
}
