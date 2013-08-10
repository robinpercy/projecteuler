package com.robinpercy;

import java.util.*;
import java.lang.Math;

public class Problem3 {
    static long VALUE = 600851475143L;
    static Set<Double> primes = new LinkedHashSet<Double>();
    public static void main(String[] args) {
        double quot = VALUE;
        double sqrt = Math.floor(Math.sqrt(VALUE));
        Set<Double> composites = new HashSet<Double>();


        System.out.println("Checking primes between: 2 and " + sqrt);
        for(double p = 2; p <= sqrt; p++) {
            if (composites.contains(p)) {
                continue;
            }
            primes.add(p);
            System.out.println("Found prime: " + p);
            for (double i = p; i * p < sqrt ; i++) {
                composites.add(i*p); 
            }
            System.out.println("Done marking composites " + composites.size());    
        }

        System.out.println("Found primes: " + primes);

        for(double p : primes) {
            System.out.println("Considering prime: " + p);
            double q = quot / p;
            if (q - Math.floor(q) < 0.0000001) {
                quot = q;
            }
            if (quot < 2.0d) {
                System.out.println("Largest factor is" + p);
                return;
            }
        }
    }

}
