package santander.bootcamp.dio.contagemdecedulas;

import java.util.Scanner;

public class ContagemDeCedulas {
    public static void main(String[] args) {
        /*
        Faça a leitura de um valor inteiro.
        Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto.
        As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
         Na sequência mostre o valor lido e a relação de notas necessárias.
        * */

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite valor:$");
        Integer notasInseridas = leitor.nextInt();
        int pagamento;
        int[] notas = new int[]{100,50,20,10,5,2,1};
        int[] totalNotas = new int[7];

        if(notasInseridas > 0){
            pagamento = notasInseridas;

            for(int i=0;i<7;i++){
                if(pagamento>=notas[i]){
                    totalNotas[i]=pagamento/notas[i];
                    pagamento=pagamento-totalNotas[i]*notas[i];
                }
            }
            System.out.println("" + notasInseridas);

            for(int i=0;i<7;i++){
                System.out.println(totalNotas[i] + " nota(s) de R$ " + notas[i] +",00");
            }
        }
    }
}
