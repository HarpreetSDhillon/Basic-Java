/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpart4;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Harpreet
 */
public class UI {
    //This is the Controller class which controls the flow of the program

    //The following static attributes help the user to keep data to the room intact while in the program
    private static Room room = new Room();
    private static Paint wallPaint = new Paint();
    private static Paint ceilingPaint = new Paint();
    private static Paint doorWindowPaint = new Paint();
    private static Labour labour = new Labour();

    //This is the main menu function which control the program flow and ask user choices
    public static void mainMenu() {
        int choice = -1;
        do {
            System.out.println("************************************");
            System.out.println("Main Menu - Paint Cost Estimator");
            System.out.println("************************************");
            System.out.println("1. Enter room dimensions");
            System.out.println("2. Enter door dimensions");
            System.out.println("3. Enter window dimensions");
            System.out.println("4. Enter wall paint data");
            System.out.println("5. Enter ceiling paint data");
            System.out.println("6. Enter door/window paint data");
            System.out.println("7. Enter labour data");
            System.out.println("8. Display cost of paint for wall");
            System.out.println("9. Display cost of paint for ceiling");
            System.out.println("10. Display cost of paint for door/window");
            System.out.println("11. Display total cost to paint");
            System.out.println("0. To exit");
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Enter your Choise (0 to exit) :");
                choice = input.nextInt();
                switch (choice) {
                    case 0:
                        break;
                    case 1:
                        UI.getRoomDetails();
                        break;
                    case 2:
                        UI.getDoorDetails();
                        break;
                    case 3:
                        UI.getWindowDetails();
                        break;
                    case 4:
                        UI.getWallPaintDetails();
                        break;
                    case 5:
                        UI.getCeilingPaintDetails();
                        break;
                    case 6:
                        UI.getDoorWindowPaintDetails();
                        break;
                    case 7:
                        UI.getLabourDetails();
                        break;
                    case 8:
                        UI.displayCostOfPaintForWall();
                        break;
                    case 9:
                        UI.displayCostOfPaintForCeiling();
                        break;
                    case 10:
                        UI.displayCostOfPaintForDoorWindow();
                        break;
                    case 11:
                        UI.displayTotalCost();
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Kindly enter a numeric interger value.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                input.nextLine();
            }

        } while (choice != 0);
    }

