package Longest_subsequences;
import java.util.Scanner;
public class Subsequences_Long 
{
	static public void longest(int ar1[],int l)
	{
		int list1[]=new int[l]; 
		list1[0] = 1; 

		for (int i = 1; i < l; i++ ) 
		{ 
			list1[i] = 1; 
			for (int j = 0; j < i; j++ ) 
				if ( ar1[i] > ar1[j] && list1[i] < list1[j] + 1) 
					list1[i] = list1[j] + 1; 
		} 
	        int max = list1[0];
	        for ( int i = 1; i < list1.length; i++)
	            if (list1[i] > max)
	                max = list1[i];
	        System.out.println("The Longest subsequences is : "+max);
	}
	public static void main(String [] args)
	{
		 System.out.println("Enter the Size of an array");
		 Scanner a=new Scanner(System.in);
		 int b=a.nextInt();
		 int arr[]=new int[b];
		 for(int i=0;i<b;i++)
		 {
			 arr[i]=a.nextInt();
		 }
		 longest(arr,b);
	}
}
