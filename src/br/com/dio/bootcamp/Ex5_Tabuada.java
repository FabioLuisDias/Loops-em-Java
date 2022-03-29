package br.com.dio.bootcamp;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capa de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
 */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabuada;

        System.out.println("Digite Tabuada: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for (int i = 1; i <= 10; i ++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}
