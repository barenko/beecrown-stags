package restaurant;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Restaurant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantidade de casos: ");
        int N = scanner.nextInt();

        int R = 35;

        int L = 20;
        int A = 70;

        for (int i = 0; i < N; i++) {
            Boolean fits = fits_on(R, L, A);
            if (fits){
                System.out.println("Cabe dentro do círculo.");
            }else{
                System.out.println("Não cabe dentro do círculo.");
            }
        }
                System.out.println(0);
    }

    private static Boolean fits_on(int R, int L, int A){
        Double oppsiteSide = pow(((double) A / 2), 2);
        Double adjacentSide = pow(((double) L / 2), 2);

        double hypotenuse = sqrt(adjacentSide + oppsiteSide);

        return R >= hypotenuse;
    }
}
