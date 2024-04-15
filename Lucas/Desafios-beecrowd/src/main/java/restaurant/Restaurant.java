package restaurant;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Restaurant {
    public static void main(String[] args) {


        List<Integer> R = Arrays.asList(38, 35, 50, 38, 70);
        List<Integer> L = Arrays.asList(40, 20, 60, 40, 20);
        List<Integer> A = Arrays.asList(60, 70, 80, 60, 90);

        for (int i = 0; i < R.size(); i++) {

            int rAtual = 0;
            int aAtual = 0;
            int lAtual = 0;
            boolean fits = false;

            if (i == 0){
                for (int j = 0; j < 1; j++) {
                    rAtual = R.get(i);
                    System.out.println(rAtual);
                    lAtual = L.get(i);
                    System.out.println(lAtual);
                    aAtual = A.get(i);
                    System.out.println(aAtual);
                }
            }

            if (i >= 1){
            for (int j = 1; j < 2; j++) {
                rAtual = R.get(i);
                System.out.println(rAtual);
                lAtual = L.get(i);
                System.out.println(lAtual);
                aAtual = A.get(i);
                System.out.println(aAtual);
            }
            }

            double oppsiteSide = pow((aAtual / 2), 2);
            double adjacentSide = pow((lAtual / 2), 2);

            double hypotenuse = sqrt(adjacentSide + oppsiteSide);

            if (rAtual >= hypotenuse) {
                fits = true;
            }

            if (fits) {
                System.out.println("Pizza " + (i+1) + " fits on the table.");
            } else {
                System.out.println("Pizza " + (i+1) + " does not fit on the table.");
                System.out.println(0);
            }
        }
    }
}
