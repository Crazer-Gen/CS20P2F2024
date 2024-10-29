package SkillBuilder;

/**
 * Rectangle class
 */
public class RectanglePt3 {
    private double length;
    private double width;

    // Default constructor
    public RectanglePt3() {
        length = 1; // Default length
        width = 1;  // Default width
    }

    // Overloaded constructor
    public RectanglePt3(double length, double width) {
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

    // Class method to display the area formula
    public static void displayAreaFormula() {
        System.out.println("Area = length * width");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check type
        RectanglePt3 rectangle = (RectanglePt3) obj; // Cast to RectanglePt3
        return Double.compare(rectangle.length, length) == 0 && Double.compare(rectangle.width, width) == 0; // Compare dimensions
    }

    @Override
    public String toString() {
        return "Rectangle with Length: " + length + ", Width: " + width +
               ", Area: " + area() + ", Perimeter: " + perimeter();
    }
}

