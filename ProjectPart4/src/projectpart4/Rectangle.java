/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpart4;

/**
 *
 * @author Harpreet
 */
public class Rectangle {

    //Private attributes of Rectangle class
    private double length;
    private double width;
    private double area;

    //Constructors
    public Rectangle() {
        this(0.0, 0.0);

    }

    public Rectangle(double length, double width) {
        this.setLength(length);
        this.setWidth(width);
        this.setArea();
    }

    //Getters and Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            throw new RangeException("Kindly enter a positive value");
        } else {
            this.length = length;
            //Refresh area according to new length
            this.setArea();
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            throw new RangeException("Kindly enter a positive value");
        } else {
            this.width = width;
            //Refresh area according to new width
            this.setArea();
        }
    }

    public double getArea() {
        return area;
    }

    private void setArea() {
        this.area = this.length * this.width;
    }

    //Overridden toString function
    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + ", area=" + area + "}";
    }

}
