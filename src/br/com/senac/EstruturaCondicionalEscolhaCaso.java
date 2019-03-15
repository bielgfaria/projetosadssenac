package br.com.senac;

import java.util.Scanner;

public class EstruturaCondicionalEscolhaCaso {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        int inteiro1 = t.nextInt();
        int inteiro2 = t.nextInt();
        String menu = "MENU \n1) Soma\n2) Subtração\n3) Multiplicação\n" + "4) Divisão\n5) Resto";
        System.out.println(menu);
        int opcao = t.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("SOMA; " + inteiro1 + inteiro2);
                break;
            case 2:
                System.out.println("Subtração: " + (inteiro1 - inteiro2));
                break;
            case 3:
                System.out.println("Multiplicação: " + inteiro1 * inteiro2);
                break;
            case 4:
                System.out.println("Divisão: " + inteiro1 / inteiro2);
                break;
            case 5:
                System.out.println("RESTO: " + (inteiro1 % inteiro2));
                break;
            default:
                System.out.println("Opção Invalida");
                
                
        }
        
    }

}
