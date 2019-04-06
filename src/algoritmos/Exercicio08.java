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
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Gerar tabuada de qual número?");
        int numeroTabuada = teclado.nextInt();
        int indice = 0;
        System.out.println("Tabuada do " + numeroTabuada);
        while (indice <= 20) {
            System.out.println(numeroTabuada + " x " + indice + " = " + (numeroTabuada * indice));
            indice++;
        }
    }
}
