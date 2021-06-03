import java.io.*;
class prime
{
 public static void main(String args[])
 {
  int n=100;
  boolean flag=true;
  int i,j;
  for(i=2;i<=n;i++)
  {
   for(j=2;j<=i/2;j++)
    {
     if(i%j==0)
     {
      flag=false;
       break;
     }
    } 
    if(flag)
    System.out.print(i+"\t");
    flag=true;
  }
 }
}