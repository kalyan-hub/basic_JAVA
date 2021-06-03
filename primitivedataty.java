class datatype
{
 public static void main(String args[])
 {
  byte b=127;
  short s=32767;
  int i=30000;
  float f=(float)4.2;
  double d=4.5;
  char ch=97;
  boolean bl=Boolean.parseBoolean(args[0]);
  if(bl)
  {
   System.out.println("b="+b+","+"s="+s+","+"i="+i);
  }
  else
  {
   System.out.println("f="+f+","+"d="+d+","+"ch="+ch);
  }
 }
}
