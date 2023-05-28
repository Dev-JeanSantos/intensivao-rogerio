package Atividades;
/*
5. Chico tem 1,50 metros e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e
cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos
serão necessários para que Zé seja maior que Chico.
 */

public class Atividade_5 {
    public void executar() {
        double chico = 150;
        double ze = 110;
        int anos = 0;
        while (chico > ze) {
            anos++;
            chico += 2;
            ze += 3;
        }
        System.out.println("Ze ultrapassou a altura do Chico após: "+ anos+ " Anos");
    }
}
