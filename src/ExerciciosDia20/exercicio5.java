/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosDia20;

import javax.swing.JOptionPane;

/**
 * Crie um programa que gere para o usuário a sugestão dos 6 números da
 * megasena. Lembrando que os números da megasena é entre 1 e 60.
 *
 * @author Alunos
 */
public class exercicio5 {

    public static void main(String[] args) {
        String t = JOptionPane.showInputDialog(null, "Gostaria de receber os numeros da MegaSena?");
        if (t.equalsIgnoreCase("Sim")) {

        }
        int random = (int) (Math.random() * 60) + 0;

        int random2 = (int) (Math.random() * 60) + 0;

        int random3 = (int) (Math.random() * 60) + 0;

        int random4 = (int) (Math.random() * 60) + 0;

        int random5 = (int) (Math.random() * 60) + 0;

        int random6 = (int) (Math.random() * 60) + 0;

        JOptionPane.showMessageDialog(null, "Os numeros são: " + random + " " + random2 + " " + random3 + " " + random4 + " " + random5 + " " + random6);

    }

}
