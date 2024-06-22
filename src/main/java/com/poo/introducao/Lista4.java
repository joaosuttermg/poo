package com.poo.introducao;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Lista4 {

    public void ex1() {

        double vendas[] = { 2.4, 3, 10.5, 4, 9 };
        double soma = 0;
        for (int i = 0; i < vendas.length; i++) {
            soma += vendas[i];
        }
        System.out.println("A soma dos valores do dia é : " + soma);

    }

    public void ex2() {
        double vendas[] = { 2.4, 3, 10.5, 4, 9 };
        double soma = 0;
        double menorValor = 2.4;
        double maiorValor = 10.5;

        for (int i = 0; i < vendas.length; i++) {
            soma += vendas[i];
            if (vendas[i] <= menorValor) {
                menorValor = vendas[i];
            }
            if (vendas[i] > maiorValor) {
                maiorValor = vendas[i];
            }

        }
        System.out.println("A soma dos valores do dia é : " + soma);
        System.out.println("O MAIOR VALOR FOI: " + maiorValor);
        System.out.println("O MENOR VALOR FOI: " + menorValor);
    }

    public void ex3() {

        double vendas[] = { 2.4, 3, 10.5, 4, 9 };
        double soma = 0;
        double ticmedio = 0;
        for (int i = 0; i < vendas.length; i++) {
            soma += vendas[i];
            ticmedio = soma / vendas[i];
        }

        System.out.println("A soma dos valores do dia é : " + soma);
        System.out.println("o ticket medio de vendas é : " + ticmedio);

    }

    public void ex4() {

        int lista[] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };
        int numpar;
        System.out.println(" os números pares entre a lista são: ");
        for (int i = 0; i < lista[i]; i++) {
            if (lista[i] % 2 == 0) {
                numpar = lista[i];
                System.out.println(numpar);
            }

        }

    }

    public void ex5() {

        int opcao;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        do {

            System.out.println("\nMenu:");
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("escolha o item que deseja adicionar: ");
                    String item = sc.next();
                    lista.add(item);
                    System.out.println("Item adicionado.");

                    break;

                case 2:
                    System.out.println("lista de compras: ");
                    for (String listaitem : lista) {
                        System.out.println(listaitem);
                    }
                    break;

                case 3:
                    System.out.println("encerrando programa.");
                    break;
                default:
                    System.out.println("opçao invalida");

            }

        } while (opcao != 3);
    }

    public void ex6() {
        int opcao;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        do {

            System.out.println("\nMenu:");
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Sair");
            System.out.println("4. remover um item");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("escolha o item que deseja adicionar: ");
                    String item = sc.next();
                    lista.add(item);
                    System.out.println("Item adicionado.");

                    break;

                case 2:
                    System.out.println("lista de compras: ");
                    for (String listaitem : lista) {
                        System.out.println(listaitem);
                    }
                    break;

                case 3:
                    System.out.println("encerrando programa.");
                    break;

                case 4:
                    System.out.println("digite o item que quer remover: ");
                    String itemremovido = sc.next();
                    if (lista.remove(itemremovido)) {
                        System.out.println(itemremovido + "foi removido");
                    } else {
                        System.out.println("item não encontrado");
                    }

                default:
                    System.out.println("opçao invalida");

            }

        } while (opcao != 3);
    }

    public void ex7() {
        int opcao;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        List<Double> listaPrecos = new ArrayList<>();

        do {

            System.out.println("\nMenu:");
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Sair");
            System.out.println("4. remover um item");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("escolha o item que deseja adicionar: ");
                    String item = sc.next();
                    lista.add(item);
                    System.out.println("digite o preço do item: ");
                    double preço = sc.nextDouble();
                    listaPrecos.add(preço);
                    System.out.println("Item adicionado.");

                    break;

                case 2:
                    System.out.println("lista de compras: ");
                    for (String listaitem : lista) {
                        System.out.println(listaitem + "R$ " + listaPrecos);
                    }
                    break;

                case 3:
                    System.out.println("encerrando programa.");
                    break;

                case 4:
                    System.out.println("digite o item que quer remover: ");
                    String itemremovido = sc.next();
                    if (lista.remove(itemremovido)) {
                        System.out.println(itemremovido + "foi removido");
                    } else {
                        System.out.println("item não encontrado");
                    }

                default:
                    System.out.println("opçao invalida");

            }

        } while (opcao != 3);
    }

    public void ex8() {

        int opcao;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        List<Double> listaPrecos = new ArrayList<>();
        List<Double> Precoscrescente = new ArrayList<>();

        do {

            System.out.println("\nMenu:");
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Sair");
            System.out.println("4. remover um item");
            System.out.println("5. ver preços e ordem crescente");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("escolha o item que deseja adicionar: ");
                    String item = sc.next();
                    lista.add(item);
                    System.out.println("digite o preço do item: ");
                    double preço = sc.nextDouble();
                    listaPrecos.add(preço);
                    System.out.println("Item adicionado.");

                    break;

                case 2:
                    System.out.println("lista de compras: ");
                    for (String listaitem : lista) {
                        System.out.println(listaitem + "R$ " + listaPrecos);
                    }
                    break;

                case 3:
                    System.out.println("encerrando programa.");
                    break;

                case 4:
                    System.out.println("digite o item que quer remover: ");
                    String itemremovido = sc.next();
                    if (lista.remove(itemremovido)) {
                        System.out.println(itemremovido + "foi removido");
                    } else {
                        System.out.println("item não encontrado");
                    }
                    break;

                case 5:
                    Precoscrescente = listaPrecos;
                    Collections.sort(listaPrecos);
                    System.out.println( lista + "R$" +listaPrecos);

                    break;
                    default:
                    if (opcao > 5) {
                        System.out.println("opçao invalida");
                    }
            }

        } while (opcao != 3);
    }
}
