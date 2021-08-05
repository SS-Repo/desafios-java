package santander.bootcamp.dio.seisnumerosimpares;

import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {

        /*
        Leia um valor inteiro X.
        Em seguida apresente os 6 valores ímpares consecutivos a partir de X,
        um valor por linha, inclusive o X se for o caso.
        */

        Scanner s = new Scanner(System.in);
        int x;
        int cont;

        System.out.println("Digite um numero:");
        x = s.nextInt();
        cont = 0;

        if( x >= 0 ){
            while (cont < 6 ) {
                if ( x % 2 == 1 ) {
                    System.out.println( x );
                    cont++;
                }
                x++;
            }
        }
    }
}
