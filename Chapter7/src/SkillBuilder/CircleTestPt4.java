package SkillBuilder;

public class CircleTestPt4 {
    public static void main(String[] args) {
        CirclePt4 defaultCircle = new CirclePt4();
        System.out.println("Default Circle radius: " + defaultCircle.getRadius());
        System.out.println("Default Circle circumference: " + defaultCircle.circumference());
        System.out.println("Default Circle area: " + defaultCircle.area());

        CirclePt4 customCircle = new CirclePt4(3);
        System.out.println("\nCustom Circle radius: " + customCircle.getRadius());
        System.out.println("Custom Circle circumference: " + customCircle.circumference());
        System.out.println("Custom Circle area: " + customCircle.area());

        // Test the displayAreaFormula method
        System.out.println("\nArea Formula:");
        CirclePt4.displayAreaFormula();

        // Test toString method
        System.out.println("\nString representation of defaultCircle:");
        System.out.println(defaultCircle.toString());

        System.out.println("\nString representation of customCircle:");
        System.out.println(customCircle.toString());

        // Test equals method
        CirclePt4 anotherCircle = new CirclePt4(3);
        System.out.println("\nAre customCircle and anotherCircle equal? " + customCircle.equals(anotherCircle));
    }
}