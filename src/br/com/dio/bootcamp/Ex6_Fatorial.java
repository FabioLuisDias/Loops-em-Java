package br.com.dio.bootcamp;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo uuário.
Ex: 5! = 120 (5x4x3x2x1)
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicação = 1;

        System.out.print(fatorial +"! = ");
        for (int i = fatorial ; i >= 1 ; i--){
            multiplicação = multiplicação * i;
        }
        System.out.println(multiplicação);
    }
}
