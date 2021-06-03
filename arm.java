import java.io.*;
import java.util.Scanner;
import java.lang.*;
class armstrong
{ 
	public static void main(String args[])
        {
		int num,sum=0,n,temp;
		System.out.print("enter a value:");
		Scanner scan =new Scanner(System.in);
		num=scan.nextInt();
		n=num;
		while(n>0)
  		{
			temp=n%10;
			sum=sum+temp*temp*temp;
			n=n/10;
		}
 		if(num==sum)
		System.out.println(num+"is armstrong number");
		else
		System.out.println(num+"is not armstrong number");
	}
}
	