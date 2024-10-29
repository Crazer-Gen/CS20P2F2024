package SkillBuilder;
/**
 * Circle class
 */
public class CirclePt1 {
    private static final double PI = 3.14;
    private double radius;

    public CirclePt1() {
        radius = 1;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
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
}


