package com.techolution.twocircles.model;

/**
 * Circle POJO
 */
public class Circle {

    private double xCoordinate;
    private double yCoordinate;
    private double radius;

    public Circle(String xCoordinate, String yCoordinate, String radius) {
        this.xCoordinate = Double.valueOf(xCoordinate);
        this.yCoordinate = Double.valueOf(yCoordinate);
        this.radius = Double.valueOf(radius);
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
