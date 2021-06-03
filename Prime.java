import java.util.*;
class Prime
Public static void main(String args[])
{
int i,j;
for(i=2;i<=100;i++)
{
int factor=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
factor++;
}
if(factor==2)
System.out.print(i+" ");
}
}
}