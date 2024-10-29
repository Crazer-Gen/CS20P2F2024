package SkillBuilder;

/**
 * Rectangle class
 */
public class RectanglePt1 {
    private double length;
    private double width;

    // Default constructor
    public RectanglePt1() {
        length = 1; // Default length
        width = 1;  // Default width
    }

    // Overloaded constructor
    public RectanglePt1(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Method to set the length
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be positive.");
        }
    }

    // Method to get the length
    public double getLength() {
        return length;
    }

    // Method to set the width
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be positive.");
        }
    }

    // Method to get the width
    public double getWidth() {
        return width;
    }

    // Method to calculate the area of the rectangle
    public double area() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double perimeter() {
        return 2 * (length + width);
    }
}

