class Box
{
float l,b,h;
Box(float l,float b,float h);
{
this l=l;
this b=b;
this h=h;
}
void volume()
{
System.out.println("volume =",+l*b*h);
}
}
class Th
{
public static void main(String args[])
{
Box b=new Box(56.4f,23.4f,85.2f);
b.volume();
}
}