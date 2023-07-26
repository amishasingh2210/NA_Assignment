package challanges;

import java.util.Scanner;

public class DaysDifference {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dd1 = sc.nextInt();
		int mm1 = sc.nextInt();
		int yyyy1 = sc.nextInt();
		
		System.out.println("Enter second Date ");
		
		int dd2 = sc.nextInt();
		int mm2 = sc.nextInt();
		int yyyy2 = sc.nextInt();
		
		int[] tdm ={31,28,31,30,31,30,31,31,30,31,30,31};
		
		int td =0;
		int yd = yyyy2-yyyy1;
	if(yyyy2>yyyy1) {
		
		if(yyyy1%4 ==0 && yyyy1%100 ==0)
		{
			if(mm1 == 2)
			{
				td= 29-dd1;
				for(int i=mm1; i<tdm.length-1; i++)
				{
					td+=tdm[i];
				}
			}
			
		}
		else
		{
			td= tdm[mm1]-dd1;
			for(int i=mm1; i<tdm.length-1; i++)
			{
				td+=tdm[i];
			}
		}
		if(yd>1)
		{
			for(int i=0; i<yd-1;i++) {
				if(yyyy2%4==0 && yyyy2%100 == 0)
					td+=366;
				else
					td+=365;
			}
			for(int i=0; i<mm2; i++)
				td+=tdm[i];
			td= td + dd2;
			
		}
		else {
			for(int i=0; i<mm2; i++)
				td+=tdm[i];
			td= td + dd2;
		}
		
	}
	else 
	{
		if(yyyy1%4 ==0 && yyyy1%100 ==0)
		  if(mm1 == 2)
			td= 29-dd1;
		for(int i=mm1; i<mm2; i++)
			td+=tdm[i];
		td= td + dd2;
	}
	if(mm1 == mm2)
		td = dd2-dd1;
	
	System.out.println(td);
		
	}

}
