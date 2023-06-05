package demo.java;

public class moreElements {

	public static void main(String[] arg) {
		// int a[]=new int[5];
		int a[]= {100,200,300,400,500}; //wee can store any number of elements
		
		int sum=0;
		
		for(int i:a) {
			System.out.println(i);
			sum=sum+i;
		}
		
		System.out.println("sum of the elements is "  + sum);
		
		
		//System.out.println(a);
		
	}
}
