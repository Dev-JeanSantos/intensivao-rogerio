package Atividades;

/*

19. Construa um algoritmo que mostre a palavra IOIO na tela, veja a saida abaixo:
**** **** **** **** 12
** * * ** * *
** * * ** * *
**** **** **** **** 12

 */
public class Atividade_19 {

    public void executar() {

        String coringa = "*";
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i <= 4; i++) {
            count2 += 1;
            if (count2 == 2 || count2 == 3) {
                System.out.print(" ");
            } else {
                System.out.print(coringa);
            }
            for (int j = 1; j <= 21; j++) {
                count1 += 1;
                if (       count1 == 4  || count1 == 5  || count1 == 10 || count1 == 11 || count1 == 16
                        || count1 == 17 || count1 == 24 || count1 == 25 || count1 == 26 || count1 == 28
                        || count1 == 29 || count1 == 31 || count1 == 32 || count1 == 33 || count1 == 36
                        || count1 == 37 || count1 == 38 || count1 == 40 || count1 == 41 || count1 == 45
                        || count1 == 46 || count1 == 47 || count1 == 49 || count1 == 50 || count1 == 52
                        || count1 == 53 || count1 == 54 || count1 == 57 || count1 == 58 || count1 == 59
                        || count1 == 61 || count1 == 62 || count1 == 67 || count1 == 68
                        || count1 == 73 || count1 == 74 || count1 == 79 || count1 == 80) {
                    System.out.print(" ");
                } else {
                    System.out.print(coringa);
                }
            }
            System.out.println(" ");
        }
    }
}