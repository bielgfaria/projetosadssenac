/*
 Crie um programa que solicite um número inteiro e apresente a tubuada desse número de 0 a 20.
 */
package br.com.senac;

import java.util.Scanner;

/**
 *
 * @author 55489
 */
public class Exercicio08 {
    public static void main(String[] args) {
     Scanner numero = new Scanner(System.in);     
     int qtd1 = 0;
     int qtd2 = 20;     
        System.out.println("DIGITE UM NUMERO INTEIRO: ");
        int numero1 = numero.nextInt();
        while (qtd1 <= 20) {
            System.out.print(" - " + numero1 * qtd1++);
        }
        
      
            
            
             
          
            
     }

    }

    

