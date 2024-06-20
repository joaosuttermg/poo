package com.poo.introducao;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Lista3 {
    public void ex2() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();
        System.out.print("Digite o limite da tabuada: ");
        int limite = scanner.nextInt();

        System.out.println("Tabuada do " + numero + " até " + limite + ":");
        int i = 1;
        while (i <= limite) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
            i++;
        }
    }

    public void ex3() {
        int num1 = 0;
        int num2;

        System.out.println("digite um número: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("digite outro numero: ");
        num2 = sc.nextInt();
        System.out.println("os números pares entre: " + num1 + " e " + num2 + " são: ");
        for (int i = num1; i < num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }

        }

    }

    public void ex4() {

        int numescolhido;
        int palpite;

        System.out.println("escolha um numero: ");
        Scanner sc = new Scanner(System.in);
        numescolhido = sc.nextInt();
        System.out.println("dê seu palpite: ");
        palpite = sc.nextInt();

        if ((palpite - numescolhido) == 5 || (palpite - numescolhido) == 4 || (palpite - numescolhido) == 3
                || (palpite - numescolhido) == 2 || (palpite - numescolhido) == 1 || numescolhido - palpite == 5
                || numescolhido - palpite == 4 || numescolhido - palpite == 3 || numescolhido - palpite == 2
                || numescolhido - palpite == 1) {
            System.out.println("Está quente!");
        } else if (palpite != numescolhido) {
            System.out.println("está frio...");
        } else {
            System.out.println("parabéns! você acertou");
        }

    }

    public void ex5() {
        String emailcadastrado;
        String senhacadastrada;
        String emaildigitado;
        String senhadigitada;
        int tentativas = 0;

        System.out.println("cadastre seu email: ");
        Scanner sc = new Scanner(System.in);
        emailcadastrado = sc.nextLine();
        System.out.println("cadastre sua senha: ");
        senhacadastrada = sc.nextLine();

        

        while (tentativas <= 2) {System.out.println("digite seu email: ");
        emaildigitado = sc.nextLine();
            if (emaildigitado.equals(emailcadastrado)) {
                System.out.println("digite sua senha: ");
            } else {
                System.out.println("email incorreto.");
                
                tentativas++;

            }}while ((tentativas <=2)) {
                
            

            senhadigitada = sc.nextLine();

            if (senhadigitada.equals(senhacadastrada)) {
                System.out.println("acesso liberado!");
            } else {
                System.out.println("senha incorreta");
                tentativas++;
                if (tentativas == 2) {
                    System.out.println("cuidado, é sua ultima tentativa");
                }
            }
        }
    }
}

