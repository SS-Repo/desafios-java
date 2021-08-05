package santander.bootcamp.dio.analisedenumeros;

import java.util.Scanner;

public class AnaliseDeNumeros {
    public static void main(String[] args) {
        /*
        Você deve fazer a leitura de 5 valores inteiros.
        Em seguida mostre quantos valores informados são pares,
        quantos valores informados são ímpares,
        quantos valores informados são positivos e quantos valores informados são negativos.
        * */

        Scanner leitor = new Scanner(System.in);

        int []num = new int[5];
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0 ;

        for (int i = 0; i < num.length; i++) {
            System.out.println("digite 5 numeros - " + "[" + i + "]" + ":");
            num[i] = leitor.nextInt();

            if (num[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            if(num[i]>0){
                positivo++;

            }
            if(num[i]<0){
                negativo++;
            }
        }

        System.out.println(" " + par + " valor(es) par(es)");
        System.out.println(" " + impar + " valor(es) impar(es)");
        System.out.println(" " + positivo + " valor(es) positivo(s)");
        System.out.println(" " + negativo + " valor(es) negativo(s)");
    }
}
