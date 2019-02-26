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
public class WallException extends RuntimeException {

    String message;
    public WallException(String msg) {
        message=msg;
    }
    
    @Override
    public String getMessage(){
        return message;
    }

    @Override
    public String toString() {
        return "WallException{" + "message=" + message + '}';
    }
    
}
