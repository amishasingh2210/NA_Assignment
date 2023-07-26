package assignment1;

public class BubbleSort {
	public static void main(String[] args)
	{

		int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int n = arr.length;
		int temp=0;
		for(int i=0; i<n-1; i++) {
			int flag=0;
			for(int j=0; j<n-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					 temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
		for(int i=0; i<arr.length; i++)
		  System.out.print(arr[i]+" ");
	}

}


