package assignment1;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks :");
		int n[] = new int[3];
		for(int i=0; i<3; i++)
		   n[i] = sc.nextInt();
		int a=0;
		int b=0;
		for(int i=0; i<3; i++)
		{
			if(n[i]>60)
				a++;
		
		}
		if(a==3)
			System.out.println("pass");
		else if(a==2)
			System.out.println("promoted");
		else
			System.out.println("fail");
		
			
		
	}
}
