package Atividades;/*
1. Escreva um algoritmo que leia dez valores numéricos inteiros e apresente na tela o somatório
dos valores.
 */

import java.util.Random;

public class Atividade_1 {
    public void executar(){
        Random r = new Random();
        int valor = 0;
        for (int i = 0; i < 10; i++) {
            valor = r.nextInt(0,100);
            valor += valor;
        }
        System.out.println("Somatorio dos valores: "+ valor);
    }
}
