package SkillBuilder;

public class RectangleTestPt2 {
    public static void main(String[] args) {
        // Test the default constructor
        RectanglePt2 defaultRectangle = new RectanglePt2();
        System.out.println("Default Rectangle:");
        System.out.println("Length: " + defaultRectangle.getLength());
        System.out.println("Width: " + defaultRectangle.getWidth());
        System.out.println("Area: " + defaultRectangle.area());
        System.out.println("Perimeter: " + defaultRectangle.perimeter());

        // Test the overloaded constructor
        RectanglePt2 customRectangle = new RectanglePt2(4, 5);
        System.out.println("\nCustom Rectangle:");
        System.out.println("Length: " + customRectangle.getLength());
        System.out.println("Width: " + customRectangle.getWidth());
        System.out.println("Area: " + customRectangle.area());
        System.out.println("Perimeter: " + customRectangle.perimeter());

        // Testing setters
        customRectangle.setLength(6);
        customRectangle.setWidth(3);
        System.out.println("\nUpdated Custom Rectangle:");
        System.out.println("Length: " + customRectangle.getLength());
        System.out.println("Width: " + customRectangle.getWidth());
        System.out.println("Area: " + customRectangle.area());
        System.out.println("Perimeter: " + customRectangle.perimeter());

        // Test the displayAreaFormula method
        System.out.println("\nArea Formula:");
        RectanglePt2.displayAreaFormula();
    }
}

