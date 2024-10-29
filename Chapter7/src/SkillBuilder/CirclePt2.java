package SkillBuilder;
/**
 * Circle class
 */
public class CirclePt2 {
    private static final double PI = 3.14;
    private double radius;

    /**
     * Default constructor
     * pre: none
     * post: A circle object created. Radius initialized to 1.
     */
    public CirclePt2() {
        radius = 1;
    }

    /**
     * Overloaded constructor
     * pre: newRadius > 0
     * post: A circle object created with specified radius.
     * @param newRadius the radius of the circle
     */
    public CirclePt2(double newRadius) {
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
}


