package com.robinpercy;

import java.util.*;

public class Problem2 {
    static Map<Integer,Integer> fibMap = new HashMap<Integer,Integer>();
    static int MAX = 4000000;

    public static void main(String[] args) {
        int total = 0;
        int i = 2;
        int f = fib(i);
        while (f <= MAX) {
            System.out.println(String.format("Fib(%d) = %d", i, f));
            if (f % 2 == 0) {
                total += f;
            }
            f = fib(i);
            i++;
        }
        System.out.println( total);
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n-2) + fib(n-1);
    }
}
