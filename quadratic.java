import java.io.*;
import java.lang.*;
class quad
{
 public static void main(String args[])
 {
  double d,a,b,c,x1,x2;
  a=Double.parseDouble(args[0]);
  b=Double.parseDouble(args[1]);
  c=Double.parseDouble(args[2]);
  d=(b*b)-(4*a*c);
  if(d==0)
  {
   System.out.println("roots are real and equal");
   x1=x2=-b/(2*a);
   System.out.println("x1=x2="+x1);
  }
  else if(d>0)
  {
   System.out.println("roots are real and unequal");
   x1=(-b+Math.sqrt(d))/(2*a);
   x2=(-b-Math.sqrt(d))/(2*a);
   System.out.println("x1="+x1+"x2="+x2);
  }
  else
  {
    System.out.println("roots are imaginary");
  }
 }
}