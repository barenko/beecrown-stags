package restaurant;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (true) {
            int R = scanner.nextInt();

            if (R == 0) {
                break;
            }

            i++;
            int W = scanner.nextInt();
            int L = scanner.nextInt();

            double diagonal = Math.sqrt(W * W + L * L);

            double diameter = 2.0 * R;


            if (diagonal <= diameter) {
                System.out.println("Pizza " + i + " fits on the table.");
            } else {
                System.out.println("Pizza " + i + " does not fit on the table.");
            }
        }
        scanner.close();
    }
}
