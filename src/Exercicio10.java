/*
 Um professor deseja fazer a média da sua turma. Crie um programa que solicite ao usuário qual a quantidade de alunos,
em seguida solicite as notas dos alunos e ao final apresente a média da turma.
 */
package br.com.senac;

import java.util.Scanner;

/**
 *
 * @author 55489
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        int reg1 = 0;
        int reg2 = 1;
        System.out.println("QUAL A QUANTIDADE DE ALUNOS ?: ");
        int qtdalunos = num1.nextInt();  
        int nota = num1.nextInt();
        while (reg2 <= 5) {
        System.out.println("ESCREVA A NOTA DO ALUNO: ");       
        reg1 += nota;
            reg2++;        
    }
}
}
    
        
        
    
