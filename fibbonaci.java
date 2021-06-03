import java.io.*;
import java.util.Scanner;
class fibonacci
{
	 public static void main(String args[])
 	{
  		int num,sum=0;
		System.out.print("enter a value:");
		Scanner scan =new Scanner(System.in);
		num=scan.nextInt();
		int a=0,b=1,c;
 		while(a+b<num)
		{
			c=a+b;
			if(c%2==0)
			{
				System.out.println("Even number is:\t"+c);
				sum+=c;
			}
 			a=b;
			b=c;
		}
 		System.out.println("Sum of even numbers is:"+sum);
	}
}		