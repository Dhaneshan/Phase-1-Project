package Caculator;

import java.util.Scanner;

public class Calculator
{

		public  void dispaly(int a1,int b1)
		{
			System.out.println("Enter the choice for Arthimetic Calculation : " + "\n"+"1.Addition"+ "\n"+"2.Subraction"+ "\n"+"3.Multiplication"+ "\n"+"4.Division"+ "\n"+"5.Exit");
			Scanner ans1=new Scanner(System.in);
			int c=ans1.nextInt();
			switch(c)
			{
			case 1:  System.out.println("Addition of two numbers are :"+(a1+b1));
			         break;
			case 2:  System.out.println("Subraction of two numbers are :"+(a1-b1));
	                 break;
			case 3:  System.out.println("Multiplication of two numbers are :"+(a1*b1));
	                 break;
			case 4:  if(b1==0)
				       System.out.println("Zero Division Error");
			         else
				        System.out.println("Division of two numbers are :"+(a1/b1));
	                 break;
			case 5: System.exit(0);
			}
			
	
		}
    public static void main(String [] args)
    {
    	System.out.println("Enter the two Number for Arthimetic Caculation.");
    	Scanner ans=new Scanner(System.in);
    	System.out.println("Enter the value of a :");
    	int a=ans.nextInt();
    	System.out.println("Enter the value of b :");
    	int b=ans.nextInt();
    	Calculator asmd=new Calculator();
    	asmd.dispaly(a, b);

    }
}
