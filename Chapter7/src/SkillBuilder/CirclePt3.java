package SkillBuilder;

/**
 * Circle class
 */
public class CirclePt3 {
    private static final double PI = 3.14;
    private double radius;

    /**
     * Default constructor
     * pre: none
     * post: A circle object created. Radius initialized to 1.
     */
    public CirclePt3() {
        radius = 1;
    }

    /**
     * Overloaded constructor
     * pre: newRadius > 0
     * post: A circle object created with specified radius.
     * @param newRadius the radius of the circle
     */
    public CirclePt3(double newRadius) {
        setRadius(newRadius);
    }

    /**
     * Changes the radius of the circle.
     * pre: none
     * post: Radius has been changed
     */
    public void setRadius(double newRadius) {
        if (newRadius > 0) {
            radius = newRadius;
        } else {
            throw new IllegalArgumentException("Radius must be positive.");
        }
    }

    /**
     * Calculates the area of the circle.
     * pre: none
     * post: The area of the circle has been returned.
     * @return The area of the circle
     */
    public double area() {
        return PI * radius * radius;
    }

    /**
     * Returns the radius of the circle
     * pre: none
     * post: The radius of the circle has been returned
     * @return The radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculates the circumference of the circle.
     * pre: none
     * post: The circumference of the circle has been returned.
     * @return The circumference of the circle
     */
    public double circumference() {
        return 2 * PI * radius;
    }

    /**
     * Displays the formula for calculating the area of a circle.
     * pre: none
     * post: The area formula is printed.
     */
    public static void displayAreaFormula() {
        System.out.println("Area = π * r^2");
    }
}

