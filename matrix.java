import java.util.Scanner;
class matrix
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a[][],b[][],c[][];
		int p,q,i,j,k,x,y,ch=0;
		System.out.println("enter the number of rows and columns of matrix 1");
		p=scan.nextInt();
		q=scan.nextInt();
		a=new int[p][q];
		System.out.println("enter the first matrix elements");
		for(i=0;i<p;i++)
		   for(j=0;j<q;j++){
		      a[i][j]=scan.nextInt();}
		System.out.println("enter the number of rows and columns of matrix 2");
		x=scan.nextInt();
		y=scan.nextInt();
		b=new int[x][y];
		System.out.println("enter the second matrix elements");
		for(i=0;i<x;i++)
		   for(j=0;j<y;j++){
		      b[i][j]=scan.nextInt();}
		System.out.println("\nthe first matrix:");
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			    	System.out.print(a[i][j]+"\t");
			System.out.print("\n");
		}
		System.out.println("\nthe second matrix:");
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			    	System.out.print(b[i][j]+"\t");
			System.out.print("\n");
		}
		while(ch!=3)
		{
			System.out.println("menu");
			System.out.println("1.addition\n2.multiplication\n3.exit");
			System.out.println("enter the choice");
			ch=scan.nextInt();
			if(ch==1)
			{
				if((p==x)&&(q==y))
				{
					c=new int[p][q];
					System.out.println("the addition matrix is :");
	  				for(i=0;i<p;i++)
					{
						for(j=0;j<q;j++)
						{
							c[i][j]=a[i][j]+b[i][j];
			    				System.out.print(c[i][j]+"\t");
						}
						System.out.print("\n");
					}
				}
				else
				System.out.println("matrix addition is not possible");
			}
			else if(ch==2)
			{
				if(q==x)
				{
					c=new int[p][y];
					System.out.println("\nthe multiplication matrix is :");
					for(i=0;i<p;i++)
					{
						for(j=0;j<y;j++)
						{
							c[i][j]=0;
							for(k=0;k<q;k++)
								c[i][j]=c[i][j]+a[i][k]*b[k][i];
							System.out.print(c[i][j]+"\t");
						}
						System.out.print("\n");
					}
				}
				else
				System.out.println("matrix multiplication is not possible");
			}
			else if(ch==3)
		    		System.out.println("Exit");
			else
				System.out.println("Invalid option");
		}
	}
}