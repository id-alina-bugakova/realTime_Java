package ru.mirea.alg.part2;

import java.util.Hashtable;
import java.util.Scanner;

interface Inputable {
    public void readFromKeyboard();
}

class Shop implements Inputable {
    private Hashtable<String, Integer> assortment = new Hashtable<String, Integer>();

    public Shop() {}

    @Override
    public void readFromKeyboard() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the amount of good types (int): ");
        int n = sc.nextInt();
        int amount;
        String name;
        System.out.println("Input the amount and the ID of each good in the next " + n + "lines (int, String).");
        for(int i = 0; i < n; ++i) {
            amount = sc.nextInt();
            name = sc.nextLine();
            this.addGood(name, amount);
        }
    }

    public void addGood(String name, int amount) {
        this.assortment.merge(name, amount, Integer::sum);
    }
    public void removeGood(String name) {
        if(this.assortment.get(name) != null)
            this.assortment.remove(name);
    }
    public void findGood(String name) {
        Integer amount = this.assortment.get(name);
        if (amount != null)
            if (amount != 0)
                System.out.println(name + " is in stock: " + amount + " pcs");
            else
                System.out.println(name + " is out of stock.");
        else
            System.out.println(name + " is not sold in the shop.");
    }
    @Override
    public String toString() {
        String str = "Shop{ assortment: {\n";
        for (String i : this.assortment.keySet())
            str += "    " + i + ": " + this.assortment.get(i) + "\n";
        str += "} }";
        return str;
    }
}

public class t2_4_Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of entries: ");
        int n = sc.nextInt();
        System.out.println("For each entry input two lines: name and amount.");
        Shop a = new Shop();
        for (int i = 0; i < n; ++i) {
            sc.nextLine();
            String name = sc.nextLine();
            int amount = sc.nextInt();
            a.addGood(name, amount);
        }
        System.out.println(a.toString());
        System.out.print("Input the name of the entry to search for: ");
        sc.nextLine();
        String name = sc.nextLine();
        a.findGood(name);
        System.out.print("Input the name of the entry to add it: ");
        name = sc.nextLine();
        System.out.print("Input the amount of the good: ");
        int amount = sc.nextInt();
        a.addGood(name, amount);
        System.out.println(a.toString());
        a.findGood(name);
        System.out.print("Input the name of the entry to remove it: ");
        sc.nextLine();
        name = sc.nextLine();
        a.removeGood(name);
        System.out.println(a.toString());
        a.findGood(name);
    }
}
