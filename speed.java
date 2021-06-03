import java.io.*;
import java.lang.*;
class speed 
{
 public static void main(String args[])
 {
  int b[]={0,0,0,0,0};
  double avg=0.0,sum=0.0;
  int i;
  for(i=0;i<5;i++)
  {
    b[i]=Integer.parseInt(args[i]);
    sum+=b[i];
  }
  avg=sum/5;
  for(i=0;i<5;i++)
  {
   if(b[i]>=avg)
    {
     System.out.println("biker"+(i+1)+"with speed"+b[i]+"is eligible");
    }
  }
 }
}