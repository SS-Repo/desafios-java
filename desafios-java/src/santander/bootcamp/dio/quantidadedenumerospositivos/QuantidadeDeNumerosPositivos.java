package santander.bootcamp.dio.quantidadedenumerospositivos;

import java.util.Scanner;

public class QuantidadeDeNumerosPositivos {
    public static void main(String[] args) {
        /*
        * Crie um programa que leia 6 valores.
        *  Você poderá receber valores negativos e/ou positivos como entrada,
        * devendo desconsiderar os valores nulos.
        * Em seguida, apresente a quantidade de valores positivos digitados.
        */
        Scanner s = new Scanner(System.in);
        int cont = 0;
        int index = 1;
        int contPares = 0;

        while ( cont < 6 ) {
            System.out.println("Digite 6 numeros positivos ou negativos - " + "[" + index + "]:");
            double x = s.nextDouble();
            if ( x > 0.0 ){
                contPares++;
            }
            cont++;
            index++;
        }
        System.out.println(contPares + " valores positivos" );
    }
}
