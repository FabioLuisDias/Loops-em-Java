package br.com.dio.bootcamp;

import java.util.Scanner;
/*
Faça um programa que leia 5 números,
informe o maior número
e a média desses números.
 */

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int numeroMaior = 0;
        int count = 0;

        do{
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            //Incremento no contador.
            count = count + 1;
            //Fazendo as somas dos valores.
            soma = soma + numero;
            //Se número for maior que o número maior, ele passará a ser o número maior.
            if (numero > numeroMaior) numeroMaior = numero;
        //Enquanto count for menor que 5.
        } while(count < 5);
        System.out.println("Numero maior: " + numeroMaior);
        System.out.println("Média dos números: " + (soma/5));
    }
}
