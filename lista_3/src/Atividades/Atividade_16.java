package Atividades;

/*

16. Construa um algoritmo que mostre na tela:
*
**
***
****
*****

 */
public class Atividade_16 {

    public void executar() {
        String coringa = "*";

        for (int x = 1; x <= 5; x++) {
            for (int j = 1; j <= x ; j++) {
                System.out.print(coringa);
            }
            System.out.println("");
        }
    }
}