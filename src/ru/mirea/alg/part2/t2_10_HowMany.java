package ru.mirea.alg.part2;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class t2_10_HowMany {
    private static final Vector<String> words = new Vector<>();

    private static boolean is_letter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
    private static String get_next_word(String s, int ind) {
        StringBuilder res = new StringBuilder();
        boolean containsApostrophe = false;
        for (int i = ind; i < s.length(); ++i)
            if (is_letter(s.charAt(i)) || (s.charAt(i) == '-' && i != s.length() - 1 && is_letter(s.charAt(i + 1))))
                res.append(s.charAt(i));
            else if (s.charAt(i) == '\'' && !containsApostrophe) {
                res.append(s.charAt(i));
                containsApostrophe = true;
            } else
                break;
        return res.toString();
    }
    private static int skip_spaces(String s, int ind) {
        while(ind < s.length() && !is_letter(s.charAt(ind)))
            ++ind;
        return ind;
    }
    private static void add_line(String s) {
        for(int i = 0; i < s.length(); ++i) {
            i = skip_spaces(s, i);
            if(i < s.length()) {
                String word = get_next_word(s, i);
                if (!word.equals(""))
                    words.add(word);
                i += word.length();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text. To finish, input 0.");
        while(true) {
            String line = sc.nextLine();
            if(line.equals("0"))
                break;
            add_line(line);
            System.out.println("Current amount of words: " + words.size());
        }
        System.out.println("\nTotal amount of words: " + words.size() + "\nShow all words? y/n");
        char c = sc.next().charAt(0);
        if (c == 'y') {
            Collections.sort(words);
            for (String i : words)
                System.out.print(i + "  ");
        }
    }
}
