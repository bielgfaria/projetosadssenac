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
public class Exercicio13 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Fatorial de qual número?");
        int numeroFatorial = teclado.nextInt();
        int resultado = 1;
        while (numeroFatorial >= 1) {
            resultado = resultado * numeroFatorial;
            numeroFatorial--;
        }
        System.out.println("Resultado: " + resultado);
    }
}
