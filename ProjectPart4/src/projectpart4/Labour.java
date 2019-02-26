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
public class Labour {

    //private attributes of labour class
    private double hourlyRate;
    private double numberOfHours;

    //Constuctors
    public Labour(double hourlyRate, double numberOfHours) {
        this.setHourlyRate(hourlyRate);
        this.setNumberOfHours(numberOfHours);
    }

    public Labour() {
        this(0, 0);
    }

    //Getters and Setters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new RangeException("Kindly enter a positive value");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        if (numberOfHours < 0) {
            throw new RangeException("Kindly enter a positive value");
        }
        this.numberOfHours = numberOfHours;
    }

    //Overridden toString function
    @Override
    public String toString() {
        return "Labour{" + "hourlyRate=" + hourlyRate + ", numberOfHours=" + numberOfHours + '}';
    }

}
