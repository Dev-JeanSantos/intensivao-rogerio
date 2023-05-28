package Atividades;

import java.util.Random;

/*

21. Faça um algoritmo que leia um inteiro n e imprima um triângulo com altura n. Ex: n = 5
*
***
*****
*******
*********

 */
public class Atividade_21 {


    public void executar() {
        Random rdn = new Random();
        int altura = rdn.nextInt(1, 10);
        System.out.println("tamanho da piramide: "+ altura);
        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}