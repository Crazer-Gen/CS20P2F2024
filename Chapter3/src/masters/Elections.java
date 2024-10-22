package masters;

import java.util.Scanner;

public class Elections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables 
		int Awbrey, Martinez;
		double total, pA, pM;
        Scanner input = new Scanner(System.in);
        //guess the results for each city
        System.out.println("Elections results for New York:");
        System.out.print("Awbrey: ");
        Awbrey = input.nextInt();
        System.out.print("Martinez: ");
        Martinez = input.nextInt();
        System.out.println("");
        
        System.out.println("Elections results for New Jersey:");
        System.out.print("Awbrey: ");
        Awbrey += input.nextInt();
        System.out.print("Martinez: ");
        Martinez += input.nextInt();
        System.out.println("");
        
        System.out.println("Elections results for New Jersey:");
        System.out.print("Awbrey: ");
        Awbrey += input.nextInt();
        System.out.print("Martinez: ");
        Martinez += input.nextInt();
        System.out.println("");
        input.close();
        
        //calculate percentages
        total = Awbrey + Martinez;
        pA = (double)Awbrey / total *100;
        pM = (double)Martinez / total *100;
         
        //show all the data
        System.out.format("%-13s %8s %9s%n", "Candidate", "votes" ,"percentage");
        System.out.format("%-13s %8d %9.2f%%%n", "Awbrey", Awbrey , pA);
        System.out.format("%-13s %8d %9.2f%%%n", "Martinez", Martinez , pM);
        System.out.format("%-13s %8d%n", "TOTAL VOTES: ", Awbrey+Martinez);
	}
}
/* Screen Dump

Elections results for New York:
Awbrey: 2718
Martinez: 8174

Elections results for New Jersey:
Awbrey: 17263
Martinez: 18723

Elections results for New Jersey:
Awbrey: 91283
Martinez: 71892

Candidate        votes percentage
Awbrey          111264     52.97%
Martinez         98789     47.03%
TOTAL VOTES:    210053
 
 */