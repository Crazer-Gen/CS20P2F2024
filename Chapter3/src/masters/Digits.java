package masters;

import java.util.Scanner;
public class Digits{
    public static void main(String[] args) 
    {

        //Declare variables for hundredsPlace, tensPlace, onesPlace
        int HS, TS, OS;
        //Declare variable for number
        int num;
        //Introduce Scanner class
        Scanner input = new Scanner (System.in);
        //Prompt the user to enter a three digit number
        System.out.print("Enter a three digit number: ");
        //store number
        num = input.nextInt();
        input.close();
        //Calculate the hundredsPlace
        HS = (num/10)%100;
        //Calculate the tensPlace
        TS = (num/10)%10;
        //Calculate the onesPlace
        OS = num%10;
        //Output the hundredsPlace
        System.out.println("Hundreds: "+HS);
        //Output the tensPlace
        System.out.println("Tens: "+TS);
        //Output the onesPlace
        System.out.println("Ones: "+OS);
    }

}
