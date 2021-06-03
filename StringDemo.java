class StringDemo
{
public static void main(String args[])
{
String name="java";
String s1=new String("cse-c");
System.out.println(s1);
System.out.println(name);
char c=s1.charAt(2);
System.out.println("character at specified index"+c);
int len=s1.length();
System.out.println("length is "+len);
String res=s1.substring(1);
System.out.println(res);
}
}
