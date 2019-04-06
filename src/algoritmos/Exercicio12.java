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
public class Exercicio12 {

    public static void main(String[] args) {
        int proximo = 0;
        int anterior = 1;
        int atual = 0;
        int indice = 1;
        while (indice <= 10) {
            System.out.print(proximo + ", ");
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;
            indice++;
        }
    }

}
