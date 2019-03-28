/*
Crie um programa para ler a quantidade de horas e o valor/hora de dois funcionários.
Calcule o salário e apresente o funcionário que ganha o maior salário.
 */
package ExerciciosSwitch2;

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) {
        double horas1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A QUANTIDADE DE HORAS FUNCIONARIO1: "));
        double valhoras1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR/HORA TRABALHADA FUNCIONARIO1: "));
        double horas2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A QUANTIDADE DE HORAS FUNCIONARIO2: "));
        double valhoras2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR/HORA TRABALHADA FUNCIONARIO2: "));
        double salario1 = horas1 * valhoras1;
        double salario2 = horas2 * valhoras2;
        if (salario1 > salario2) {
            JOptionPane.showMessageDialog(null, "PRIMEIRO FUNCIONARIO GANHA MAIS" + salario1);

        } else if (salario2 > salario1) {
            JOptionPane.showMessageDialog(null, "SEGUNDO FUNCIONARIO GANHA MAIS" + salario1);

        } else { 
            JOptionPane.showMessageDialog(null, "OS DOIS GANHAM O MESMO SALARIO.");
        }
        

    }

}
