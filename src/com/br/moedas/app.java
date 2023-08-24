package com.br.moedas;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int opcao;

        System.out.print("Informe a cotação do dolar: ");
        String valorCotacao = scn.nextLine();
        moedas cotacao = new moedas(valorCotacao);


        System.out.print("Informe o valor a ser convertido: ");
        String valorConverter = scn.nextLine();
        moedas valor = new moedas(valorConverter);

        System.out.println("\n1. Converter valor de Real para Dolar.");
        System.out.println("2. Converter valor de Dolar para Real.");
        System.out.print("Informe uma das opções: ");
        opcao = Integer.parseInt(scn.nextLine());

        String resultado;
        switch (opcao) {
            case 1 -> resultado = valor.converterParaDolar(cotacao.getValor());
            case 2 -> resultado = valor.converterParaReal(cotacao.getValor());
            default -> {
                System.out.println("Opção Invalida!!");
                return;
            }
        }
        System.out.println("O valor é: " + resultado);
    }

}