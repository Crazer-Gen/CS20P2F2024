package SkillBuilder;

public class CircleTestPt2 {
    public static void main(String[] args) {
        CirclePt2 defaultCircle = new CirclePt2(); // Uses default constructor
        System.out.println("Default Circle radius: " + defaultCircle.getRadius());
        System.out.println("Default Circle circumference: " + defaultCircle.circumference());
        System.out.println("Default Circle area: " + defaultCircle.area());

        CirclePt2 customCircle = new CirclePt2(3); // Uses overloaded constructor
        System.out.println("\nCustom Circle radius: " + customCircle.getRadius());
        System.out.println("Custom Circle circumference: " + customCircle.circumference());
        System.out.println("Custom Circle area: " + customCircle.area());
    }
}
