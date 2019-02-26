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
public class RangeException extends RuntimeException {

    //Attribute of the RangeException class
    String message;

    //Constructor
    public RangeException(String msg) {
        message = msg;
    }

    //Overridden getMessage function
    @Override
    public String getMessage() {
        return message;
    }

    //Overridden toString function
    @Override
    public String toString() {
        return "RangeException{" + "message=" + message + '}';
    }

}
