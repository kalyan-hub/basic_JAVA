import java.io.*;
class Box
{
	double length;
	double width;
 	double depth;
	Box(double a,double b,double c)
	{
		length=a;
		width=b;
		depth=c;
	}
	void volume()
	{
		System.out.println("volume of box is:"+length*width*depth);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Box b=new Box(5,4,2);
		b.volume();
	}
}	
		