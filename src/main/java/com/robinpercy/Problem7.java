package com.robinpercy;

import java.util.*;

public class Problem7 {
    static int[] primes = new int[12000];
    static int numPrimes = 0;

    public static void main(String[] args) {
        int n = 2;
        while (numPrimes < 10001) {
        //    System.out.println("Checking: n=" + n);
            boolean isPrime = true;
            for (int i = 0; i < numPrimes; i++) {
                if (0 == n % primes[i]) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[numPrimes] = n;
                numPrimes++;
                System.out.println(n + " is prime");
            }
            n++;
        }
        System.out.println("Answer is "+ primes[10000]);
    }


}
