import java.util.*;
class TokenCounter
{
public static void main(String[] args)
{
int count=0;
String str="welcome to Java Programming";
StringTokenizer st=new StringTokenizer(str," ");
System.out.println("Tokens:");
while(st.hasMoreElements())
{
System.out.println(st.nextToken());
count++;
}
System.out.print("The no. of tokens in the string is:"+count);
}
}
