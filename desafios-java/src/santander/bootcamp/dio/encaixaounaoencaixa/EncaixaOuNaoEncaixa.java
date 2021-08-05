package santander.bootcamp.dio.encaixaounaoencaixa;

import java.util.Scanner;

public class EncaixaOuNaoEncaixa {
    public static void main(String[] args) {
       /*
       * Paulinho tem em suas mãos um novo problema.
       * Agora a sua professora lhe pediu que construísse um programa para verificar,
       * à partir de dois valores muito grandes A e B, se B corresponde aos últimos dígitos de A.
       * */

        Scanner leitor = new Scanner(System.in);
        System.out.println("Numero de testes:");
        int N = Integer.parseInt(leitor.nextLine());

        for (int i = 0; i < N; i++) {
            System.out.println("Teste A:");
            String n1 = leitor.next();
            System.out.println("Teste B:");
            String n2 = leitor.next();
            Boolean AmaiorB = ( n1.length() >= n2.length());
            String partefinal =  AmaiorB ? n1.substring((n1.length() - n2.length()), n1.length()) : "";

            if (partefinal.equals(n2))
                System.out.println("encaixa");
            else
                System.out.println("nao encaixa");
        }
    }
}
