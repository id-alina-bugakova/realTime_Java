package ru.mirea.alg.part2;

import java.util.Scanner;

class Author {
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return this.gender;
    }
    @Override
    public String toString() {
        return "Author{ name: " + this.name + ",  email: " + this.email + ",  gender: " + this.gender + " }";
    }
}

public class t2_1_TestAuthor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, email;
        char gender;
        System.out.print("Input name (string): ");
        name = sc.nextLine();
        System.out.print("Input email (string): ");
        email = sc.nextLine();
        System.out.print("Input gender (char): ");
        gender = sc.next().charAt(0);
        Author a = new Author(name, email, gender);
        System.out.println(a.toString());
        System.out.println("Author's name:   " + a.getName());
        System.out.println("Author's email:  " + a.getEmail());
        System.out.println("Author's gender: " + a.getGender());
        System.out.print("Update email (string): ");
        email = sc.nextLine();
        email = sc.nextLine();
        a.setEmail(email);
        System.out.println(a.toString());
    }
}
