import java.util.Scanner;
public class Strsort
{
public static void main(String[] input)
{
int i,n,j;
String temp;
Scanner scan=new Scanner(System.in);
String names[]=new String[20];
System.out.print("Enter size");
n=scan.nextInt();
System.out.print("Enter 5 names/words:");
for(i=0;i<n;i++)
{
names[i]=scan.next();
}
System.out.println("\nSorting Words/Names");
for(i=0;i<n-1;i++)
{
for(j=0;j<n-1-i;j++)
{
if(names[j].compareTo(names[j+1])>0)
{
temp=names[j];
names[j]=names[j+1];
names[j+1]=temp;
}
}
}
System.out.println("Words/Names sorted in Alphabetical order Successfully..!!");
for(i=0;i<n;i++)
{
System.out.println(names[i]);
}
}
}
