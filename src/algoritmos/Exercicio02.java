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
public class Exercicio02 {
    
    public static void main(String[] args) {
        int indice = 1;
        while (indice <= 50) {
            if (indice % 2 == 0) {
                System.out.print(indice + " - ");
            }
            indice++;
        }
    }
    
}
