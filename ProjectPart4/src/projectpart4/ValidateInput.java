/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpart4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Harpreet
 */
public class ValidateInput {
    //Class contains static methods that are used to validate the input from the user.    

    //Function loops and asks the user for the value till a positive double is obtained
    public static double getValidatedNoneZeroDouble(String msg) {
        double data = 0;
        boolean condition = true;
        Scanner input = new Scanner(System.in);
        while (condition) {
            try {
                System.out.print("Enter the " + msg + " : ");
                data = input.nextDouble();
                if (data < 0) {
                    throw new RangeException("Kindly enter a positive value");
                }
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Kindly enter a numeric value.");
            } catch (RangeException re) {
                System.out.println(re.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                input.nextLine();
            }
        }
        return data;
    }

    //Function validates the input for a positive double
    public static double validatedNoneZeroDouble(double data) {
        try {
            if (data < 0) {
                throw new RangeException("Kindly enter a positive value");
            }
        } catch (RangeException re) {
            System.out.println(re.getMessage());
        }
        return data;
    }

    //Function loops and asks the user for the value till a positive double is obtained with value ranging between 8 to 16 feet
    public static double getValidateHeight(String msg) {
        double data = 0;
        while (true) {
            try {

                data = getValidatedNoneZeroDouble(msg);
                if (data < (8 * 12) || data > (16 * 12)) {
                    throw new RangeException("Kindly enter the value between 8 feet to 16 feet.");
                }
                break;

            } catch (RangeException re) {
                System.out.println(re.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return data;
    }

    //Function loops and asks the user for the value till a positive integer is obtained
    public static int getValidatedNoneZeroInteger(String msg) {
        int data = 0;
        boolean condition = true;
        Scanner input = new Scanner(System.in);
        while (condition) {
            try {
                System.out.print("Enter the " + msg + " : ");
                data = input.nextInt();
                if (data < 0) {
                    throw new RangeException("Kindly enter a positive value");
                }
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Kindly enter a numeric interger value.");
            } catch (RangeException re) {
                System.out.println(re.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                input.nextLine();
            }
        }
        return data;
    }

    //Function validates the input for a positive int
    public static int validatedNoneZeroInteger(int data) {
        try {
            if (data < 0) {
                throw new RangeException("Kindly enter a positive value");

            }
        } catch (RangeException re) {
            System.out.println(re.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    //Overridden toString function
    @Override
    public String toString() {
        return "ValidateInput{" + '}';
    }

}
