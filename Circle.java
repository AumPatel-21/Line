package com.company;

public class Circle {
    private double radius;

    public Circle(double r){
        radius = r;
    }
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
    public double getCircum(){
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args){
        Circle rad = new Circle(5);
        double a = rad.getArea();
        System.out.println(a);
        double c = rad.getCircum();
        System.out.println(c);
    }
}
