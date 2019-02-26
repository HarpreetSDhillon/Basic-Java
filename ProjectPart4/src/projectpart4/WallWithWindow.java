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
public class WallWithWindow extends Wall {
    //WallWithWindow is a child of Wall class which is further a child of Rectangle class

    //Contains private attribute Window
    private Window window;

    //Constructors
    public WallWithWindow() {
        super();
        window = new Window();
    }

    public WallWithWindow(double length, double width) {
        super(length, width);
        window = new Window();
    }

    public WallWithWindow(Window window, double length, double width) {
        super(length, width);
        this.window = window;
    }

    //Getters and Setters
    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    //Function to get area of window attribute of the class
    public double getWindowArea() {
        return window.getArea();
    }

    //Function to get area of wall without the area of the window which is total area minus window area
    public double getWallAreaWithoutWindow() {
        return getArea() - window.getArea();
    }

    //Function to return total area of the wall
    public double getTotalArea() {
        return getArea();
    }

    //Overridden toString function
    @Override
    public String toString() {
        return "WallWithWindow{ " + super.toString() + " window=" + window + " }";
    }

}
