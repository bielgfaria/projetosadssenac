/*
 Crie um programa que solicite ao usuário um número inteiro entre 0 e 100 
(o programa não deve prosseguir se o número não estiver nesse intervalo). 
Após, gere 10 números randômicos entre 0 e 100 e apresente quantos randômicos são maiores ou iguais ao número do usuário.
 */
package br.com.senac;

import java.util.Scanner;

/**
 *
 * @author 55489
 */
public class Exercicio09 {

    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        int reg1 = 1;
        int reg2 = 100;
        int nummaiores = 0;
        System.out.println("DIGITE UM NUMERO INTEIRO ENTRE 0 e 100: ");
        int numint = num1.nextInt();
        while (numint < 0 || numint > 100) {
            System.out.println("NUMERO INVALIDO! \n   TEM QUE SER ENTRE 0 a 100!: ");
            int numint2 = num1.nextInt();

        }
        int reg3 = 0;
        String imp = "";
        String qtdm = " ";

        while (reg1 <= 10) {
            double sugestao = Math.floor(Math.random() * 100);
            System.out.println("SUGESTAO DE 10 NUMEROS:" + (int) +sugestao);
            reg1++;
            if (sugestao >= numint) {
                nummaiores += + 1;
                imp += "Este e maior que o sugerido: " + sugestao + "\n";
              
                
            }

        }
        System.out.println(imp);
        System.out.println("Quantidade de maiores é:" + nummaiores);
        
    }

}
