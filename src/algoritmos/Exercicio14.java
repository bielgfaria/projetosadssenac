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
public class Exercicio14 {
    
    public static void main(String[] args) {
        double alturaAtual = 0;
        int dia = 0;
        while (alturaAtual < 21) {
            dia = dia + 1;
            alturaAtual = alturaAtual + 4;
            if (alturaAtual < 21) {
                alturaAtual = alturaAtual - 1.5;
                System.out.println("Dia  " + dia + " subiu mas escorregou até " + alturaAtual);
            }
        }
        System.out.println("Dia  " + dia + " chegou ao topo!");
    }
}
