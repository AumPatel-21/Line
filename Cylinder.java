package com.company;

public class Cylinder {
    private double height;
    private double radius;


    public Cylinder(double h, double r){
        height = h;
        radius = r;

    }
    public double sa(){
        return 2* Math.PI*radius*(radius + height);
    }

    private double height(double h) {
        return height;
    }

    private double radius(double r) {
        return radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }

    public double vol(){
       return area()*height;
    }



}
