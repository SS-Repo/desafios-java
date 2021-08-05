package santander.bootcamp.dio.acorridadetartarugas;

import java.util.*;

public class ACorridaDeTartarugas {
    public static void main(String[] args) {
        /*
        *A corrida de tartarugas é um esporte que cresceu muito nos últimos anos,
        * fazendo com que vários competidores se dediquem a capturar tartarugas rápidas,
        * e treina-las para faturar milhões em corridas pelo mundo.
        * Porém a tarefa de capturar tartarugas não é uma tarefa muito fácil,
        * pois quase todos esses répteis são bem lentos. Cada tartaruga é classificada em um nível
        * dependendo de sua velocidade:

          Nível 1: Se a velocidade é menor que 10 cm/h .
          Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
          Nível 3: Se a velocidade é maior ou igual a 20 cm/h .

          Sua tarefa é identificar qual o nível de velocidade da tartaruga mais veloz de um grupo.
        */

        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);
        int turtle;

        System.out.println("Digite o numero de tartarugas:");

        while(sc.hasNext()){

            turtle = Integer.parseInt(sc.nextLine());

            List<Integer> listTurtle = new ArrayList<>();

            String[] turtleTime = new String[turtle];

            System.out.println("Digite a velocidade das tartarugas do grupo:");
            String aux = sc.nextLine();

            turtleTime = aux.split(" ");

            for(int i=0 ; i<turtle ; i++){
                listTurtle.add(Integer.parseInt(turtleTime[i]));
            }

            Collections.sort(listTurtle);

            Collections.reverse(listTurtle);

            if(listTurtle.get(0)>=20) System.out.println("3");

            else if(listTurtle.get(0)<20 && listTurtle.get(0)>=10) System.out.println("2");

            else System.out.println("1");
        }
        sc.close();
    }
}
