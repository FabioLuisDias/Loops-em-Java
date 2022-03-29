package br.com.dio.bootcamp;

import java.util.Scanner;
/*
* Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno
* e o segundo representando a sua idade.
* (Pare inserindo o valor 0 no campo nome)
* */

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        //Enquanto
         while(true){
             System.out.println("Digite seu nome:");
             nome = scan.next();
             //condição de parada
             if(nome.equals("0")) break;

             System.out.println("Digite sua idade:");
             idade = scan.nextInt();
         }
        System.out.println("Continua aqui...");
    }
}
