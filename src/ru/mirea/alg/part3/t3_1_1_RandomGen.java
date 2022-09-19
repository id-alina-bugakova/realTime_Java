package ru.mirea.alg.part3;

import java.util.Arrays;
import java.util.Random;

class RandomDoubleGen {
    Random random = new Random();

    public RandomDoubleGen() {}

    public double RandomGen() {
        return random.nextDouble();
    }
    public double MathGen() {
        return Math.random();
    }
}

public class t3_1_1_RandomGen {
    private static void printArray (double[] arr, String name) {
        System.out.print(name + " = { ");
        for (int i = 0; i < arr.length; ++i) {
            if(i == arr.length - 1)
                System.out.println(arr[i] + " }");
            else
                System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        RandomDoubleGen random = new RandomDoubleGen();
        final int N = 5;
        double[] arrRand = new double[N], arrMath = new double[N];
        for (int i = 0; i < N; ++i) {
            arrRand[i] = random.RandomGen();
            arrMath[i] = random.MathGen();
        }
        printArray(arrRand, "arrRand");
        printArray(arrMath, "arrMath");
        Arrays.sort(arrRand);
        Arrays.sort(arrMath);
        System.out.println("---- Sorted:");
        printArray(arrRand, "arrRand");
        printArray(arrMath, "arrMath");
    }
}
