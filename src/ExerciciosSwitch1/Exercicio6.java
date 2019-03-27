package ExerciciosSwitch1;
//Crie um programa que solicite ao usuário 5 números inteiros. Depois apresente o maior e o menor número digitado.

import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Digite o primeiro numero");
        int n1 = Integer.valueOf(s);
        s = JOptionPane.showInputDialog("Digite o segundo numero");
        int n2 = Integer.valueOf(s);
        s = JOptionPane.showInputDialog("Digite o terceiro numero");
        int n3 = Integer.valueOf(s);
        s = JOptionPane.showInputDialog("Digite o quarto numero");
        int n4 = Integer.valueOf(s);
        s = JOptionPane.showInputDialog("Digite o quinto numero");
        int n5 = Integer.valueOf(s);

        int maior = n1;

        if (n2 > maior) {
            maior = n2;
        }

        if (n3 > maior) {
            maior = n3;
        }

        if (n4 > maior) {
            maior = n4;
        }

        if (n5 > maior) {
            maior = n5;
        }
        System.out.println("Maior:" + maior);

        int menor = n1;

        if (n2 < menor) {
            menor = n2;
        }

        if (n3 < menor) {
            menor = n3;
        }

        if (n4 < menor) {
            menor = n4;
        }

        if (n5 < menor) {
            menor = n5;
        }
        System.out.println("Menor:" + menor);

    }

}
