package br.com.senac;

public class calculandoImc {

    public static void main(String[] args) {
        double peso = 81.0;
        double altura = 1.75;
        double imc = peso / (altura * altura);
        System.out.println("Resultado:" + imc);

    }

}
