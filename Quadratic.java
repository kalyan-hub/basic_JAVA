import java.util.Scanner;
class Quadratic
{
public static void main(String arg[])
{
double a,b,c;
double deno,D,r1,r2;
Scanner s=new Scanner(System.in);
System.out.println("Enter a,b,c values :");
a=s.nextDouble();
b=s.nextDouble();
c=s.nextDouble();
System.out.println("The quadratic equation is "+a+"x2+"+b+"x+"+c);
D=(b*b)-(4*a*c);
if(D==0)
{
deno=Math.sqrt((b*b)-(4*a*c));
r1=(-b+deno)/(2*a);
r2=(-b-deno)/(2*a);
System.out.println("Roots are real and equal ");
System.out.println("Roots are ");
System.out.println(r1);
System.out.println(r2);
}
else if(D>0)
{
deno=Math.sqrt((b*b)-(4*a*c));
r1=(-b+deno)/(2*a);
r2=(-b-deno)/(2*a);
System.out.println("Roots are real and distinct ");
System.out.println("Roots are ");
System.out.println(r1);
System.out.println(r2);
}
else if(D<0)
{
System.out.println("Roots are imaginary");
double real,imag;
real=-b/(2*a);
deno=Math.sqrt(-D);
imag=deno/2*a;
System.out.format("Root1=%.2f+%.2fi",real,imag);
System.out.format("Root1=%.2f-%.2fi",real,imag);
}
}
}

