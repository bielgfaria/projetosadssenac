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
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Imprimir números até?");
        int fim = teclado.nextInt();
        int indice = 1;
        System.out.println("Imprimindo valor de 1 até " + fim);
        while (indice <= fim) {
            System.out.print(indice + " - ");
            indice++;
        }
    }

}
