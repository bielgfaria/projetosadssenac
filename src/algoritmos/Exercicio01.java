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
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 1;
        while (numero < 101) {
            int resto = numero % 2;
            if (resto == 0) {
                System.out.print(numero + " ");
            }
            numero++;
        }
    }

}
