package br.com.senac;

import java.text.DecimalFormat;
import java.util.Scanner;

public class valorfinalproduto {

    public static void main(String[] args) {

        Scanner tc1 = new Scanner(System.in);
        System.out.print("Informe o valor do produto: ");
        double vfproduto = tc1.nextDouble();
        DecimalFormat df = new DecimalFormat("#,###.00");
        Scanner tc2 = new Scanner(System.in);
        System.out.print("Informe o valor do desconto: ");
        double desconto = tc2.nextDouble();
        double resultado1 = vfproduto * desconto / 100;
        double resultado2 = vfproduto - resultado1;
        System.out.println("Valor do produto com desconto: " + df.format(resultado2));

    }

}
