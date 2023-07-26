package assignment1;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int temp=0;
		while(m>0)
		{
			int mod = m%10;
			temp = temp+( mod*mod*mod);
			m/=10;
		}
		if(temp == n)
			System.out.println("number is armstrog "+n);
		else
			System.out.println("number is not armstrog ");
	}

}
