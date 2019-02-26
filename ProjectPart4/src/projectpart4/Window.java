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
public class Window extends Rectangle{
    //Window class is a child of Rectangle class
    
    //Constructors
    public Window(){
        super();
    }

    public Window(double length, double width) {
        super(length, width);
    }
    
    //Overridden toString function
    @Override
    public String toString() {
        return "Window { "+super.toString()+" }";
    }
}
