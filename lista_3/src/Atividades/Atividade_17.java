package Atividades;

/*

17. Construa um algoritmo que mostre na tela:
*****
****
***
**
*

 */
public class Atividade_17 {

    public void executar() {

        String coringa = "*";

        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf(coringa);
            }
            System.out.println("");
        }
    }
}