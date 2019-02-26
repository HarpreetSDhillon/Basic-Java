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
public class Room {

    //Private attributes of Room class
    private WallWithDoor wallWithDoor;
    private WallWithWindow wallWithWindow;
    private Wall[] walls;
    private Ceiling ceiling;
    private int count;

    //Constructor
    public Room() {
        walls = new Wall[2];
        count = 0;
        wallWithDoor = new WallWithDoor();
        wallWithWindow = new WallWithWindow();
        ceiling = new Ceiling();
    }

    public Room(WallWithDoor wallWithDoor, WallWithWindow wallWithWindow, Wall[] walls, Ceiling ceiling, int count) {
        this.wallWithDoor = wallWithDoor;
        this.wallWithWindow = wallWithWindow;
        this.walls = walls;
        this.ceiling = ceiling;
        this.count = count;
    }

    //Getters and Setters
    public WallWithDoor getWallWithDoor() {
        return wallWithDoor;
    }

    public void setWallWithDoor(WallWithDoor wallWithDoor) {
        this.wallWithDoor = wallWithDoor;
    }

    public WallWithWindow getWallWithWindow() {
        return wallWithWindow;
    }

    public void setWallWithWindow(WallWithWindow wallWithWindow) {
        this.wallWithWindow = wallWithWindow;
    }

    public Wall[] getWalls() {
        return walls;
    }

    public void setWalls(Wall[] walls) {
        this.walls = walls;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //Function addWall to add wall to the array walls
    public void addWall(Wall wall) {
        if (count >= walls.length) {
            throw new WallException("Error - no more space.");
        }
        walls[count++] = wall;
    }

    //Function to calculate the cost to Paint the wall area of the room
    public double getCostToPaintWalls(Paint paint) {
        double area = this.wallWithDoor.getWallAreaWithoutDoor() + this.wallWithWindow.getWallAreaWithoutWindow();
        for (int i = 0; i < count; i++) {
            area += walls[i].getArea();
        }
        int paintRequired = (int) Math.ceil(area / paint.getCoverageArea());
        return paintRequired * paint.getPricePerGallon();
    }

    //Function to calculate the cost to Paint the ceiling area of the room
    public double getCostToPaintCeiling(Paint paint) {
        double area = this.ceiling.getArea();
        int paintRequired = (int) Math.ceil(area / paint.getCoverageArea());
        return paintRequired * paint.getPricePerGallon();
    }

    //Function to calculate the cost to Paint the door and window area of the room
    public double getCostToPaintDoorWindow(Paint paint) {
        double area = this.wallWithDoor.getDoorArea() + this.wallWithWindow.getWindowArea();
        int paintRequired = (int) Math.ceil(area / paint.getCoverageArea());
        return paintRequired * paint.getPricePerGallon();
    }

    //Function to calculate the total labour cost to paint a room
    public double getTotalCost(Labour labour) {
        return labour.getHourlyRate() * labour.getNumberOfHours();
    }

    //Overridden toString function
    @Override
    public String toString() {
        String wallsStr = "";
        if (walls.length >= 0) {
            for (int i = 0; i < walls.length; i++) {
                wallsStr += "Wall[" + i + "]{ " + walls[i];
                if (i != walls.length - 1) {
                    wallsStr += "; ";
                }
                if (i == walls.length - 1) {
                    wallsStr += "} ";
                }
            }
        }

        return "Room{" + "wallWithDoor=" + wallWithDoor + ", wallWithWindow=" + wallWithWindow + ", walls=" + wallsStr
                + ", ceiling=" + ceiling + " }";
    }

}
