/*
 A Infraero deseja criar um sistema que calcula o excesso de bagagem quando houver cobrando um valor por Kg excedido. 
Se a viagem for nacional o limite da bagagem é 23kg e o valor cobrado é R$3,00 por Kg excedido. 
Se a viagem é internacional o limite é 64Kg e o valor cobrado é R$5,00 por Kg excedido. 
Crie um programa que leia do usuário o tipo da viagem e o peso da bagagem e apresente 
ao usuário o valor que o passageiro deve pagar caso tenha excedido o limite, 
caso contrário apresentar a mensagem que o passageiro não deve pagar nada.
 */
package ExerciciosSwitch2;

import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main(String[] args) {

        double peso = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O PESO DA BAGAGEM:"));

        String[] viagem = {"VIAGEM NACIONAL", "VIAGEM INTERNACIONAL"};

        String valor1 = String.valueOf(JOptionPane.showInputDialog(
                null, "Selecione uma opção abaixo:", "ESCOLHA", JOptionPane.QUESTION_MESSAGE, null,
                viagem, viagem[1]));
        if (valor1.equalsIgnoreCase("VIAGEM NACIONAL")) {
            if (peso > 23.0) {
                JOptionPane.showMessageDialog(null, "VALOR DO EXCESSO SERÁ: " + (peso - 23.0) * 3);
            } else {
                JOptionPane.showMessageDialog(null, "NAO PAGARA EXCESSO DE BAGAGEM.");
            }}
            if (valor1.equalsIgnoreCase("VIAGEM INTERNACIONAL")) {
                if (peso > 64.0) {
                    JOptionPane.showMessageDialog(null, "VALOR DO EXCESSO SERÁ: " + (peso - 64.0) * 5);
                } else {
                    JOptionPane.showMessageDialog(null, "NAO PAGARA EXCESSO DE BAGAGEM.");
                }
            }
        }

    }


