package Atividades;
/*
6. Construa um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma
classe. O algoritmo deverá ler, além das notas, o código (de três dígitos) do aluno e deverá
ser encerrado quando o código for igual a zero
 */

import java.util.Random;

public class Atividade_6 {
    public void executar() {
        Random r = new Random();

        int codigo = r.nextInt(1, 10);
        for (int i = codigo; i >= 0; i--) {
            double nota1 = r.nextDouble(0.d, 10.d);
            double nota2 = r.nextDouble(0.d, 10.d);
            double nota3 = r.nextDouble(0.d, 10.d);
            double media = (nota1 + nota2 + nota3) / 3;
            System.out.printf("A média das 03 Notas: %.1f \n" , media );
        }
    }
}
