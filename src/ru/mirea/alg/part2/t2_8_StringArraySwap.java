package ru.mirea.alg.part2;

import java.util.Scanner;

public class t2_8_StringArraySwap {
    private static void print_strarr (String[] arr) {
        System.out.println("Array: {");
        for (String i: arr)
            System.out.println("    " + i);
        System.out.println("}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of the elements in the array: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Input " + n + " strings in the following " + n + " lines:");
        String[] arr = new String[n];
        for(int i = 0; i < n; ++i)
            arr[i] = sc.nextLine();
        print_strarr(arr);
        String tmp;
        for(int i = 0; i < n / 2; ++i) {
            tmp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = tmp;
        }
        print_strarr(arr);
    }
}
