import java.util.*;
class Binary
{
public static void main(String args[])
{
int a[]=new int[20];
int i,n,key,mid,l,h;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array");
n=sc.nextInt();
System.out.println("Enter the array elements in ascending order");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter key");
key=sc.nextInt();
l=0;
h=n-1;
while(l<=h)
{
mid=(l+h)/2;
if(key==a[mid])
{
System.out.println("Element found at "+(mid+1));
break;
}
else if(key<a[mid])
h=mid-1;
else
l=mid+1;
}
if(l>h)
System.out.println("Element is not found");
}
}
