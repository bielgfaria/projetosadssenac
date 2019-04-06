/*
 Crie um programa que solicite ao usuário 5 notas e ao final apresente a média.
 */
package br.com.senac;

import java.util.Scanner;

/**
 *
 * @author 55489
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in); 
        int qtd2 = 0;
        int qtd = 1;
        while (qtd <= 5) {
        System.out.println("ESCREVA A NOTA DO ALUNO: ");
        int nota = numero.nextInt();
        qtd2 += nota;
            qtd++;                       
        }
        System.out.println("A MEDIA É: " + qtd2 / 5);
        
    }
    
}
