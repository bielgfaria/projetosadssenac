/*
 Crie um programa que solicite ao usuário um número inteiro X 
e apresente no console todos os números inteiros de 1 até X.
 */
package br.com.senac;

import java.util.Scanner;

/**
 *
 *
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int numero1 = numero.nextInt();
        int numero2 = 1;
        while (numero2 < numero1) {
            System.out.println(numero2++);
        }
        numero2++;

    }
}


