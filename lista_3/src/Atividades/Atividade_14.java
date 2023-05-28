package Atividades;

import java.util.Random;

/*
14. Em uma eleição presidencial existem quatro candidatos. Os votos são informados por
meio de um código (representando os candidatos). Os códigos utilizados são:
1- João
2- Maria
3- Pedro
4- Marcos
5- Nulo
6- Em branco
Escreva um algoritmo que calcule e mostre:
a) O total de votos para cada candidato;
b) O total de votos nulos;
c) O total de votos em branco;
d) O percentual de nulos em relação ao total de votos;
e) O percentual de brancos em relação ao total de votos.
 */
public class Atividade_14 {

    Random random = new Random();

    public void executar() {
        int total_votos = random.nextInt(1000000,10000000);
        int codigo = 0;
        int joao = 0;
        int maria = 0;
        int pedro = 0;
        int marcos = 0;
        int nulo = 0;
        int branco = 0;


        for (int i = total_votos; i > 0; i--) {

            codigo = random.nextInt(1, 7);

            switch (codigo) {
                case 1:
                    joao++;
                    break;
                case 2:
                    maria++;
                    break;
                case 3:
                    pedro++;
                    break;
                case 4:
                    marcos++;
                    break;
                case 5:
                    nulo++;
                    break;
                case 6:
                    branco++;
                    break;
                default:
                    System.out.println("Cogio Inválido");
            }
        }
        System.out.println("Resultado da Votação");
        System.out.println("Total de Votos Apurados "+total_votos);
        System.out.println("Votos do JOÂO: "+ joao);
        System.out.println("Votos do MARIA: "+ maria);
        System.out.println("Votos do PEDRO: "+ pedro);
        System.out.println("Votos do MARCOS: "+ marcos);
        System.out.println("Votos do BRANCOS: "+ branco);
        System.out.println("Votos do NULOS: "+ nulo);

        System.out.println("Percentual de Votos NULOS: "+ (nulo * 100)/total_votos +"%");
        System.out.println("Percentual de Votos BRANCOS: "+ (branco * 100)/total_votos +"%");


    }
}