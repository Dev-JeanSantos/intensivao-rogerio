package Atividades;
/*
11. Elaborar um algoritmo que leia os limites inferior e superior de um intervalo e mostre
todos os números pares no intervalo, bem como, o somatório dos pares. Suponha que os
números digitados são um intervalo crescente. Exemplo:
    • Limite inferior: 3
    • Limite superior: 12
    • Pares: 4 6 8 10
    • Soma dos pares: 28
 */

import java.util.Random;

public class Atividade_11 {
    public void executar() {
        Random r = new Random();
        int limiteInferior = r.nextInt(0, 10);
        int limiteSuperior = r.nextInt(11, 30);
        int par = 0;
        int soma = 0;
        System.out.println("Limite Inferior: " + limiteInferior + " - Limite Superior: " + limiteSuperior);
        for (int i = limiteInferior; i <= limiteSuperior; i++) {

            if (limiteInferior % 2 == 0) {
                par = limiteInferior;
                soma = soma + par;
                System.out.print("Par: " + par + "\n");
            }
            limiteInferior++;
        }
        System.out.printf("Soma dos Pares: " + soma + "\n");
    }
}