    //Method to return price in CAD format
    public static String getFormatedPrice(double price) {
        String strPrice;
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.CANADA);
        strPrice = currency.format(price);
        return strPrice;
    }

    //This function get the room details from the user and set those values in the respective attributes of the room.
    public static void getRoomDetails() {
        double length = ValidateInput.getValidatedNoneZeroDouble("length of the room (in inches)");
        double width = ValidateInput.getValidatedNoneZeroDouble("width of the room (in inches)");
        double height = ValidateInput.getValidateHeight("height of the room (in inches)");
        room.getCeiling().setLength(length);
        room.getCeiling().setWidth(width);
        room.getWallWithDoor().setLength(length);
        room.getWallWithDoor().setWidth(height);
        room.getWallWithWindow().setLength(length);
        room.getWallWithWindow().setWidth(height);
        Wall wall1 = new Wall(width, height);
        Wall wall2 = new Wall(width, height);
        room.addWall(wall1);
        room.addWall(wall2);
    }

    //This function get the door details from the user and set those values in the respective attribute of the wall attribute of the room.
    public static void getDoorDetails() {
        double length = ValidateInput.getValidatedNoneZeroDouble("length of the door (in inches)");
        double height = ValidateInput.getValidatedNoneZeroDouble("height of the door (in inches)");
        room.getWallWithDoor().getDoor().setLength(length);
        room.getWallWithDoor().getDoor().setWidth(height);
    }

    //This function get the window details from the user and set those values in the respective attribute of the wall attribute of the room.
    public static void getWindowDetails() {
        double length = ValidateInput.getValidatedNoneZeroDouble("length of the window (in inches)");
        double height = ValidateInput.getValidatedNoneZeroDouble("height of the window (in inches)");
        room.getWallWithWindow().getWindow().setLength(length);
        room.getWallWithWindow().getWindow().setWidth(height);
    }

    //This function get the paint details for painting the wall of the room.
    public static void getWallPaintDetails() {
        double costPerGallon = ValidateInput.getValidatedNoneZeroDouble("cost per gallon of the paint (in CAD$)");
        double coverageArea = ValidateInput.getValidatedNoneZeroDouble("coverage area of the paint (in square inches)");
        wallPaint.setCoverageArea(coverageArea);
        wallPaint.setPricePerGallon(costPerGallon);
        wallPaint.setPaintType("Shell Paint");
    }

    //This function get the paint details for painting the ceiling of the room.
    public static void getCeilingPaintDetails() {
        double costPerGallon = ValidateInput.getValidatedNoneZeroDouble("cost per gallon of the paint (in CAD$)");
        double coverageArea = ValidateInput.getValidatedNoneZeroDouble("coverage area of the paint (in square inches)");
        ceilingPaint.setCoverageArea(coverageArea);
        ceilingPaint.setPricePerGallon(costPerGallon);
        ceilingPaint.setPaintType("Flat Paint");
    }

    //This function get the paint details for painting the door and window of the room.
    public static void getDoorWindowPaintDetails() {
        double costPerGallon = ValidateInput.getValidatedNoneZeroDouble("cost per gallon of the paint (in CAD$)");
        double coverageArea = ValidateInput.getValidatedNoneZeroDouble("coverage area of the paint (in square inches)");
        doorWindowPaint.setCoverageArea(coverageArea);
        doorWindowPaint.setPricePerGallon(costPerGallon);
        doorWindowPaint.setPaintType("Gloss Paint");
    }

    //This function gets the labour details for painting the room.
    public static void getLabourDetails() {
        double labourHours = ValidateInput.getValidatedNoneZeroDouble("number of hours of labour required");
        double paidPerHour = ValidateInput.getValidatedNoneZeroDouble("cost of labour per hour");
        labour.setHourlyRate(paidPerHour);
        labour.setNumberOfHours(labourHours);
    }

    //This function displays the total cost to paint the paintable wall area.
    public static void displayCostOfPaintForWall() {
        System.out.println("Cost to paint the walls is : " + getFormatedPrice(room.getCostToPaintWalls(wallPaint)));
        if (room.getCostToPaintWalls(wallPaint) == 0) {
            System.out.println("Kindly check the Wall and Paint Details");
        }
    }

    //This function displays the total cost to paint the ceiling of the room.
    public static void displayCostOfPaintForCeiling() {
        System.out.println("Cost to paint the ceiling is : " + getFormatedPrice(room.getCostToPaintCeiling(ceilingPaint)));
        if (room.getCostToPaintCeiling(ceilingPaint) == 0) {
            System.out.println("Kindly check the Ceiling and Paint Details");
        }
    }

    //This function displays the total cost to paint the door and window of the room
    public static void displayCostOfPaintForDoorWindow() {
        System.out.println("Cost to paint the door and window is : " + getFormatedPrice(room.getCostToPaintDoorWindow(doorWindowPaint)));
        if (room.getCostToPaintDoorWindow(doorWindowPaint) == 0) {
            System.out.println("Kindly check the Door, Window and Paint Details");
        }
    }

    //This function displays the overall cost of painting the room including labour charges.
    public static void displayTotalCost() {
        System.out.println("Total cost of getting the room painted is : "
                + getFormatedPrice(room.getCostToPaintWalls(wallPaint)
                        + room.getCostToPaintCeiling(ceilingPaint)
                        + room.getCostToPaintDoorWindow(doorWindowPaint)
                        + room.getTotalCost(labour)));
        if (room.getCostToPaintWalls(wallPaint) + room.getCostToPaintCeiling(ceilingPaint) + room.getCostToPaintDoorWindow(doorWindowPaint) + room.getTotalCost(labour) == 0) {
            System.out.println("Kindly Enter the details for the room, paint and labour");
        }
    }
}
