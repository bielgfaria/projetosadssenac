package br.com.senac;

import java.util.Scanner;

public class calcudoidademeseshorasdias {

    public static void main(String[] args) {
        Scanner tc1 = new Scanner(System.in);
        System.out.print("Informe o valor de a: ");
        int idade = tc1.nextInt();        
        int mesesdeumano = 12;
        int diasdeumano = 365;
        int horasdeumdia = 24;
        System.out.println("Resultado meses: " + idade * mesesdeumano);
        System.out.println("Resultado dias: " + idade * diasdeumano);
        System.out.println("Resultado horas: " + diasdeumano * horasdeumdia * idade);

    }

}
