package day3Java;

public class Dupli {
	public static void main(String args[])
	{
		int arr[]= {23,22,21,40};
		int copyArray[] = new int[arr.length];
		copyArray=arr;
		int cloneArr[]=arr.clone();
		for(int k:arr)
			System.out.println(k);
		for(int k:arr)
			System.out.println(k);
		for(int k:arr)
			System.out.println(k);
	}
}
