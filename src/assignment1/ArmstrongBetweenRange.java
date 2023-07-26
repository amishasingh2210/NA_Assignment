package assignment1;

public class ArmstrongBetweenRange {
	public static void main(String[] args) {
		
		for(int i=100; i<=999; i++)
		{
			int m=i;
			int temp=0;
			while(m>0)
			{
				int mod = m%10;
				temp = temp+( mod*mod*mod);
				m/=10;
			}
			if(temp == i)
				System.out.println("number is armstrog "+i);
			
		}
	}

}
