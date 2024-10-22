package Skillbuilder;
import java.util.Scanner;
public class Hurricane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prompt the user for the category
		Scanner input = new Scanner(System.in);
		System.out.print("Which category is your hurricane?: ");
        int catg = input.nextInt();
        input.close();
        System.out.println();
        switch (catg) {
        case 1: System.out.print("The speed is: 74-95mph or 64-82kt or 119-153km/h"); break;
        case 2: System.out.print("The speed is: 96-110mph or 83-95kt or 154-177km/h"); break;
        case 3: System.out.print("The speed is: 111-130mph or 96-113kt or 178-209km/h"); break;
        case 4: System.out.print("The speed is: 131-150mph or 114-135kt or 210-249km/h"); break;
        case 5: System.out.print("The speed is: greater than 150mph or 135kt or 249km/h"); break;
        }
	}

}

