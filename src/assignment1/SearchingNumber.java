package assignment1;

public class SearchingNumber {
	public static void main(String[] args) {
		
		int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int flag=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == 19) {
				flag =1;
				break;
			}
				
		}
		if(flag == 1)
			System.out.println("number found ");
		else
			System.out.println("number not found ");
	}

}
