package SkillBuilder;

public class RectangleTestPt1 {
    public static void main(String[] args) {
        // Test the default constructor
        RectanglePt1 defaultRectangle = new RectanglePt1();
        System.out.println("Default Rectangle:");
        System.out.println("Length: " + defaultRectangle.getLength());
        System.out.println("Width: " + defaultRectangle.getWidth());
        System.out.println("Area: " + defaultRectangle.area());
        System.out.println("Perimeter: " + defaultRectangle.perimeter());

        // Test the overloaded constructor
        RectanglePt1 customRectangle = new RectanglePt1(4, 5);
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
    }
}

