/*
 DESAFIO: Crie um jogo do Joquempô (Pedra, Papel, Tesoura), onde o usuário vai jogar contra o computador. 
Solicite ao usuário que ele escolha uma das opções do menu:
Escolha um objeto:
(1) Pedra
(2) Papel
(3) Tesoura
Seu algoritmo então deve gerar um número randômico entre 1 e 3 para simular a escolha do computador.
Perceba que objetos iguais podem ser escolhidos e geram empate. As demais possibilidades são:
* Pedra amassa tesoura;* Tesoura corta papel;* Papel embrulha pedra
 */
package ExerciciosSwitch1;

import java.util.Random;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        // 1 - papel; 2 - pedra; 3 - tesoura.
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        int numeroUsuario;
        int escolhaComputador;

        numeroUsuario = leitor.nextInt();
        escolhaComputador = gerador.nextInt(3) + 1;//gerar um numero entre 1 e 3.
        // imprimir escolha do computador.
        switch (escolhaComputador) {
            case 1:
                System.out.println("Computador escolheu papel");
                break;
            case 2:
                System.out.println("Computador escolheu pedra");
                break;
            case 3:
                System.out.println("Computador escolheu tesoura");
                break;
        }
        // imprimir escolha do usuario.

        switch (numeroUsuario) {
            case 1:
                System.out.println("Usuario escolheu papel");
                break;
            case 2:
                System.out.println("Usuario escolheu pedra");
                break;
            case 3:
                System.out.println("Usuario escolheu tesoura");
                break;
        }
        // verificar resultado

        if (numeroUsuario == escolhaComputador) {
            System.out.println("Empate.");
        } else if ((numeroUsuario - escolhaComputador) == -1
                || (numeroUsuario - escolhaComputador) == 2) {
            System.out.println("Usuario Vencedor.");
        } else {
            System.out.println("Computador Vencedor.");
        }

    }

}
