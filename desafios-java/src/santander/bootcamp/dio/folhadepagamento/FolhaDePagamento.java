package santander.bootcamp.dio.folhadepagamento;

import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        /*
        Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores,
        porém temos apenas a quantidade de horas trabalhadas e o valor hora.
        Escreva um programa que leia o número de um colaborador,
        seu número de horas trabalhadas,
        o valor que recebe por hora e calcula o salário desse colaborador.
        Em seguida, apresente o número e o salário do colaborador, com duas casas decimais.
        * */

        Scanner s = new Scanner(System.in);

        System.out.println("ID do colaborador:");
        int valor1 =  s.nextInt();

        System.out.println("Horas trabalhadoas:");
        int valor2 = s.nextInt();

        System.out.println("Valor da hora trabalhada:");
        double valor3 = s.nextDouble();

        double salary = valor2 * valor3;
        System.out.println("NUMBER = " + valor1);
        System.out.printf("SALARY = U$ %.2f", salary);
    }
}
