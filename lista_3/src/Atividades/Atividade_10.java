package Atividades;
/*
10. Crie um algoritmo que ajude o DETRAN a calcular o total de recursos que foram
arrecadados com a aplicação de multas de trânsito. O algoritmo deve ler as seguintes
informações para 20 motoristas:
• número da carteira de motorista (número inteiro de 4 dígitos);
• número de multas do motorista;
• valor total da multa. (Considerando que todas as multas de um motorista tem o
mesmo valor).
Ao final da leitura, deve-se apresentar o total de recursos arrecadados (somatório das
multas de todos motoristas). O algoritmo deverá mostrar também o número da carteira
do motorista que obteve o maior número de multas.

 */

import java.util.Random;

public class Atividade_10 {
    public void executar() {
        Random r = new Random();
        int numeroCarteira;
        int numeroMultas = 0;
        int maiorNumeroMulta = 0;
        int maiorInfrator = 0;
        double soma = 0.0;
        double valorMulta;

        for (int i = 0; i <= 20; i++) {
            numeroCarteira = r.nextInt(1000, 9999);
            numeroMultas = r.nextInt(0, 100);
            valorMulta = r.nextDouble(100.0, 1000.0);

            soma = soma + valorMulta;

            if (numeroMultas > maiorNumeroMulta) {
                maiorNumeroMulta = numeroMultas;
                maiorInfrator = numeroCarteira;
            }
            System.out.println("Numero Carteira: "+ numeroCarteira+" - Número de Multas: "+ numeroMultas+ " - Valor da Multa: "+valorMulta);
        }
        System.out.println("***************************************");
        System.out.printf("Recursos total arrecadados das multas: R$%.2f \n", soma);
        System.out.println("A numero da carteira do motorista com maior numero de multas: " + maiorInfrator);
    }
}