package santander.bootcamp.dio.visitanafeira;

import java.io.IOException;
import java.util.Scanner;

public class VisitaNaFeira {
    public static void main(String[] args) throws IOException {

        /*
        Você está na feira com a sua sacola e parou em uma banca.
        O feirante lhe entregou pimentões amarelos e vermelhos.
        Agora iremos somar os pimetões amarelos e vermelhos para descobrir o total de pimentões na sacola.
        Você receberá 2 inteiros que devem ser lidos e armazenados nas variáveis A (pimentões amarelos) e
        B (pimentões vermelhos).
        Faça a soma de A e B atribuindo o seu resultado na variável X (total de pimentões).
        Apresente X como descrito na mensagem de exemplo abaixo.
        Não apresente outra mensagem além da mensagem especificada.
        */

        int a;
        int b;
        int total;

        Scanner s = new Scanner(System.in);
        System.out.println("Numero de pimentões amarelo:");
        a = s.nextInt();

        System.out.println("Numero de pimentões vermelhos");
        b = s.nextInt();

        total = a + b;
        System.out.println("X = " + total);
    }
}
