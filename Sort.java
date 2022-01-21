package day3Java;

public class Sort 
{
	public static void main(String args[])
	{
		int arr[]= {23,51,60,46,62,12,10};
		boolean sorted=false;
		for(int i=arr.length-1;i>=0  && !sorted;i--)
		{
			sorted=true;
			for(int j=0;j<=i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					sorted=false;
				}
			}
		}
		for(int k:arr)
			System.out.println(k);
	}
}
