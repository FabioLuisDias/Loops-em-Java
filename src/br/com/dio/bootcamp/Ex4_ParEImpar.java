package br.com.dio.bootcamp;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e calcule a quantidade de números ímpares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros, numero;
        int count = 0;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Digite a quantidade de números:");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;
            count++;
        } while (count < quantNumeros);
        System.out.println("Quantidade de Pares: " + quantPares);
        System.out.println("Quantidade de Ímpares: " + quantImpares);
    }
}
