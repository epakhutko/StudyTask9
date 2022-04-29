package com.max.idea;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(in).useLocale(Locale.ENGLISH);;
        System.out.println("Input array length");
        int n = inp.nextInt();
        if (n<1) {
            System.out.println("Input number >0");
            return;
        }

        double[] Arr;
        Arr = new double[n];
        int sum=0;
        for (int i=0; i<n; i++)
            sum+=i+1;

        System.out.printf("The sum is equal to: %d\n", sum);
        return;
    }
}