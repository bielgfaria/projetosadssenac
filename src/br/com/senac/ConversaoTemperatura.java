/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac;

/**
 * sout = system.out.print 
 * ctrl+espaço completa a variavel ex:cel vira celsius automatico
 * ctrl + x = apaga a linha.
 *
 * @author Alunos
 */
public class ConversaoTemperatura {

    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = 9 * celsius / 5 + 32;
        String mensagem = "Resposta: " + celsius + "C° é igual a " + fahrenheit + "°F. ";
        System.out.print(mensagem);

    }
}
