package br.com.senac;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int inteiro1 = t.nextInt();
        int inteiro2 = t.nextInt();
        System.out.println("SOMA; " + inteiro1 + inteiro2);
        System.out.println("Subtração: " + (inteiro1 - inteiro2));
        System.out.println("Multiplicação: " + inteiro1 * inteiro2);
        System.out.println("Divisão: " + inteiro1 / inteiro2);

    }

}
