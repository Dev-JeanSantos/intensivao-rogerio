package Atividades;/*
4. Escrever um algoritmo que leia um valor numérico inteiro. Após, escreva uma tabela com
cabeçalho, contendo o valor, seu dobro e seu triplo. Mostrar para todos valores entre
o valor informado ao numero 1. Por exemplo, digamos que o número informado seja 20, deve-se
apresentar na tela:
 */

import java.util.Random;

public class Atividade_4 {
    public void executar() {
        Random r = new Random();
        int valor = r.nextInt(1, 50);
        System.out.println("Valor  Dobro  Triplo");
        for (int i = valor; i >= 1; i--) {
            System.out.println("  " + valor + "     " + valor * 2 + "     " + valor * 3);
            valor --;
        }
    }
}
