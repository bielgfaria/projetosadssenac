/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.algoritmos;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Exercicio07 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int indice = 1;
        double soma = 0;
        while (indice <= 5) {
            System.out.println("Digite a nota nº " + indice);
            double nota = teclado.nextDouble();
            soma = soma + nota;
            indice++;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma / 5));
    }
    
}
