
package br.com.senac;

import java.text.DecimalFormat;
import java.util.Scanner;


public class calcularcircunferencia {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat ("#,###.00");
        Scanner tc1 = new Scanner(System.in);
        System.out.print("Centimetros: ");
        double cm = tc1.nextDouble();
        double comprimento = 2 * 3.14 * cm;
        double area = 3.14 * (Math.pow(cm,2));
        System.out.println("Comprimento: " + df.format(comprimento));
        System.out.println("Área: " + df.format (area));
        
        
        
        
        
        
    }
    
}
