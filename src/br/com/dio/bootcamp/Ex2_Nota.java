package br.com.dio.bootcamp;

/*Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e
continue pedindo até que o usuário informe um valor válido*/

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        //Imprime para o usuário digitar a nota
        System.out.println("Digite uma nota entre 0 e 10:");
        //Lê a nota digitada pelo usuário
        nota = scan.nextInt();

        //Condição do while
        while(nota < 0 | nota > 10) {
            System.out.println("Nota inválida! Digite novamente:");
            //Lê a nota digitada pelo usuário
            nota = scan.nextInt();
        }
        System.out.println("Nota: " + nota);
    }
}
