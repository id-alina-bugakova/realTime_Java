package ru.mirea.alg.part2;

import java.util.Scanner;

class Ball {
    private double x = 0.0, y = 0.0;

    public Ball() {}
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }
    @Override
    public String toString() {
        return "Ball{ x: " + this.x + ",  y: " + this.y + " }";
    }
}

public class t2_2_TestBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        Ball b = new Ball();
        System.out.println(b.toString());
        System.out.print("Input x (double): ");
        x = sc.nextDouble();
        System.out.print("Input y (double): ");
        y = sc.nextDouble();
        b = new Ball(x, y);
        System.out.println(b.toString());
        System.out.print("Input new x (double): ");
        x = sc.nextDouble();
        b.setX(x);
        System.out.println("X: " + b.getX());
        System.out.print("Input new y (double): ");
        y = sc.nextDouble();
        b.setY(y);
        System.out.println("Y: " + b.getY());
        System.out.print("Input new x (double): ");
        x = sc.nextDouble();
        System.out.print("Input new y (double): ");
        y = sc.nextDouble();
        b.setXY(x, y);
        System.out.println(b.toString());
        System.out.print("Input movement in x axis (double): ");
        x = sc.nextDouble();
        System.out.print("Input movement in y axis (double): ");
        y = sc.nextDouble();
        b.move(x, y);
        System.out.println(b.toString());
    }
}
