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
public class Exercicio09 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número entre 0 e 100");
        int numero = s.nextInt();
        while (numero < 0 || numero > 100) {
            System.out.println("Número inválido! Digite um número entre 0 e 100");
            numero = s.nextInt();
        }
        System.out.println("Número valido: " + numero);
        
        int indice = 1;
        System.out.println("Números gerados: ");
        String mensagem = "Maiores: ";
        int quantidade = 0;
        while (indice <= 10) {
            double randomicoDecimal = Math.random() * 101;
            int randomico = ((int) randomicoDecimal);
            System.out.print(randomico + ", ");
            if (randomico >= numero) {
                mensagem += randomico + ", ";
                quantidade++;
            }
            indice++;
        }
        System.out.println("");
        System.out.println(mensagem);
        System.out.println("Quantidade: " + quantidade);
    }
    
}
