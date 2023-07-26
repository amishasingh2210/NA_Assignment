package assignment1;

import java.util.Scanner;

public class CalculateInterest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount rate and time: ");
		int p = sc.nextInt();
		int r= sc.nextInt();
		int t= sc.nextInt();
		
		int si= p*r/100*t;
		 
		int cr = 1+r/100;
		for(int i=0; i<t; i++)
			t*=cr;
		int ci = p*t;
		
		System.out.println("simple interest "+ si);
		System.out.println("simple interest "+ ci);
	}

}
