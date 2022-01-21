package day3Java;

public class StringLength {
	public static void main(String args[])
	{
		int n=0;
		String s= "length";
		char[] ch = s.toCharArray();
		for(int k:ch)
			n++;
		System.out.println(n);
	}
}
