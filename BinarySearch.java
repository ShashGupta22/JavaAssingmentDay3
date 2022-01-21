package day3Java;

public class BinarySearch {
	public static void main(String args[])
	{
		int arr[]= {11, 14, 25, 30, 40, 41, 52, 57, 70};
		int left=0;
		int item=71;
		int right=arr.length-1;
		boolean found=false;
		while(! (left==right) )	
		{
			int mid=(left+right)/2;
			if(arr[mid]==item)
			{
				found=true;
				System.out.println("found");
				break;
			}
			else if(arr[mid]>item)
				right=mid-1;
			else
				left=mid+1;
		}
		if(!found)
			System.out.println("not found");
	}
}
