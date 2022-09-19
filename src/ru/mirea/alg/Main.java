package ru.mirea.alg;

import ru.mirea.alg.part1.*;
import ru.mirea.alg.part2.*;
import ru.mirea.alg.part3.*;

import java.util.Scanner;

public class Main {

    static void t1_3() { t1_3to7.t1_3(); }
    static void t1_4() { t1_3to7.t1_4(); }
    static void t1_5(String[] args) { t1_3to7.t1_5(args); }
    static void t1_6() { t1_3to7.t1_6(); }
    static void t1_7() { t1_3to7.t1_7(); }

    static void t2_1(String[] args) { t2_1_TestAuthor.main(args); }
    static void t2_2(String[] args) { t2_2_TestBall.main(args); }
    static void t2_3(String[] args) { t2_3_Tester.main(args); }
    static void t2_4(String[] args) { t2_4_Tester.main(args);}
    static void t2_8(String[] args) { t2_8_StringArraySwap.main(args); }
    static void t2_9(String[] args) { t2_9_Poker.main(args); }
    static void t2_10(String[] args) { t2_10_HowMany.main(args);}

    static void t3_1_1(String[] args) { t3_1_1_RandomGen.main(args); }
    // 1_2 не доделано

    public static void main(String[] args) {
        t3_1_1(args);
    }
}
