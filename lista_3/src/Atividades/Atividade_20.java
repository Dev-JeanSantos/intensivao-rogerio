package Atividades;

import java.util.Random;

/*

20. Faça um algoritmo que leia um inteiro n e imprima um tabuleiro de xadrez ou damas com
lado n. Represente casas pretas por um "X"e casas brancas por um "O". Ex: n = 4
O X O X
X O X O
O X O X
X O X O

 */
public class Atividade_20 {

    Random rdn = new Random();
    int count1 = 0;
    int count2 = 0;
    //    int y = rdn.nextInt(1, 10);
    int y = 4;

    public void executar() {
        System.out.println("");
        for (int i = 0; i <= y; i++) {
            count1 += 1;
            if (count1 % 2 == 0) {
                System.out.print("X");
            } else {
                System.out.print("O");
            }
            for (int j = 0; j < y; j++) {
                count2 += 1;
                if (count2 % 2 == 0) {
                    System.out.print("O");
                } else {
                    System.out.print("X");
                }
            }
            if (y % 2 == 0) {
                count2--;
            }
            System.out.println("");
        }
    }
}