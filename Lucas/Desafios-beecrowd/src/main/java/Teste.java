import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Scanner leitura2 = new Scanner(System.in);

//        System.out.println("Quantas listas você quer?");
//        int numeroDeVezes = leitura.nextInt();
//
//
//        List<Integer> list = new ArrayList<>();
//
//        int numeroParaColocarNaLista = leitura2.nextInt();
//
//        for (int i = 1; i < numeroDeVezes; i++) {
//            list.add(numeroParaColocarNaLista);
//        }

        listTeste(2, 3);

    }

    private static void listTeste(int qtdJogadores, int number){
        List<Integer> list = new ;

        list.add(number);
        list.add(number);
        list.add(number);
        System.out.println(list);
    }
}
