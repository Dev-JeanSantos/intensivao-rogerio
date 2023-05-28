package Atividades;
/*
7. Elabore um algoritmo que leia a medida em metros da frente e lateral de um número
indeterminado de terrenos. O algoritmo deverá calcular e mostrar a área do terreno.
Deverá parar somente quando área de um terreno for inferior a 100 metros quadrados.
(Suponha que a área é um retângulo regular).
 */

import java.util.Random;

public class Atividade_7 {
    public void executar() {
        Random r = new Random();
        int base, altura, area;
        do {
            base = r.nextInt(1, 500);
            altura = r.nextInt(1, 500);
            area = base * altura;
            System.out.println("Base: " + base + " Altura: " + altura + " Area: " + area);
        }
        while (area >= 100.0);
        System.out.println("Inferior a 100 Metros   ↑↑↑");
    }
}
