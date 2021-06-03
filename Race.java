import java.util.Scanner;
class Race
{
public static void main(String args[])
{
float a[]=new float[5],sum=0,avg;
int i;
System.out.println("enter speed :");
Scanner s=new Scanner(System.in);
for(i=0;i<5;i++)
{
a[i]=s.nextFloat();
sum=sum+a[i];
}
avg=sum/5;
for(i=0;i<5;i++)
{
if(a[i]>=avg)
{
System.out.println(a[i]+" is qualified");
}
}
}
}
