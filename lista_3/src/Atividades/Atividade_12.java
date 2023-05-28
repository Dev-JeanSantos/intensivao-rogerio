package Atividades;
/*
12. Faça um algoritmo que leia 20 números inteiros e positivos e calcule o produto dos números
pares e o somatório dos ímpares.
Além disso, deve-se verificar a quantidade de pares e ímpares informados.
O algoritmo não poderá aceitar valores negativos.
O fim da leitura será indicado pelo número 0.
 */

import java.util.Random;

public class Atividade_12 {
    public void executar() {
        Random r = new Random();
        int numeros = 0;
        boolean numero;
        int par = 0;
        int impar = 0;
        int produto = 1;
        int soma = 0;
        int count = 0;

        for (int i = 0; i <= 20; i++) {

            numeros = r.nextInt(1, 11);

            numero = numeros % 2 == 0;
            if (numero) {
                count++;
                par = numeros;
                produto *= par;
                System.out.print("par: " + par + "\n");
            } else {
                impar = numeros;
                soma = soma + impar;
                System.out.print("impar: " + impar + "\n");
            }
        }
        System.out.print("Multiplicação Par: " + produto + "\n");
        System.out.print("Soma Impar: " + soma + "\n");
        System.out.printf("Quantidade de Pares: " + count + "\n");
        System.out.printf("Quantidade de Impares: " + (20 - count) +  "\n");
    }
}