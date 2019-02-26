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
public class WallWithDoor extends Wall {
    //WallWithDoor is a child of Wall class which is further a child of Rectangle class

    //Contains private attribute Door
    private Door door;

    //Constructors
    public WallWithDoor() {
        super();
        door = new Door();
    }

    public WallWithDoor(double length, double width) {
        super(length, width);
        door = new Door();
    }

    public WallWithDoor(double length, double width, Door door) {
        super(length, width);
        this.setDoor(door);
    }

    //Getters and Setters
    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    //Function to get area of Door attribute of the class
    public double getDoorArea() {
        return door.getArea();
    }

    //Function to get area of wall without the area of the door which is total area minus door area
    public double getWallAreaWithoutDoor() {
        return getArea() - door.getArea();
    }

    //Function to return total area of the wall
    public double getTotalArea() {
        return getArea();
    }

    //Overridden toString functions
    @Override
    public String toString() {
        return "WallWithDoor{ " + super.toString() + door + " }";
    }

}
