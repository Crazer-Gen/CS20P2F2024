package SkillBuilder;

public class SpanishNumbers {
    public static void main(String[] args) {
    	System.out.println("Let's learn the numbers in Spanish!");
        // Loop through numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(getSpanishNumber(i));
        }
    }
    // Method to return the Spanish word for the given number
    public static String getSpanishNumber(int number) {
        switch (number) {
            case 1: return "1 uno";
            case 2: return "2 dos";
            case 3: return "3 tres";
            case 4: return "4 cuatro";
            case 5: return "5 cinco";
            case 6: return "6 seis";
            case 7: return "7 siete";
            case 8: return "8 ocho";
            case 9: return "9 nueve";
            case 10: return "10 diez";
        }
        return null;
    }
}

