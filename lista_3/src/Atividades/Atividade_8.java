package Atividades;
/*
8. Escreva um algoritmo que leia 50 valores e encontre o maior e o menor. Mostre o resultado
 */

import java.util.Random;

public class Atividade_8 {
    public void executar() {
        Random r = new Random();
        int valor = 0, maior = 0, menor = 0, cont = 0;
        boolean leitura = true;


        while (cont <= 50) {
            cont++;
            valor = r.nextInt(0, 100);
            System.out.println("Valor: " + valor);
            if (leitura == true) {
                maior = valor;
                menor = valor;
            }

            leitura = false;

            if(valor > maior ){
                maior = valor;
            }

            if(valor < menor){
                menor = valor;
            }
        }
        System.out.println("*************");
        System.out.println("Maior: "+ maior);
        System.out.println("Menor: "+ menor);
    }
}
