package com.robinpercy;

import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        int sum = 0;
        int squareSum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
            squareSum += (i * i);
        }

        System.out.println("" + ((sum * sum) -squareSum));
    }
}
