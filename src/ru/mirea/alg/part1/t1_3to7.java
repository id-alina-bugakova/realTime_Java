package ru.mirea.alg.part1;

import java.util.Scanner;

public class t1_3to7 {
    public static void t1_3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of the array: ");
        int n = sc.nextInt();
        System.out.print("Input the array: ");
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.print("Sum  = ");
        System.out.println(sum);
        System.out.print("Mean = ");
        System.out.println((float)sum / n);
    }
    public static void t1_4() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        int n = 0, x = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        System.out.print("Input the array ending with 0: ");
        do {
            arr[n] = sc.nextInt();
            ++n;
        } while(arr[n - 1] != 0);
        --n;
        while(x < n) {
            sum += arr[x];
            min = Integer.min(min, arr[x]);
            max = Integer.max(max, arr[x]);
            ++x;
        }
        System.out.print("Sum = ");
        System.out.println(sum);
        System.out.print("Min = ");
        System.out.println(min);
        System.out.print("Max = ");
        System.out.println(max);
    }
    public static void t1_5(String[] args) {
        int n = args.length;
        for (int i = 0; i < n; ++i)
            System.out.println(args[i]);
    }
    public static void t1_6() {
        String res = "";
        for (int i = 1; i <= 10; ++i)
            res += String.format("%5.4f ", 1.0 / i);
        System.out.println(res);
    }
    public static long t1_7_factorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; ++i)
            res *= (long)i;
        return res;
    }
    public static void t1_7() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t1_7_factorial(n));
    }
}
