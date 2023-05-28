package Atividades;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
13 - Foi realizada uma pesquisa entre os habitantes de uma região. Sendo assim, foram coletados
os dados de idade, sexo (M/F) e salário. Encerre a entrada de dados quando for digitada
uma idade zero. Faça um algoritmo que informe:
a) A media de salário dos homens;
b) A media de salário das mulheres;
c) A media de salário do grupo;
d) O homem mais velho;
e) A mulher mais nova.
 */
public class Atividade_13 {

    public void executar() {
        Random rd = new Random();
        Scanner scn = new Scanner(System.in);

        int numeroPessoas = rd.nextInt(1, 11);
        int idade = 0;
        String sexo = " ";
        List<String> sexos = Arrays.asList("M", "F");
        double salario = 0d;
        double salarios = 0d;
        double salariosHomens = 0d;
        double salariosmulheres = 0d;
        int countHomen = 0;
        int countMulher = 0;
        int idadeMaior = 0;
        int idadeMenor = 0;
        boolean valida = false;

        System.out.println("Idade - Sexo - Salario");
        for (int i = numeroPessoas; i >= 0 ; i--) {
            idade = rd.nextInt(10, 90);
            sexo = sexos.get(rd.nextInt(0,2));
            salario = rd.nextDouble(1200d, 15000d);
            salarios+= salario;

            System.out.printf(" "+idade + "   -  " + sexo + "   -  %.2f\n", salario );

            if (sexo == "M") {
                countHomen++;
                salariosHomens = salariosHomens + salario;
            }else{
                countMulher++;
                salariosmulheres = salariosmulheres + salario ;
            }

            if ( valida == false) {
                idadeMaior = idade;
                idadeMenor = idade;
            }
            
            valida = true;
            
            if (sexo == "M" && idade > idadeMaior){
                idadeMaior = idade;
            }

            if (sexo == "F" && idade < idadeMenor){
                idadeMenor = idade;
            }
        }
        System.out.printf("Item a) Média de salarios dos homens: R$%.2f\n", salariosHomens/countHomen);
        System.out.printf("Item b) Média de salarios das mulheres: R$%.2f\n", salariosmulheres/countMulher);
        System.out.printf("Item c) Média salarial do grupo: R$%.2f\n", salarios / numeroPessoas);
        System.out.printf("Item d) A idade do homem mais velho: %d\n", idadeMaior, " anos");
        System.out.printf("Item d) A idade do mulher mais jovem: %d\n", idadeMenor, " anos");
    }
}