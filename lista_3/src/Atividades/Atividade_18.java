package Atividades;

/*

18. Construa um algoritmo que mostre quatro zeros na tela, veja a saída abaixo:
***** ***** ***** *****
* * * * * * * *
* * * * * * * *
***** ***** ***** *****

 */
public class Atividade_18 {

    public void executar() {

        String coringa = "*";
        int cont = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print(coringa);
            for (int j = 1; j <= 21; j++) {
                cont += 1;
                if (cont == 4 || cont == 5 || cont == 10 || cont == 43
                        || cont == 11 || cont == 16 || cont == 17 || cont == 22
                        || cont == 23 || cont == 25 || cont == 26 || cont == 28
                        || cont == 29 || cont == 31 || cont == 32 || cont == 34
                        || cont == 35 || cont == 37 || cont == 38 || cont == 40
                        || cont == 41 || cont == 44 || cont == 46 || cont == 47
                        || cont == 49 || cont == 50 || cont == 52 || cont == 53
                        || cont == 55 || cont == 56 || cont == 58 || cont == 59
                        || cont == 61 || cont == 62 || cont == 67 || cont == 68
                        || cont == 73 || cont == 74 || cont == 79 || cont == 80) {
                    System.out.print(" ");
                }else {
                    System.out.print(coringa);
                }
            }
            System.out.println(" ");
        }
    }
}