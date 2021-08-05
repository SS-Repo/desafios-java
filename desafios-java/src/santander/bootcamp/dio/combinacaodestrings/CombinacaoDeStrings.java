package santander.bootcamp.dio.combinacaodestrings;

import java.util.Scanner;

public class CombinacaoDeStrings {
    public static void main(String[] args) {
        /*
        Crie um algoritmo que receba dois inputs que sejam strings e
        combine-as alternando as letras de cada string.

        Deve começar pela primeira letra da primeira string,
        seguido pela primeira letra da segunda string,
        em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.

        As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.
        * */

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero de cadeia de Strings:");
        int n = Integer.parseInt(leitor.nextLine());

        for (int i = 0; i < n; i++) {

            StringBuilder concat = new StringBuilder();
            System.out.println("Digite as letras para serem concatenadas:");
            String[] palavras = leitor.nextLine().split(" ");

            int maxSize = Math.max(
                    palavras[0].length(),
                    palavras[1].length());

            for (int dados=0; dados < maxSize  ; dados++) {
                if(dados < palavras[0].length()) {

                    concat.append(palavras[0].charAt(dados));
                }

                if(dados < palavras[1].length()) {

                    concat.append(palavras[1].charAt(dados));
                }
            }
            System.out.println(concat.toString());
        }
    }
}
