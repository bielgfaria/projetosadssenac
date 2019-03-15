package br.com.senac;

import java.text.DecimalFormat;
import java.util.Scanner;

public class calcularsalariomaisacrescimo {

    public static void main(String[] args) {

        Scanner tc1 = new Scanner(System.in);
        System.out.print("Informe o valor de salario: ");
        double salario = tc1.nextDouble();
        DecimalFormat df = new DecimalFormat ("#,###.00");
        Scanner tc2 = new Scanner(System.in);
        System.out.print("Informe o valor de acrescimo: ");
        double acrescimo = tc2.nextDouble();
        double resultado1 = salario * acrescimo / 100;
        double novosalario = resultado1 + salario;
        System.out.println(df.format(salario + resultado1));
        System.out.println(df.format(novosalario));
        
        
        

    }

}
