/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.algoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class Exercicio11 {

    public static void main(String[] args) {
        String resposta = "";
        while (!resposta.equals("3")) {
            String menu = "Escolha uma opção:\n1) Celsius -> Fahrenheit\n2) Fahrenheit -> Celsius\n3) Sair";
            resposta = JOptionPane.showInputDialog(null, menu);
            switch (resposta) {
                case "3":
                    JOptionPane.showMessageDialog(null, "Bye =)");
                    break;
                case "1":
                    String auxiliar = JOptionPane.showInputDialog("Qual a temperatura?");
                    double temperatura = Double.valueOf(auxiliar);
                    double fahrenheit = (temperatura * 9 / 5) + 32;
                    String msg = temperatura + "C é " + fahrenheit + "F";
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case "2":
                    auxiliar = JOptionPane.showInputDialog("Qual a temperatura?");
                    temperatura = Double.valueOf(auxiliar);
                    double celsius = (temperatura - 32) * 5 / 9;
                    String msg1 = temperatura + "F é " + celsius + "C";
                    JOptionPane.showMessageDialog(null, msg1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
    }
}
