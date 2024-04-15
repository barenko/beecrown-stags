package bricksGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BricksGame {

    public static void main(String[] args) {
        List<Integer> listAges = Arrays.asList(5, 19, 17, 16, 14, 12);

        int age = captainAge(listAges);
    }

    public static int captainAge(List<Integer> ages){
        int captainAge = 0;
        for (int i = 1; i < 10; i++) {

            for (int j = 12; j <= 19; j++) {
                int young = 0;
                int older = 0;

                for (int playerAge : ages) {
                    if (playerAge < j) {
                        young++;
                    } else if (playerAge > j) {
                        older++;
                    }
                }

                if (young == older) {
                    captainAge = j + 1;
                    System.out.println("Case " + i + ": " + captainAge);
                    break;
                }
            }
        }
        return captainAge;
    }


    private void listTeste(int qtdList, int number){
        for (int i = 0; i < qtdList; i++) {
            List<Integer> list = new ArrayList<>();
            
            list.add(number);
        }
    }
}
