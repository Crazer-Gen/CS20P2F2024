package SkillBuilder;

public class CircleTestPt1 {
    public static void main(String[] args) {
        CirclePt1 spot = new CirclePt1();

        spot.setRadius(3);
        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle circumference: " + spot.circumference());
        System.out.println("Circle area: " + spot.area());
    }
}
