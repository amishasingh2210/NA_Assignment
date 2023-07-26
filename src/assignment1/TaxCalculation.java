package assignment1;

import java.util.Scanner;

public class TaxCalculation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		
		if(sal<180000)
			System.out.println("NIL");
		else if(sal>180000 && sal <=300000) {
			System.out.println("tax :" + sal*.1);
		}
		else if(sal > 300000 && sal <=500000 ) {
			System.out.println("tax :" + sal*.2);
		}
		else 
			System.out.println("tax :" + sal*.3);
	}

}
