/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.algoritmos;

/**
 *
 * @author Felipe
 */
public class Exercicio06 {
    
    public static void main(String[] args) {
        int indice = 1;
        int quantidade = 0;
        System.out.println("Multiplos de 3:");
        while (indice < 101) {
            int resto = indice % 3;
            if (resto == 0) {
                quantidade++;
                System.out.print(indice + " ");
            }
            indice++;
        }
        System.out.println("\nQuantidade: " + quantidade);
    }
    
}
