package bricksGame;

import java.util.Arrays;
import java.util.Scanner;

public class BricksGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = scanner2.nextInt();

            if (N > 1 && N <= 10){
                int[] ages = new int[N];

                System.out.println(Arrays.toString(ages));

                for (int j = 0; j < 5; j++) {
                    ages[j] = scanner.nextInt();
                }

                System.out.println(Arrays.toString(ages));

                int captainI = N / 2;
                int captainAge = ages[captainI];

                System.out.println("Case " + i + ": " + captainAge);
            }else{
                break;
            }
        }
    }
}
