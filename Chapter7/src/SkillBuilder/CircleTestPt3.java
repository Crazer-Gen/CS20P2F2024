package SkillBuilder;

public class CircleTestPt3 {
    public static void main(String[] args) {
        CirclePt3 defaultCircle = new CirclePt3(); // Use the correct variable declaration
        System.out.println("Default Circle radius: " + defaultCircle.getRadius());
        System.out.println("Default Circle circumference: " + defaultCircle.circumference());
        System.out.println("Default Circle area: " + defaultCircle.area());

        CirclePt3 customCircle = new CirclePt3(3); // Uses overloaded constructor
        System.out.println("\nCustom Circle radius: " + customCircle.getRadius());
        System.out.println("Custom Circle circumference: " + customCircle.circumference());
        System.out.println("Custom Circle area: " + customCircle.area());

        // Test the displayAreaFormula method
        System.out.println("\nArea Formula:");
        CirclePt3.displayAreaFormula();
    }
}

