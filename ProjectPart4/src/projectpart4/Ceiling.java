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
public class Ceiling extends Wall {
    //Celling is a child class of Wall class which is further a child of Rectangle class

    //Constructors
    public Ceiling() {
        super();
    }

    public Ceiling(double length, double width) {
        super(length, width);
    }

    //Overridden function toString
    @Override
    public String toString() {
        return "Ceiling { " + super.toString() + " }"; //To change body of generated methods, choose Tools | Templates.
    }

}
