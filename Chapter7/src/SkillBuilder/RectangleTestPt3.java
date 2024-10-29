package SkillBuilder;

public class RectangleTestPt3 {
    public static void main(String[] args) {
        // Test the default constructor
        RectanglePt3 defaultRectangle = new RectanglePt3();
        System.out.println("Default Rectangle:");
        System.out.println(defaultRectangle);

        // Test the overloaded constructor
        RectanglePt3 customRectangle = new RectanglePt3(4, 5);
        System.out.println("\nCustom Rectangle:");
        System.out.println(customRectangle);

        // Testing setters
        customRectangle.setLength(6);
        customRectangle.setWidth(3);
        System.out.println("\nUpdated Custom Rectangle:");
        System.out.println(customRectangle);

        // Test the displayAreaFormula method
        System.out.println("\nArea Formula:");
        RectanglePt3.displayAreaFormula();

        // Test equals method
        RectanglePt3 anotherRectangle = new RectanglePt3(6, 3);
        System.out.println("\nAre customRectangle and anotherRectangle equal? " + customRectangle.equals(anotherRectangle));

        // Test toString method on a new rectangle
        System.out.println("\nString representation of anotherRectangle:");
        System.out.println(anotherRectangle);
    }
}

