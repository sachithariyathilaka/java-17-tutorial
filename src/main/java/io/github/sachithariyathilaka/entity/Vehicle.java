package io.github.sachithariyathilaka.entity;

/**
 * Vehicle sealed abstract class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2025/04/20
 */
public abstract sealed class Vehicle permits Car, Bus {
    protected String color;
    protected int noOfWheels;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
}
