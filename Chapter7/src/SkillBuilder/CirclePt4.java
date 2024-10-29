package SkillBuilder;

/**
 * Circle class
 */
public class CirclePt4 {
    private static final double PI = 3.14;
    private double radius;

    public CirclePt4() {
        radius = 1;
    }

    public CirclePt4(double newRadius) {
        setRadius(newRadius);
    }

    public void setRadius(double newRadius) {
        if (newRadius > 0) {
            radius = newRadius;
        } else {
            throw new IllegalArgumentException("Radius must be positive.");
        }
    }

    public double area() {
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    public static void displayAreaFormula() {
        System.out.println("Area = π * r^2");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check type
        CirclePt4 circle = (CirclePt4) obj; // Cast to CirclePt4
        return Double.compare(circle.radius, radius) == 0; // Compare radii
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius + ", area: " + area() + ", circumference: " + circumference();
    }
}

