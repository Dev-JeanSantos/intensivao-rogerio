package Atividades;/*
3. Crie um algoritmo que leia um determinado número e apresente na tela a tabuada da
divisão deste número. Por exemplo, digamos que o número informado foi 5, o programa
devera apresentar na tela:
5 ÷ 5 = 1
10 ÷ 5 = 2
15 ÷ 5 = 3
...
50 ÷ 5 = 10
 */

import java.util.Random;

public class Atividade_3 {
    public void executar(){
        Random r = new Random();
        int valor = r.nextInt(1,10);
        System.out.println("Tabuada de Divisão");
        for (int i = valor; i <= 50; i+=valor) {
            System.out.println("    "+i+ " ÷ "+valor+" = "+ i / valor);
        }
    }
}
