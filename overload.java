import java.io.*;
class Test
{
	void test()
	{
		System.out.println("this is method overloading");
	}
	void test(int i)
	{
		System.out.println("the value of a="+i);
	}
	void test(int i,int j)
	{
		System.out.println("the value of a="+i+",b="+j);
	}
}
class Overload
{
	public static void main(String args[])
	{
		Test t=new Test();
		t.test();
		t.test(6);
		t.test(6,7);
	}
}