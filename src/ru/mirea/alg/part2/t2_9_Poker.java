package ru.mirea.alg.part2;

import java.util.Random;
import java.util.Scanner;

public class t2_9_Poker {
    private static final String[] suits = {" of CLUBS\n", " of SPADES\n", " of DIAMONDS\n", " of HEARTS\n"};
    private static final String[] ranks = {"   II", "  III", "   IV", "    V", "   VI", "  VII", " VIII", "   IX", "    X", " JACK", "QUEEN", " KING", "  ACE"};
    // private static final String[] suits = {"\u2667    ", "\u2664    ", "\u2662    ", "\u2661    "};
    // private static final String[] ranks = {" 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", " J", " Q", " K", " A" };
    private static final boolean[][] deck = new boolean[suits.length][ranks.length];

    public static void main(String[] args) {
        for (int i = 0; i < suits.length; ++i)
            for (int j = 0; j < ranks.length; ++j)
                deck[i][j] = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of players (integer <= 10): ");
        int n = sc.nextInt();
        while (n > 10) {
            System.out.print("The number of players must be less than 10. Try again: ");
            n = sc.nextInt();
        }
        Random random = new Random();
        for(int i = 0; i < n; ++i) {
            System.out.println("-------- PLAYER " + (i + 1) + " :");
            for (int j = 0; j < 5; ++j) {
                int suit = Math.abs(random.nextInt()) % suits.length, rank = Math.abs(random.nextInt()) % ranks.length;
                while(deck[suit][rank]) {
                    suit = Math.abs(random.nextInt()) % suits.length;
                    rank = Math.abs(random.nextInt()) % ranks.length;
                }
                deck[suit][rank] = true;
                System.out.print(ranks[rank] + suits[suit]);
            }
            System.out.println();
        }
    }
}
