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
public class Paint {

    //private attributes of the Paint class
    private double pricePerGallon;
    private double coverageArea;
    private String paintType;

    //Constructors
    public Paint() {
        this(0, 0, "TBA");
    }

    public Paint(double pricePerGallon, double coverageArea, String paintType) {
        this.setPricePerGallon(pricePerGallon);
        this.setCoverageArea(coverageArea);
        this.paintType = paintType;
    }

    //Getters and Setters
    public double getPricePerGallon() {
        return pricePerGallon;
    }

    public void setPricePerGallon(double pricePerGallon) throws RangeException {
        if (pricePerGallon < 0) {
            throw new RangeException("Kindly enter a positive value");
        }
        this.pricePerGallon = pricePerGallon;
    }

    public double getCoverageArea() {
        return coverageArea;
    }

    public void setCoverageArea(double coverageArea) throws RangeException {
        if (coverageArea < 0) {
            throw new RangeException("Kindly enter a positive value");
        }
        this.coverageArea = coverageArea;
    }

    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    //Overridden toString function
    @Override
    public String toString() {
        return "Paint{" + "pricePerGallon=" + pricePerGallon + ", coverageArea=" + coverageArea + ", paintType=" + paintType + '}';
    }

}
