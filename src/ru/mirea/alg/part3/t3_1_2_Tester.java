package ru.mirea.alg.part3;
// не доделано
class Point {
    private double x = 0.0, y = 0.0;

    public Point() {}
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

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
    @Override
    public String toString() {
        return "Circle{ center: " + this.center.toString() + ",  radius: " + this.radius + " }";
    }
}

public class t3_1_2_Tester {
}
