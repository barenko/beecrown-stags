package imberbeMath;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathProblem {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Scanner leitura2 = new Scanner(System.in);

        int N = leitura.nextInt();

        List<Integer> listPrime = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            Boolean prime = isPrime(i);
            int M = leitura2.nextInt();

            if (prime){
                listPrime.add(M);
            }
        }
        System.out.println(listPrime);

        for (int j = 0; j < listPrime.size() && j < N; j++) {
            int currentNumber = listPrime.get(j);
            calculateFactorial(currentNumber);
        }

    }
    public static void calculateFactorial(int number) {
        if (number <= 1) {
            return;
        }
        BigInteger fatorial = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("""
                %d! = %d
                """, number, fatorial);
    }


    public static Boolean isPrime(int number){
        boolean isPrime;

        isPrime = number >= 2;

        for (int i = 2; i < number; i++) {
            if ((number % i) == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
