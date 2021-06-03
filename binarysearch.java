import java.util.Scanner;
public class binarysearch
{
	public static void main(String args[])
	{
		int n,key,i,first,last,middle;
		int arr[]=new int[50];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of elements");
		n=scan.nextInt();
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter a number to search:");
		key=scan.nextInt();
		first=0;
		last=n-1;
		middle=(first+last)/2;
		while(first<=last)
		{
			if(arr[middle]<key)
			{
				first=middle+1;
			}
			else if(arr[middle]>key)
			{
				last=middle-1;
			}
			else
                                               {
				System.out.println("search element is:"+arr[middle]+"found");
				break;
                                               }
			middle=(first+last)/2;
		}
	}
}				