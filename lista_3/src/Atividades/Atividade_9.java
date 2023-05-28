package Atividades;
/*
9. Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
a) A quantidade de pessoas com idade superior a 50 anos;
b) média das alturas das pessoas com idade entre 10 e 20 anos;
c) A porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.
 */

import java.util.Random;

public class Atividade_9 {
    public void executar() {
        Random r = new Random();
        double altura = 0.0, peso = 0.0, mediaAltura = 0.0;
        int idade = 0, somaIdade= 0, porcentagemPessoas = 0;
        int contAltura = 0;
        int contPeso = 0;

        for (int i = 0; i <= 10; i++) {
            idade = r.nextInt(0, 100);
            altura = r.nextDouble(0.8, 2.2);
            peso = r.nextDouble(30.0, 200.0);

            if (idade > 50) {
                somaIdade++;
            }

            if (idade >= 10 && idade <= 20) {
                contAltura++;
                mediaAltura = (mediaAltura + altura)/contAltura;
            }

            if (peso < 100) {
                contPeso++;
                porcentagemPessoas = (contPeso  * 30) / 10;
            }
            System.out.println(idade +" "+altura+" "+ peso);
        }

        System.out.println("Pessoas com idade superior a 50 anos: "+ somaIdade);
        System.out.printf("O número de pessoas com idade entre 10 e 20 anos: "+contAltura+ ". A média de suas alturas: %.1f \n", mediaAltura);
        System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos: "+ porcentagemPessoas+ "%");

    }
}