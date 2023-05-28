package Atividades;

import java.util.Scanner;

/*
15. Elabore um algoritmo que, utilizando estruturas de repetição aninhadas, apresente na tela
as tabuadas de multiplicação e divisão dos números de 1 a 9.
 */
public class Atividade_15 {

    public void executar() {

        int numero1 = 1;
        int numero2 = 0;
        int resultadoMultiplicao = 0;
        double resultadoDivisao = 0.0;
        boolean multiplicacao = false;
        boolean divisao = false;
        int count = 1;

        if (multiplicacao == false) {
            for (int i = 1; i < 10; i++) {
                System.out.println("Multiplicação do " + i);
                for (int j = 1; j < 10; j++) {
                    resultadoMultiplicao = i * j;
                    System.out.println(" " + i + " X " + j + " = " + resultadoMultiplicao);
                }
            }
            multiplicacao = true;
            if (divisao == false) {
                for (int i = 1; i < 10; i++) {
                    System.out.println("Divisão do " + i);
                    for (int j = 1; j < 10; j++) {
                        resultadoDivisao = i / j;
                        System.out.printf(" " + i + " / " + j + " = %.1f\n", resultadoDivisao);
                    }
                }
            }
        }
    }
}