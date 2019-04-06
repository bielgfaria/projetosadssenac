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
public class Exercicio15 {

    public static void main(String[] args) {
        String resposta = "s";
        while (resposta.equalsIgnoreCase("S")) {

            String menu = ":: Joquempô ::\n\nEscolha uma opção:\n(1) Pedra\n(2) Papel\n(3) Tesoura";
            String escolha = JOptionPane.showInputDialog(menu);
            int opcaoUsuario = Integer.valueOf(escolha);

            /* gerando a aposta do PC */
            double d = Math.random(); // gerando um valor onde 0 <= d < 1
            d = d * 3; // gerando um valor onde 0 <= d < 3
            int opcaoPc = (int) d; // obtendo a parte inteira onde 0 <= numero <= 2
            opcaoPc = opcaoPc + 1; // incrementando onde 1 <= numero <= 3
            String mensagem = "";
            System.out.println("Usuário " + opcaoUsuario);
            System.out.println("PC " + opcaoPc);
            switch (opcaoUsuario) {
                case 1:
                    if (opcaoPc == 1) {
                        mensagem = "Empate! Duas pedras";
                    }
                    if (opcaoPc == 2) {
                        mensagem = "Perdeu! Papel ganha da pedra";
                    }
                    if (opcaoPc == 3) {
                        mensagem = "Ganhou! Pedra ganha de tesoura";
                    }
                    break;
                case 2:
                    if (opcaoPc == 1) {
                        mensagem = "Ganhou! Papel ganha de pedra";
                    }
                    if (opcaoPc == 2) {
                        mensagem = "Empate! Dois papéis";
                    }
                    if (opcaoPc == 3) {
                        mensagem = "Perdeu! Papel perde de tesoura";
                    }
                    break;
                case 3:
                    if (opcaoPc == 1) {
                        mensagem = "Perdeu! Pedra ganha de tesoura";
                    }
                    if (opcaoPc == 2) {
                        mensagem = "Ganhou! Tesoura ganha de papel";
                    }
                    if (opcaoPc == 3) {
                        mensagem = "Empate! Duas tesouras";
                    }
                    break;
            }
            JOptionPane.showMessageDialog(null, mensagem);
            resposta = JOptionPane.showInputDialog("Deseja continuar? (S/N)");
        }
    }
}
