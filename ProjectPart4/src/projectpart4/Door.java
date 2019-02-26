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
public class Door extends Rectangle {
    //Door is a child class of Rectangle class

    //Constructors
    public Door() {
        super();
    }

    public Door(double length, double width) {
        super(length, width);
    }

    //Overridden toString function
    @Override
    public String toString() {
        return "Door { " + super.toString() + " }";
    }
}
