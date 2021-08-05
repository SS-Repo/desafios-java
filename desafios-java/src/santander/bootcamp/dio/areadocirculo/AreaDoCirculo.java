package santander.bootcamp.dio.areadocirculo;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        /*
        A fórmula para calcular a área de uma circunferência é: area = π . raio2.
        Considerando para este problema que π = 3.14159:
        Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
        * */

        Scanner s = new Scanner(System.in);
        Double A;
        Double area;

        System.out.println("Digite o numero da area do circulo a ser calculada:");
        A = s.nextDouble();

        area = 3.14159 * (Math.pow(A,2));

        System.out.printf("A=%.4f\n", area);
    }
}
