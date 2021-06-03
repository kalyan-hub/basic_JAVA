import java.util.*;
class Array2d
{
public static void main(String arg[])
{
int row,column;
Scanner s=new Scanner(System.in);
System.out.print("Enter column and row size");
row=s.nextInt();
column=s.nextInt();
double matrix[][]=new double[row][column];
System.out.println("Enter elements ");
for(int i=0;i<row;i++)
{
for(int j=0;j<column;j++)
{
matrix[i][j]=s.nextDouble();
}
}
System.out.println("The given matrix is :");
for(int i=0;i<row;i++)
{
for(int j=0;j<column;j++)
{
System.out.println(matrix[i][j]);
}
}
}
}
write a java program to implement matrix addition and multiplication