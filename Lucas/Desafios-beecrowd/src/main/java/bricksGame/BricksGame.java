package bricksGame;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BricksGame {

    public static void main(String[] args) {
        List<Integer> listAges = Arrays.asList(5, 19, 17, 16, 14, 12);

        int age = captainAge(listAges);
        System.out.println("Idade do capitão: " + age);
    }

    public static int captainAge(List<Integer> ages){
        int captainAge = 0;

        for (int i = 12; i <= 19; i++) {
            int young = 0;
            int older = 0;

            for (int playerAge : ages){
                if (playerAge < i){
                    young++;
                }else if (playerAge > i) {
                    older++;
                }
            }

            if (young == older){
                captainAge = i + 1;
                break;
            }
        }
        return captainAge;
    }
}
