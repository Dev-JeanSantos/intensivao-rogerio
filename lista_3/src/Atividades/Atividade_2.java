package Atividades;/*
2. Elabore um algoritmo que leia um determinado número e apresente na tela a tabuada
de multiplicação deste número. Por exemplo, digamos que o número informado foi 2, o
programa deverá apresentar na tela:
1 × 2 = 2
2 × 2 = 4
3 × 2 = 6
...
10 × 2 = 20

 */

import java.util.Random;

public class Atividade_2 {
    public void executar(){
        Random r = new Random();
        int valor = r.nextInt(0,100);;
        System.out.println("Tabuada de Multitplicação");
        for (int i = 0; i <= 10; i++) {
            System.out.println("    "+i + " X "+valor+" = "+ i*valor);
        }
    }
}
