package ru.mirea.alg.part2;

import java.util.Scanner;

class Point {
    private double x = 0.0, y = 0.0;

    public Point() {}
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{ x: " + x +", y: " + y + " }";
    }
}

class Circle {
    private Point center = new Point();
    private double radius = 0;

    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double x, double y) {
        this.center.setX(x);
        this.center.setY(y);
    }
    public Circle(double x, double y, double radius) {
        this.center.setX(x);
        this.center.setY(y);
        this.radius = radius;
    }

    public Point getCenter() {
        return new Point(this.center.getX(), this.center.getY());
    }
    public void setCenter(double x, double y) {
        this.center.setX(x);
        this.center.setY(y);
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public boolean isPointOnCircumference (Point p) {
        if((p.getX() - this.center.getX()) * (p.getX() - this.center.getX()) + (p.getY() - this.center.getY()) * (p.getY() - this.center.getY()) == this.radius * this.radius)
            return true;
        return false;
    }
    @Override
    public String toString() {
        return "Circle{ center: " + this.center.toString() + ",  radius: " + this.radius + " }";
    }
}

public class t2_3_Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements (int): ");
        int n =  sc.nextInt();
        Circle[] arr = new Circle[n];
        System.out.println("In the next " + n + " line(s) input n circles. Each circle is determined by three (double) parameters: x and y coordinates and radius.");
        for (int i = 0; i < n; ++i)
            arr[i] = new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        for (int i = 0; i < n; ++i)
            System.out.println(i + ": " + arr[i].toString());
        System.out.print("Input the number of the element that will be altered: ");
        int e = sc.nextInt();
        while(e >= n) {
            System.out.print("Index out of range. Try again: ");
            e = sc.nextInt();
        }
        System.out.print("Input new coordinates of the center (double, double): ");
        arr[e].setCenter(sc.nextDouble(), sc.nextDouble());
        System.out.println("Center: " + arr[e].getCenter().toString());
        System.out.print("Input new radius (double): ");
        arr[e].setRadius(sc.nextDouble());
        System.out.println("Radius: " + arr[e].getRadius());
        System.out.println(arr[e].toString());
    }
}
