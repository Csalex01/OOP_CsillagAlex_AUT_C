package org.csalex;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle()
    {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width) {
        this.width = width;
        this.length = width;
    }

    //Getters
    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    //Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle: " + this.width + " X " + this.length;
    }

}
