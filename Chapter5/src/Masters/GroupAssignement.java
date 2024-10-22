/*

Program: GroupAssignement.java    Date: October 21, 2024

Purpose: Assign a group to the user depending on her/his name

Author: Cesar Pena,
School: CHHS
Course: Computer Programming 20
 

*/
package Masters;

import java.util.Scanner;
import java.lang.String;
public class GroupAssignement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//prompt the user for his/her name
		System.out.print("Enter your first name: ");
		String FName = input.nextLine();
		System.out.print("Enter your last name: ");
		String LName = input.nextLine();
		input.close();
		//get the first letter of the user's last name
		char FirstLetter = Character.toUpperCase(LName.charAt(0));
		int group;
		//based on FirstLetter determine the group for the user
        if (FirstLetter >= 'A' && FirstLetter <= 'I') {
            group = 1;
        } else if (FirstLetter >= 'J' && FirstLetter <= 'S') {
            group = 2;
        } else if (FirstLetter >= 'T' && FirstLetter <= 'Z') {
            group = 3;
        } else {
            System.out.println("Invalid last name");
            return;
        }

        // Mostrar el resultado
        System.out.println("Hi " +FName+ " " +LName+ ", you're in group " + group + ".");

	}

}