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
public class Wall extends Rectangle {
    //Wall is a child of Rectangle class

    //Constructors
    public Wall(){
        super(0.0, 12*8);
    }

    public Wall(double length, double width) {
        super(length, width);
    }

    //Overridden toString function
    @Override
    public String toString() {
        return "Wall { " + super.toString() + " }";
    }

}
